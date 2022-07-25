package com.uce.edu.demo.onetomany.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.onetomany.tarea.Videojuego;

@Repository
@Transactional
public class VideojuegoRepositoryImpl implements IVideojuegoRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Videojuego videojuego) {
		// TODO Auto-generated method stub
		this.entityManager.persist(videojuego);
	}

	@Override
	public void actualizar(Videojuego videojuego) {
		// TODO Auto-generated method stub
		this.entityManager.merge(videojuego);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Videojuego v = this.buscarPorId(id);
		this.entityManager.remove(v);
	}

	@Override
	public Videojuego buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Videojuego.class, id);
	}

}
