package com.uce.edu.demo.repository;

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

import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.repository.modelo.PersonaContadorGenero;
import com.uce.edu.demo.repository.modelo.PersonaSencilla;

@Repository
@Transactional
public class PersonaJpaRepositoryImpl implements IPersonaJpaRepository {

	// anotacion para la interfaz ya que EntityManager es una interfaz para manejo
	// de entidades
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Persona buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Persona.class, id);
	}

	@Override
	public void insertar(Persona p) {
		// TODO Auto-generated method stub
		this.entityManager.persist(p);
	}

	@Override
	public void actualizar(Persona p) {
		// TODO Auto-generated method stub
		this.entityManager.merge(p);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Persona persona = this.buscarPorId(id);
		this.entityManager.remove(persona);
	}

	@Override
	public Persona buscarPorCedula(String cedula) {
		// SELECT * FROM persona Where pers_cedula='545465646'
		// Query de javax.persistence
		// this.entyty... es para acceder a la base y en create ponemos el que permite
		// enviar un String y despues de : va un nombre de variable
		Query jpqlQuery = this.entityManager.createQuery("SELECT p FROM Persona p WHERE p.cedula = :datoCedula");
		// setParameter ..cedula..cedula escogemos String name y object value
		jpqlQuery.setParameter("datoCedula", cedula);
		// getSingle.... nos da un objeto de tipo Persona
		return (Persona) jpqlQuery.getSingleResult();
	}

	@Override
	public Persona buscarPorCedulaTyped(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Persona> miTypedQuery = this.entityManager
				.createQuery("SELECT p FROM Persona p WHERE p.cedula = :datoCedula", Persona.class);
		miTypedQuery.setParameter("datoCedula", cedula);
		return miTypedQuery.getSingleResult();
	}

	@Override
	public Persona buscarPorCedulaNamed(String cedula) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Persona.buscarPorCedula", Persona.class);
		myQuery.setParameter("datoCedula", cedula);
		return (Persona) myQuery.getSingleResult();
	}

	@Override
	public Persona buscarPorCedulaTypedNamed(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Persona> myQuery = this.entityManager.createNamedQuery("Persona.buscarPorCedula", Persona.class);
		myQuery.setParameter("datoCedula", cedula);
		return myQuery.getSingleResult();
	}

	@Override
	public Persona buscarPorCedulaNative(String cedula) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery("SELECT * FROM persona Where pers_cedula=:datoCedula",
				Persona.class);
		myQuery.setParameter("datoCedula", cedula);
		return (Persona) myQuery.getSingleResult();
	}

	@Override
	public Persona buscarPorCedulaNamedNative(String cedula) {
		TypedQuery<Persona> myQuery = this.entityManager.createNamedQuery("Persona.buscarPorCedulaNative",
				Persona.class);
		myQuery.setParameter("datoCedula", cedula);
		return myQuery.getSingleResult();
	}

	@Override
	// Creamos una instancia de la interfaz Criteria Builder Fabrica para construir
	// el SQl
	public Persona buscarPorCedulaCriteriaApi(String cedula) {
		// SELECT p FROM Persona p WHERE p.cedula = :datoCedula
		CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();
		// Especificamos el retorno de mi SQL
		CriteriaQuery<Persona> myQuery = myBuilder.createQuery(Persona.class);
		// Aqui empezamos a construir el SQL
		// Root FROM es la tabla con la que va a trabajar
		Root<Persona> personaFrom = myQuery.from(Persona.class);
		// myQuery.select(personaRoot)//Select p FROM Persona
		// Las condiciones where en criteria API se los conoce como predicados
		Predicate p1 = myBuilder.equal(personaFrom.get("cedula"), cedula);// p.cedula=:DatoCedula

//		CriteriaQuery<Persona> myQueryCompleto = myQuery.select(personaFrom).where(p1);
//		TypedQuery<Persona> myQueryFinal=  this.entityManager.createQuery(myQueryCompleto);
		// ó
		myQuery.select(personaFrom).where(p1);
		// Finalizando el query completo
		TypedQuery<Persona> myQueryFinal = this.entityManager.createQuery(myQuery);

		return myQueryFinal.getSingleResult();
	}

	@Override
	public Persona buscarDinamicamente(String nombre, String apellido, String genero) {
		// SELECT p FROM Persona p WHERE p.cedula = :datoCedula
		CriteriaBuilder myCriteria = this.entityManager.getCriteriaBuilder();
		// Especificamos el retorno de mi SQL
		CriteriaQuery<Persona> myQuery = myCriteria.createQuery(Persona.class);
		// Aqui empezamos a construir el SQL
		// Root FROM es la tabla con la que va a trabajar
		Root<Persona> myTabla = myQuery.from(Persona.class);
		// myQuery.select(personaRoot)//Select p FROM Persona
		// Las condiciones where en criteria API se los conoce como predicados
		// pers_nombre='Diana'
		Predicate predicadoNombre = myCriteria.equal(myTabla.get("nombre"), nombre);
		// pers_nombre='Muñoz'
		Predicate predicadoApellido = myCriteria.equal(myTabla.get("apellido"), apellido);

		Predicate miPredicadoFinal = null;
		if (genero.equals("M")) {
			// ejemplo:
			// Predicate miPredicadoFecha =myCriteria.equal(myTabla.get("fecha"),"fecha");
			// Predicate miPredicadoFinal
			// =myCriteria.and(predicadoNombre,predicadoApellido,predicadomiPredicadoFecha);
			// para las conidciones de nombre y apellido
			miPredicadoFinal = myCriteria.and(predicadoNombre, predicadoApellido);
		} else {
			// predicado de genero
			miPredicadoFinal = myCriteria.or(predicadoNombre, predicadoApellido);
		}

//		CriteriaQuery<Persona> myQueryCompleto = myQuery.select(personaFrom).where(p1);
//		TypedQuery<Persona> myQueryFinal=  this.entityManager.createQuery(myQueryCompleto);
// ó
		myQuery.select(myTabla).where(miPredicadoFinal);
// Finalizando el query completo
		TypedQuery<Persona> myQueryFinal = this.entityManager.createQuery(myQuery);

		return myQueryFinal.getSingleResult();
	}

