package com.uce.edu.demo.prueba.service;

import com.uce.edu.demo.prueba.repository.modelo.Propietario;

public interface IPropietarioService {
	

	public void crear(Propietario p);

	public int eliminar(String cedula);

}
