package com.uce.edu.demo.onetone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.onetone.repository.ICiudadanotaRepository;
import com.uce.edu.demo.onetone.repository.modelo.Ciudadanota;
@Service
public class CiudadanotaServiceImpl implements ICiudadanotaService{
	
	@Autowired
	private ICiudadanotaRepository iCiudadanotaRepository;

	@Override
	public void insertar(Ciudadanota c) {
		// TODO Auto-generated method stub
		this.iCiudadanotaRepository.insertar(c);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iCiudadanotaRepository.eliminar(id);
	}

	@Override
	public void actualizar(Ciudadanota c) {
		// TODO Auto-generated method stub
		this.iCiudadanotaRepository.actualizar(c);
	}

	@Override
	public Ciudadanota buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.iCiudadanotaRepository.buscarPorId(id);
	}

}
