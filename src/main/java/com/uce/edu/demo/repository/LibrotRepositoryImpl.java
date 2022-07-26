package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.manytomany.tarea.Librot;

@Repository
@Transactional
public class LibrotRepositoryImpl implements ILibrotRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Librot librot) {
		// TODO Auto-generated method stub
		this.entityManager.persist(librot);
	}

}
