package com.uce.edu.demo.onetone.repository;

import com.uce.edu.demo.onetone.repository.modelo.Pasaporte;

public interface IPasaporteRepository {

	public void insertar(Pasaporte p);

	public void eliminar(Integer id);

	public void actualizar(Pasaporte p);

	public Pasaporte buscarPorId(Integer id);

}
