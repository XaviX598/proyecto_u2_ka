package com.uce.edu.demo.prueba.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.prueba.repository.modelo.Propietario;

@Repository
@Transactional
public class PropietrarioRepositoryImpl implements IPropietrarioRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void crear(Propietario p) {
		this.entityManager.persist(p);

	}

	@Override
	public int eliminar(String cedula) {
		Query myQuery = this.entityManager.createQuery("DELETE FROM Propietario p WHERE p.cedula = :datoCedula");
		myQuery.setParameter("datoCedula", cedula);
		// executeUpdate devuelve un entero que es el numero de eliminaciones que se
		// hizo
		return myQuery.executeUpdate();

	}
	
	

	@Override
	public Propietario consultar(String cedula) {
		Query jpqlQuery = this.entityManager.createQuery("SELECT p FROM Propietario p WHERE p.cedula = :datoCedula");

		jpqlQuery.setParameter("datoCedula", cedula);

		return (Propietario) jpqlQuery.getSingleResult();

	}

	@Override
	public void eliminarPorID(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
