package com.uce.edu.demo.prueba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.prueba.repository.IPropietrarioRepository;
import com.uce.edu.demo.prueba.repository.modelo.Propietario;

@Service
public class PropietarioServiceImpl implements IPropietarioService {

	@Autowired
	private IPropietrarioRepository propietrarioRepository;

	
	@Override
	public void crear(Propietario p) {
		this.propietrarioRepository.crear(p);
		
	}

	@Override
	public int eliminar(String cedula) {
		return this.propietrarioRepository.eliminar(cedula);
		
	}

}
