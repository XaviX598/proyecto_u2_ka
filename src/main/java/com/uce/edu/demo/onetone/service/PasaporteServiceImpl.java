package com.uce.edu.demo.onetone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.onetone.repository.IPasaporteRepository;
import com.uce.edu.demo.onetone.repository.modelo.Pasaporte;
@Service
public class PasaporteServiceImpl implements IPasaporteService{
	
	@Autowired
	private IPasaporteRepository iPasaporteRepository;

	@Override
	public void insertar(Pasaporte p) {
		// TODO Auto-generated method stub
		this.iPasaporteRepository.insertar(p);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iPasaporteRepository.eliminar(id);
	}

	@Override
	public void actualizar(Pasaporte p) {
		// TODO Auto-generated method stub
		this.iPasaporteRepository.actualizar(p);
	}

	@Override
	public Pasaporte buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.iPasaporteRepository.buscarPorId(id);
	}

}
