package com.uce.edu.demo.onetone.service;

import com.uce.edu.demo.onetone.repository.modelo.Ciudadanota;

public interface ICiudadanotaService {

	public void insertar(Ciudadanota c);

	public void eliminar(Integer id);

	public void actualizar(Ciudadanota c);

	public Ciudadanota buscarPorId(Integer id);

}
