package com.uce.edu.demo.onetomany.repository;

import com.uce.edu.demo.repository.modelo.onetomany.tarea.Videojuego;

public interface IVideojuegoRepository {
	
	public void insertar(Videojuego videojuego);
	
	public void actualizar(Videojuego videojuego);
	
	public void eliminar(Integer id);
	
	public Videojuego buscarPorId(Integer id);

}
