package com.uce.edu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.estudiante.service.IEstudianteService;
import com.uce.edu.demo.estudiante.to.Estudiante;
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
	
	@Autowired
	private IEstudianteService iEstudianteService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2KaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Persona p = new Persona();
//		p.setId(4);
//		p.setNombre("Romi");
//		p.setApellido("Ramirez");
//		//insertar
//		//this.iPersonaJdbcService.guardar(p);
//		
//		//actualizar
//		Persona p1= new Persona();
//		p1.setId(4);
//		p1.setNombre("Xavier");
//		p1.setApellido("Agullar");
//		this.iPersonaJdbcService.actualizar(p1);
//		
//		//eliminar
//		//this.iPersonaJdbcService.eliminar(2);
//		
//		//buscar
//		//this.iPersonaJdbcService.buscar(3);
//		log.info(this.iPersonaJdbcService.buscar(4));
//		
		
		//ingresar
		Estudiante e= new Estudiante();
		e.setId(1);
		e.setNombre("Xavier");
		e.setApellido("Aguilar");
		e.setCorreo("kevinjkevps4@gmail.com");
		e.setEdad(24);
		//this.iEstudianteService.ingresar(e);
		
		Estudiante e1= new Estudiante();
		e1.setId(2);
		e1.setNombre("David");
		e1.setApellido("Firulais");
		e1.setCorreo("ddas_214@gmail.com");
		e1.setEdad(21);
		//this.iEstudianteService.ingresar(e1);
		
		Estudiante e2= new Estudiante();
		e2.setId(3);
		e2.setNombre("Juan");
		e2.setApellido("Messi");
		e2.setCorreo("Leooomm21@gmail.com");
		e2.setEdad(24);
		//this.iEstudianteService.ingresar(e2);
		
		//actualizar
		Estudiante e5 = new Estudiante();
		e5.setId(2);
		e5.setNombre("Pedro");
		e5.setApellido("Vazquez");
		e5.setCorreo("rramires21@gamil.com");
		e5.setEdad(20);
		//this.iEstudianteService.actualizar(e5);
		
		//borrar
		//this.iEstudianteService.eliminar(3);
		
		
		//buscar
		log.info(this.iEstudianteService.buscar(1));
		
		
	}

}
