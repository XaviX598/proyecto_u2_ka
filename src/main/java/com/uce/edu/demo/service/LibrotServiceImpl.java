package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.ILibrotRepository;
import com.uce.edu.demo.repository.modelo.manytomany.tarea.Librot;

@Service
public class LibrotServiceImpl implements ILibrotService {

	@Autowired
	private ILibrotRepository iLibrotRepository;

	@Override
	public void insertar(Librot librot) {
		// TODO Auto-generated method stub
		this.iLibrotRepository.insertar(librot);
	}

}
