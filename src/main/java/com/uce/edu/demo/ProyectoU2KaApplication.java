package com.uce.edu.demo;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.onetomany.service.IDesarrolladoraService;
import com.uce.edu.demo.onetomany.service.IVideojuegoService;
import com.uce.edu.demo.repository.modelo.manytomany.Autor;
import com.uce.edu.demo.repository.modelo.manytomany.Libro;
import com.uce.edu.demo.repository.modelo.onetomany.tarea.Desarrolladora;
import com.uce.edu.demo.service.IAutorService;
import com.uce.edu.demo.service.ILibroService;

//import org.slf4j.LoggerFactory;
//import org.slf4j.Logger;

@SpringBootApplication
public class ProyectoU2KaApplication implements CommandLineRunner {

	private static final Logger log = Logger.getRootLogger();
	
	@Autowired
	private ILibroService iLibroService;
	
	@Autowired
	private IAutorService iAutorService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2KaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Autor autor = new Autor();
		autor.setNombre("Stephen Rey");
		Autor autor1 = new Autor();
		autor1.setNombre("Adam Why");
		Set<Autor> autores = new HashSet<>();
		autores.add(autor);
		autores.add(autor1);
		
		Libro libro = new Libro();
		libro.setTitulo("JPA");
		libro.setCantidadPaginas(500);
		//en la many to many solo hace falta setear osea enlazar desde un lado 
		libro.setAutores(autores);
		this.iLibroService.insertar(libro);
		
				
		
//		this.iAutorService.insertar(autor);
		
	}
}
