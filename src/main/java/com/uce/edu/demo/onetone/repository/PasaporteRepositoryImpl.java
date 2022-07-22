package com.uce.edu.demo.onetone.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.onetone.repository.modelo.Pasaporte;
@Repository
@Transactional
public class PasaporteRepositoryImpl implements IPasaporteRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Pasaporte p) {
		// TODO Auto-generated method stub
		this.entityManager.persist(p);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Pasaporte p = this.buscarPorId(id);
		this.entityManager.remove(p);
	}

	@Override
	public void actualizar(Pasaporte p) {
		// TODO Auto-generated method stub
		this.entityManager.merge(p);
	}

	@Override
	public Pasaporte buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Pasaporte.class, id);
	}

}
