package com.uce.edu.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IPersonaJdbcRepository;
import com.uce.edu.demo.to.PersonaTo;
@Service
public class PersonaJdbcServiceImpl implements IPersonaJdbcService{

	@Autowired
	private IPersonaJdbcRepository iPersonaJdbcRepository;
	
	@Override
	public void guardar(PersonaTo p) {
		// TODO Auto-generated method stub
		this.iPersonaJdbcRepository.insertar(p);
	}

	@Override
	public void actualizar(PersonaTo p) {
		// TODO Auto-generated method stub
		this.iPersonaJdbcRepository.actualizar(p);
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		this.iPersonaJdbcRepository.eliminar(id);
	}

	@Override
	public PersonaTo buscar(int id) {
		// TODO Auto-generated method stub
		return this.iPersonaJdbcRepository.buscarPorId(id);
	}

	@Override
	public List<PersonaTo> buscartodos() {
		// TODO Auto-generated method stub
		return this.iPersonaJdbcRepository.buscartodos();
	}

}