//	@Override
//	public Persona buscarDinamicamentePredicadoGenero(String nombre, String apellido, String genero) {
//		// SELECT p FROM Persona p WHERE p.cedula = :datoCedula
//		CriteriaBuilder myCriteria = this.entityManager.getCriteriaBuilder();
//		// Especificamos el retorno de mi SQL
//		CriteriaQuery<Persona> myQuery = myCriteria.createQuery(Persona.class);
//		// Aqui empezamos a construir el SQL
//		// Root FROM es la tabla con la que va a trabajar
//		Root<Persona> myTabla = myQuery.from(Persona.class);
//		// myQuery.select(personaRoot)//Select p FROM Persona
//		// Las condiciones where en criteria API se los conoce como predicados
//		// pers_nombre='Diana'
//		Predicate predicadoNombre = myCriteria.equal(myTabla.get("nombre"), nombre);
//		// pers_nombre='Muñoz'
//		Predicate predicadoApellido = myCriteria.equal(myTabla.get("apellido"), apellido);
//		Predicate predicadoGenero = myCriteria.equal(myTabla.get("genero"), genero);
//		Predicate miPredicadoFinal = null;
//		if (genero.equals("M")) {
//			// ejemplo:
//			// Predicate miPredicadoFecha =myCriteria.equal(myTabla.get("fecha"),"fecha");
//			// Predicate miPredicadoFinal
//			// =myCriteria.and(predicadoNombre,predicadoApellido,predicadomiPredicadoFecha);
//			// para las conidciones de nombre y apellido
//			miPredicadoFinal = myCriteria.and(predicadoNombre, predicadoApellido);
//			miPredicadoFinal = myCriteria.and(miPredicadoFinal, predicadoGenero);
//		} else {
//			// predicado de genero
//			miPredicadoFinal = myCriteria.or(predicadoNombre, predicadoApellido);
//			miPredicadoFinal = myCriteria.or(miPredicadoFinal, predicadoGenero);
//		}

