package com.uce.edu.demo.onetomany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.onetomany.repository.IDesarrolladoraRepository;
import com.uce.edu.demo.repository.modelo.onetomany.tarea.Desarrolladora;

@Service
public class DesarrolladoraServiceImpl implements IDesarrolladoraService{
	
	@Autowired
	private IDesarrolladoraRepository iDesarrolladoraRepository;

	@Override
	public void insertar(Desarrolladora desarrolladora) {
		// TODO Auto-generated method stub
		this.iDesarrolladoraRepository.insertar(desarrolladora);
	}

	@Override
	public void actualizar(Desarrolladora desarrolladora) {
		// TODO Auto-generated method stub
		this.iDesarrolladoraRepository.actualizar(desarrolladora);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iDesarrolladoraRepository.eliminar(id);
	}

	@Override
	public Desarrolladora buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.iDesarrolladoraRepository.buscarPorId(id);
	}
	

}
