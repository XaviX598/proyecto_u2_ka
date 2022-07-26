package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.ILibrotAutortRepository;
import com.uce.edu.demo.repository.modelo.manytomany.tarea.Librot_Autort;

@Service
public class LibrotAutortServiceImpl implements ILibrotAutortService {

	@Autowired
	private ILibrotAutortRepository iLibrotAutortRepository;

	@Override
	public void insertar(Librot_Autort librot_Autort) {
		// TODO Auto-generated method stub
		this.iLibrotAutortRepository.insertar(librot_Autort);
	}

}
