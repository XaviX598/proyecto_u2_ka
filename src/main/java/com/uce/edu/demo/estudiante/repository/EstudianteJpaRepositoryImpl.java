package com.uce.edu.demo.estudiante.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.estudiante.repository.modelo.Estudiante;
import com.uce.edu.demo.estudiante.repository.modelo.EstudianteContadoEdadApellido;
import com.uce.edu.demo.estudiante.repository.modelo.EstudianteSencillo;
import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.repository.modelo.PersonaContadorGenero;
import com.uce.edu.demo.repository.modelo.PersonaSencilla;

@Repository
@Transactional
public class EstudianteJpaRepositoryImpl implements IEstudianteJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void ingresar(Estudiante e) {
		// TODO Auto-generated method stub
		this.entityManager.persist(e);
	}

	@Override
	public Estudiante buscar(int id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Estudiante.class, id);
	}

	@Override
	public void actualizar(Estudiante e) {
		// TODO Auto-generated method stub
		this.entityManager.merge(e);
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		Estudiante estudiante = this.buscar(id);
		this.entityManager.remove(estudiante);
	}

	@Override
	public List<Estudiante> buscarPorEdadTyped(int edad) {
		TypedQuery<Estudiante> miTypedQuery = this.entityManager
				.createQuery("SELECT e FROM Estudiante e WHERE e.edad = :datoEdad", Estudiante.class);
		miTypedQuery.setParameter("datoEdad", edad);
		return miTypedQuery.getResultList();
	}

	@Override
	public Estudiante buscarPorCorreoTyped(String correo) {
		TypedQuery<Estudiante> miTypedQuery = this.entityManager
				.createQuery("SELECT e FROM Estudiante e WHERE e.correo = :datoCorreo", Estudiante.class);
		miTypedQuery.setParameter("datoCorreo", correo);
		return miTypedQuery.getSingleResult();
	}

	@Override
	public List<Estudiante> buscarPorNombreApellidoNamed(String nombre, String apellido) {
		Query myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombreApellido");
		myQuery.setParameter("datoNombre", nombre);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorNombreEdadNamed(String nombre, int edad) {
		Query myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombreEdad");
		myQuery.setParameter("datoNombre", nombre);
		myQuery.setParameter("datoEdad", edad);
		return myQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorApellidoEdadTypedNamed(String apellido, int edad) {
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorApellidoEdad",
				Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);
		myQuery.setParameter("datoEdad", edad);
		return myQuery.getResultList();
	}

	@Override
	public Estudiante buscarPorNombreCorreoTypedNamed(String nombre, String correo) {
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombreCorreo",
				Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		myQuery.setParameter("datoCorreo", correo);
		return myQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorCorreoNative(String correo) {
		Query myQuery = this.entityManager.createNativeQuery("SELECT * FROM estudiante Where estu_correo=:datoCorreo",
				Estudiante.class);
		myQuery.setParameter("datoCorreo", correo);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public List<Estudiante> buscarPorNombreNative(String nombre) {
		Query myQuery = this.entityManager.createNativeQuery("SELECT * FROM estudiante Where estu_nombre=:datoNombre",
				Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		return myQuery.getResultList();
	}

	@Override
	public Estudiante buscarPorApellidoCorreoNamedNative(String apellido, String correo) {
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorApellidoCorreoNative",
				Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);
		myQuery.setParameter("datoCorreo", correo);
		return myQuery.getSingleResult();
	}

	@Override
	public List<Estudiante> buscarPorNombreApellidoNamedNative(String nombre, String apellido) {
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombreNativeApellido",
				Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getResultList();
	}

	@Override
	public List<Estudiante> busquedaDinamicaNombreApellidoEdad(String nombre, String apellido, int edad) {
//		SELECT estu_id, estu_apellido, estu_correo, estu_edad, estu_nombre
//		FROM public.estudiante WHERE (estu_nombre='nombre' and estu_apellido='apellido') or estu_edad >'edad';

		CriteriaBuilder myCriteria = this.entityManager.getCriteriaBuilder();

		CriteriaQuery<Estudiante> myQuery = myCriteria.createQuery(Estudiante.class);

		Root<Estudiante> myTabla = myQuery.from(Estudiante.class);

		Predicate predicadoNombre = myCriteria.equal(myTabla.get("nombre"), nombre);

		Predicate predicadoApellido = myCriteria.equal(myTabla.get("apellido"), apellido);

		Predicate predicadoEdad = myCriteria.greaterThan(myTabla.get("edad"), edad);
		Predicate miPredicadoNombreApellido = null;

		Predicate miPredicadoFinal = null;

		miPredicadoNombreApellido = myCriteria.and(predicadoNombre, predicadoApellido);
		miPredicadoFinal = myCriteria.or(miPredicadoNombreApellido, predicadoEdad);

		myQuery.select(myTabla).where(miPredicadoFinal);

		TypedQuery<Estudiante> myQueryFinal = this.entityManager.createQuery(myQuery);

		return myQueryFinal.getResultList();
	}

	@Override
	public List<Estudiante> busquedaDinamicaIdCorreo(int id, String correo) {
//		SELECT estu_id, estu_apellido, estu_correo, estu_edad, estu_nombre
//		FROM public.estudiante WHERE  estu_id >'4' or estu_correo='kevinjkevps4@gmail.com';

		CriteriaBuilder myCriteria = this.entityManager.getCriteriaBuilder();

		CriteriaQuery<Estudiante> myQuery = myCriteria.createQuery(Estudiante.class);

		Root<Estudiante> myTabla = myQuery.from(Estudiante.class);

		Predicate predicadoId = myCriteria.equal(myTabla.get("id"), id);

		Predicate predicadoCorreo = myCriteria.equal(myTabla.get("correo"), correo);

		Predicate miPredicadoFinal = null;

		miPredicadoFinal = myCriteria.or(predicadoId, predicadoCorreo);

		myQuery.select(myTabla).where(miPredicadoFinal);

		TypedQuery<Estudiante> myQueryFinal = this.entityManager.createQuery(myQuery);

		return myQueryFinal.getResultList();
	}

	@Override
	public List<EstudianteSencillo> busquedaApellidoCorreo( String apellido) {
		TypedQuery<EstudianteSencillo> myQuery = this.entityManager.createQuery(
				"SELECT NEW com.uce.edu.demo.estudiante.repository.modelo.EstudianteSencillo( e.apellido,e.correo) FROM Estudiante e WHERE  e.apellido = :datoApellido",
				EstudianteSencillo.class);
		
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getResultList();
	}

	@Override
	public List<EstudianteContadoEdadApellido> consultarEdadConApellido(String apellido) {
		// sentencias de agregacion en base de datos
		// numero de estudiantes con el mismo apellido agrupados por edad
		// SELECT estu_genero, count(estu_genero)
		// FROM public.estudiante WHERE estu_edad<=? group by pers_genero;
		TypedQuery<EstudianteContadoEdadApellido> myQuery = this.entityManager.createQuery(
				"SELECT NEW com.uce.edu.demo.estudiante.repository.modelo.EstudianteContadoEdadApellido(e.edad,COUNT(e.edad)) FROM Estudiante e  WHERE e.apellido = :datoApellido GROUP BY e.edad",
				EstudianteContadoEdadApellido.class);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getResultList();
	}

}
