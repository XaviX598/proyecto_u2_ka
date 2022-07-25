package com.uce.edu.demo.onetomany.service;

import com.uce.edu.demo.repository.modelo.onetomany.tarea.Desarrolladora;

public interface IDesarrolladoraService {
	
	public void insertar(Desarrolladora desarrolladora);
	
	public void actualizar(Desarrolladora desarrolladora);
	
	public void eliminar(Integer id);
	
	public Desarrolladora buscarPorId(Integer id);

}
