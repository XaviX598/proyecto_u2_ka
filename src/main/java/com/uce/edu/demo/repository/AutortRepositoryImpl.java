package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.manytomany.tarea.Autort;

@Repository
@Transactional
public class AutortRepositoryImpl implements IAutortRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Autort autort) {
		// TODO Auto-generated method stub
		this.entityManager.persist(autort);
	}

}
