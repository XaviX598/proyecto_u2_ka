package com.uce.edu.demo.onetomany.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.onetomany.tarea.Desarrolladora;
@Repository
@Transactional
public class DesarrolladoraRepositoryImpl implements IDesarrolladoraRepository{
	
	@PersistenceContext
	private EntityManager entityManager;
	

	@Override
	public void insertar(Desarrolladora desarrolladora) {
		// TODO Auto-generated method stub
		this.entityManager.persist(desarrolladora);
	}

	@Override
	public void actualizar(Desarrolladora desarrolladora) {
		// TODO Auto-generated method stub
		this.entityManager.merge(desarrolladora);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Desarrolladora d= this.buscarPorId(id);
		this.entityManager.remove(d);
		
	}

	@Override
	public Desarrolladora buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Desarrolladora.class, id);
	}

}
