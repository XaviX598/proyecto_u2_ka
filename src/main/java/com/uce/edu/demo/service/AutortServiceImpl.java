package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IAutortRepository;
import com.uce.edu.demo.repository.modelo.manytomany.tarea.Autort;

@Service
public class AutortServiceImpl implements IAutortService{
	
	@Autowired
	private IAutortRepository iAutortRepository;

	@Override
	public void insertar(Autort autort) {
		// TODO Auto-generated method stub
		this.iAutortRepository.insertar(autort);
	}

}
