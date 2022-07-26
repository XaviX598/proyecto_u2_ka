package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.manytomany.tarea.Librot_Autort;

@Repository
@Transactional
public class LibrotAutortRepositoryImpl implements ILibrotAutortRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Librot_Autort librot_Autort) {
		// TODO Auto-generated method stub
		this.entityManager.persist(librot_Autort);
	}

	

}
