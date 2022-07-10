package com.uce.edu.demo.prueba.repository;

import com.uce.edu.demo.prueba.repository.modelo.Propietario;

public interface IPropietrarioRepository {
	
	public Propietario consultar(String cedula);
	
	public void crear(Propietario p);
	
	public int eliminar(String cedula);
	
	public void eliminarPorID(Integer id);
	

}
