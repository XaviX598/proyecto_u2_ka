package com.uce.edu.demo.estudiante.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.estudiante.repository.IEstudianteJpaRepository;
import com.uce.edu.demo.estudiante.repository.modelo.Estudiante;
@Service
public class EstudianteJpaServiceImpl implements IEstudianteJpaService{
	
	@Autowired
	private IEstudianteJpaRepository iEstudianteJpaRepository;

	@Override
	public void ingresar(Estudiante e) {
		// TODO Auto-generated method stub
		this.iEstudianteJpaRepository.ingresar(e);
	}

	@Override
	public Estudiante buscar(int id) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscar(id);
	}

	@Override
	public void actualizar(Estudiante e) {
		// TODO Auto-generated method stub
		this.iEstudianteJpaRepository.actualizar(e);
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		this.iEstudianteJpaRepository.eliminar(id);
	}

}
