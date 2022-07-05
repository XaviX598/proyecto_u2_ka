package com.uce.edu.demo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.estudiante.repository.IEstudianteJpaRepository;
import com.uce.edu.demo.estudiante.repository.modelo.Estudiante;
import com.uce.edu.demo.estudiante.service.IEstudianteJpaService;
import com.uce.edu.demo.estudiante.service.IEstudianteService;
import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.service.IPersonaJdbcService;
import com.uce.edu.demo.service.IPersonaJpaService;
//import org.slf4j.LoggerFactory;
//import org.slf4j.Logger;

@SpringBootApplication
public class ProyectoU2KaApplication implements CommandLineRunner {

	private static final Logger log = Logger.getRootLogger();

//	@Autowired
	private IPersonaJdbcService iPersonaJdbcService;

	@Autowired
	private IPersonaJpaService iPersonaJpaService;

	@Autowired
	private IEstudianteJpaService iEstudianteJpaService;

//	@Autowired
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
//		this.iPersonaJdbcService.guardar(p);
//		
//		//actualizar
//		Persona p1= new Persona();
//		p1.setId(4);
//		p1.setNombre("Xavier");
//		p1.setApellido("Agullar");
//		this.iPersonaJdbcService.actualizar(p1);
//
//		// eliminar
//		 this.iPersonaJdbcService.eliminar(2);
//
//		// buscar
//		 this.iPersonaJdbcService.buscar(3);
//		log.info(this.iPersonaJdbcService.buscar(4));
//
//		// buscar todos
//		 log.info("Lista: " +this.iPersonaJdbcService.buscartodos());

//		//jpa buscar
//		
		//log.info("Dato con JPA: " + this.iPersonaJpaService.buscar(7));
//		
//		//jpa insertar
		Persona per = new Persona();
		//debido a secuancia no hace falta id
		//per.setId(7);
		per.setNombre("Pepe12");
		per.setApellido("Matamoros");
		this.iPersonaJpaService.guardar(per);
//		
//		//actualizar jpa
		per.setId(7);
		per.setNombre("Victoria");
		per.setApellido("Velasco");
		//this.iPersonaJpaService.actualizar(per);
//		
//		//eliminar jpa
		//this.iPersonaJpaService.eliminar(4);

//		// jpa insertar
//		Estudiante est = new Estudiante();
//		est.setId();
//		est.setNombre("Juanito");
//		est.setApellido("Pereza");
//		est.setCorreo("kkkashy@gmai.com");
//		est.setEdad(25);
//		//this.iEstudianteJpaService.ingresar(est);
//		
//		Estudiante est2 = new Estudiante();
//		est2.setId(6);
//		est2.setNombre("David");
//		est2.setApellido("Moñazo");
//		est2.setCorreo("ddm@gmai.com");
//		est2.setEdad(23);
//		//this.iEstudianteJpaService.ingresar(est2);
//
//		// jpa buscar
//		log.info("Dato con JPA: " + this.iEstudianteJpaService.buscar(1));
//
//		// actualizar jpa
//		Estudiante est1 = new Estudiante();
//		est1.setId(1);
//		est1.setNombre("Xavi");
//		est1.setApellido("Aguilar");
//		est1.setCorreo("kevinjkevps4@gmai.com");
//		est1.setEdad(24);
//		//this.iEstudianteJpaService.actualizar(est1);
//
//		// eliminar jpa
//		//this.iEstudianteJpaService.eliminar(6);

	}

}
