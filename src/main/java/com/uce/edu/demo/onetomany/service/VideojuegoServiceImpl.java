package com.uce.edu.demo.onetomany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.onetomany.repository.IVideojuegoRepository;
import com.uce.edu.demo.repository.modelo.onetomany.tarea.Videojuego;

@Service
public class VideojuegoServiceImpl implements IVideojuegoService{
	
	@Autowired
	private IVideojuegoRepository iVideojuegoRepository;

	@Override
	public void insertar(Videojuego videojuego) {
		// TODO Auto-generated method stub
		this.iVideojuegoRepository.insertar(videojuego);
	}

	@Override
	public void actualizar(Videojuego videojuego) {
		// TODO Auto-generated method stub
		this.iVideojuegoRepository.actualizar(videojuego);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iVideojuegoRepository.eliminar(id);
	}

	@Override
	public Videojuego buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.iVideojuegoRepository.buscarPorId(id);
	}

}
