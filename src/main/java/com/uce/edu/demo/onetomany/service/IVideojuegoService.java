package com.uce.edu.demo.onetomany.service;

import com.uce.edu.demo.repository.modelo.onetomany.tarea.Videojuego;

public interface IVideojuegoService {

	public void insertar(Videojuego videojuego);

	public void actualizar(Videojuego videojuego);

	public void eliminar(Integer id);

	public Videojuego buscarPorId(Integer id);

}
