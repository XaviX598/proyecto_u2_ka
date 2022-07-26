package com.uce.edu.demo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.manytomany.tarea.Autort;
import com.uce.edu.demo.repository.modelo.manytomany.tarea.Librot;
import com.uce.edu.demo.repository.modelo.manytomany.tarea.Librot_Autort;
import com.uce.edu.demo.service.IAutortService;
import com.uce.edu.demo.service.ILibrotAutortService;
import com.uce.edu.demo.service.ILibrotService;

//import org.slf4j.LoggerFactory;
//import org.slf4j.Logger;

@SpringBootApplication
public class ProyectoU2KaApplication implements CommandLineRunner {

	private static final Logger log = Logger.getRootLogger();
	
	@Autowired
	private ILibrotService iLibrotService;
	
	@Autowired
	private IAutortService iAutortService;
	
	@Autowired
	private ILibrotAutortService iLibrotAutortService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2KaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//para un libro con dos autores
		Librot libro1 = new Librot();
		libro1.setTitulo("IT");
		libro1.setCantidadPaginas(500);
		
		Librot libro2 = new Librot();
		libro2.setTitulo("IT");
		libro2.setCantidadPaginas(500);
		
		Autort autor1 = new Autort();
		autor1.setNombre("Stephen King");
		
		Autort autor2 = new Autort();
		autor2.setNombre("Leonel Messi");
		
		this.iLibrotService.insertar(libro1);
		this.iAutortService.insertar(autor1);
		this.iAutortService.insertar(autor2);
		
		Librot_Autort la1 = new Librot_Autort();
		la1.setLibrot(libro1);
		
		la1.setAutort(autor2);
		this.iLibrotAutortService.insertar(la1);
		
		Librot_Autort la2 = new Librot_Autort();
		la2.setLibrot(libro1);
		la2.setAutort(autor1);
		
		this.iLibrotAutortService.insertar(la2);
		
		//para un autor con dos libros
		
//		Autort autor3 = new Autort();
//		autor3.setNombre("Leonel Messi");
//		this.iAutortService.insertar(autor3);
//		
//		Librot libro3 = new Librot();
//		libro3.setTitulo("IT");
//		libro3.setCantidadPaginas(500);
//		
//		this.iLibrotService.insertar(libro3);
//		
//		Librot libro4 = new Librot();
//		libro4.setTitulo("IT");
//		libro4.setCantidadPaginas(500);
//		
//		this.iLibrotService.insertar(libro4);
//		
//		Librot_Autort liau = new Librot_Autort();
//		liau.setLibrot(libro4);
//		
//		liau.setAutort(autor3);
//		this.iLibrotAutortService.insertar(liau);
//		
//		Librot_Autort liau1 = new Librot_Autort();
//		
//		liau1.setLibrot(libro3);
//		liau1.setAutort(autor3);
//		this.iLibrotAutortService.insertar(liau1);
		
	}
}
