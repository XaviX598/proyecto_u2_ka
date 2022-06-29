package com.uce.edu.demo.estudiante.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.estudiante.repository.IEstudianteRepository;
import com.uce.edu.demo.estudiante.to.EstudianteTo;
@Service
public class EstudianteServiceImpl implements IEstudianteService{
	
	@Autowired
	private IEstudianteRepository iEstudianteRepository;

	@Override
	public void ingresar(EstudianteTo e) {
		// TODO Auto-generated method stub
		this.iEstudianteRepository.ingresar(e);
	}

	@Override
	public EstudianteTo buscar(int id) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepository.buscar(id);
	}

	@Override
	public void actualizar(EstudianteTo e) {
		// TODO Auto-generated method stub
		this.iEstudianteRepository.actualizar(e);
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		this.iEstudianteRepository.eliminar(id);
	}

}