//				CriteriaQuery<Persona> myQueryCompleto = myQuery.select(personaFrom).where(p1);
//				TypedQuery<Persona> myQueryFinal=  this.entityManager.createQuery(myQueryCompleto);
//		// ó
//		myQuery.select(myTabla).where(miPredicadoFinal);
//		// Finalizando el query completo
//		TypedQuery<Persona> myQueryFinal = this.entityManager.createQuery(myQuery);
//
//		return myQueryFinal.getSingleResult();
//	}

	@Override
	public List<Persona> buscarPorGenero(String genero) {
		Query myQuery = this.entityManager.createQuery("SELECT p FROM Persona p WHERE p.genero = :datoGenero");
		myQuery.setParameter("datoGenero", genero);
		return myQuery.getResultList();
	}

	@Override
	public List<Persona> buscarPorApellido(String apellido) {
		Query myQuery = this.entityManager.createQuery("SELECT p FROM Persona p WHERE p.apellido = :datoApellido");
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getResultList();
	}

	@Override
	public List<PersonaSencilla> buscarPorApellidoSenciloo(String apellido) {
		TypedQuery<PersonaSencilla> myQuery = this.entityManager.createQuery(
				"SELECT NEW com.uce.edu.demo.repository.modelo.PersonaSencilla(p.nombre,p.apellido) FROM Persona p WHERE p.apellido = :datoApellido",
				PersonaSencilla.class);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getResultList();
	}

	@Override
	public List<PersonaContadorGenero> consultarCantidadPorGenero() {
		// sentencias de agregacion en base de datos
		// numero de personas que hay dentro de los generos
		// SELECT pers_genero, count(pers_genero)
		// FROM public.persona group by pers_genero;
		TypedQuery<PersonaContadorGenero> myQuery = this.entityManager.createQuery(
				"SELECT NEW com.uce.edu.demo.repository.modelo.PersonaContadorGenero(p.genero, COUNT(p.genero)) FROM Persona p GROUP BY p.genero",
				PersonaContadorGenero.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Persona> buscarPorNombre(String nombre) {
		Query myQuery = this.entityManager.createQuery("SELECT p FROM Persona p WHERE p.nombre = :datoNombre");
		myQuery.setParameter("datoNombre", nombre);
		return myQuery.getResultList();
	}

	@Override
	public int actualizarPorApellido(String genero, String apellido) {
		// update persona set pers_genero='F' where pers_apellido='Matamoros'
		Query myQuery = this.entityManager
				.createQuery("UPDATE Persona p SET p.genero = :datoGenero WHERE p.apellido = :datoApellido");
		myQuery.setParameter("datoGenero", genero);
		myQuery.setParameter("datoApellido", apellido);

		// executeUpdate devuelve un entero que es el numero de actualizaciones que se
		// hizo
		return myQuery.executeUpdate();

	}

	@Override
	public List<Persona> buscarPorNombreApellido(String nombre, String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Persona> myQuery = this.entityManager.createNamedQuery("Persona.buscarPorNombreApellido",
				Persona.class);
		myQuery.setParameter("datoNombre", nombre);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getResultList();
	}

	@Override
	public int eliminarPorGenero(String genero) {
		Query myQuery = this.entityManager.createQuery("DELETE FROM Persona p WHERE p.genero = :datoGenero");
		myQuery.setParameter("datoGenero", genero);
		// executeUpdate devuelve un entero que es el numero de eliminaciones que se
		// hizo
		return myQuery.executeUpdate();
	}

}
