package com.uce.edu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.service.IPersonaJdbcService;
import com.uce.edu.demo.to.Persona;

import org.apache.log4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.slf4j.Logger;


@SpringBootApplication
public class ProyectoU2KaApplication implements CommandLineRunner{
	
	private static final Logger log = Logger.getRootLogger();
	
	
	@Autowired
	private IPersonaJdbcService iPersonaJdbcService;
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2KaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Persona p = new Persona();
		p.setId(4);
		p.setNombre("Romi");
		p.setApellido("Ramirez");
		//insertar
		//this.iPersonaJdbcService.guardar(p);
		
		//actualizar
		Persona p1= new Persona();
		p1.setId(4);
		p1.setNombre("Xavier");
		p1.setApellido("Agullar");
		this.iPersonaJdbcService.actualizar(p1);
		
		//eliminar
		//this.iPersonaJdbcService.eliminar(2);
		
		//buscar
		//this.iPersonaJdbcService.buscar(3);
		log.info(this.iPersonaJdbcService.buscar(4));
	}

}
