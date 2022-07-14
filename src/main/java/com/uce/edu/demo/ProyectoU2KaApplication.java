package com.uce.edu.demo;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.estudiante.repository.modelo.Estudiante;
import com.uce.edu.demo.estudiante.service.IEstudianteJpaService;
import com.uce.edu.demo.prueba.service.IMatriculaGestorService;
import com.uce.edu.demo.prueba.service.IMatriculaService;
import com.uce.edu.demo.prueba.service.IPropietarioService;
import com.uce.edu.demo.prueba.service.IVehiculoService;
import com.uce.edu.demo.service.IPersonaJdbcService;
import com.uce.edu.demo.service.IPersonaJpaService;

//import org.slf4j.LoggerFactory;
//import org.slf4j.Logger;

@SpringBootApplication
public class ProyectoU2KaApplication implements CommandLineRunner {

	private static final Logger log = Logger.getRootLogger();

	@Autowired
	private IPersonaJpaService iPersonaJpaService;

	@Autowired
	private IEstudianteJpaService iEstudianteJpaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2KaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		//jpa buscar
//		
		// log.info("Dato con JPA: " + this.iPersonaJpaService.buscar(7));
//		
//		//jpa insertar
		// Persona per = new Persona();
//		// debido a secuancia no hace falta id
//		// per.setId(7);
//		per.setNombre("Rom");
//		per.setApellido("Aguilar");
//		per.setGenero("F");
//		per.setCedula("451234");
		// this.iPersonaJpaService.guardar(per);

		// actualizar por apellido
//		int resultado=this.iPersonaJpaService.actualizarPorApellido("Femenino", "Matamoros");
//		log.info("Cantidad de registros actualizados: "+resultado);

		// eliminar por genero
//		int resultado1 = this.iPersonaJpaService.eliminarPorGenero("M");
//		log.info("Cantidad de registros eliminados: " + resultado1);

//		
//		
//		//buscar por cedula
//		Persona Per1 =  this.iPersonaJpaService.buscarPorCedula("545165454");
//		//log.info("Persona encontrada: "+Per1);
//		
//		//buscar por apellido
//		List<Persona> listaPersona = this.iPersonaJpaService.buscarPorApellido("Matamoros") ;
//		for(Persona item : listaPersona) {
//			log.info("Personas buscadas por apellido: "+ item );
//		}
//		
//		//buscar por apellido
//		List<Persona> listaPersona1 = this.iPersonaJpaService.buscarPorGenero("F") ;
//		for(Persona item : listaPersona1) {
//			log.info("Personas buscadas por genero: "+ item );
//		}
//		
//		//buscar por apellido
//		List<Persona> listaPersona2 = this.iPersonaJpaService.buscarPorNombre("Rom") ;
//		for(Persona item : listaPersona2) {
//			log.info("Personas buscadas por nombre: "+ item );
//		}
//		
//		

//		//actualizar jpa
//		per.setId(7);
//		per.setNombre("Victoria");
//		per.setApellido("Velasco");
//		 this.iPersonaJpaService.actualizar(per);
//		
//		//eliminar jpa
		// this.iPersonaJpaService.eliminar(4);

		// buscar por cedula TypedQuery
//		Persona PerTyped = this.iPersonaJpaService.buscarPorCedulaTyped("8884541");
//		log.info("Persona encontrada con typed: " + PerTyped);
//
//		// buscar por cedula NamedQuery
//		Persona PerNamed = this.iPersonaJpaService.buscarPorCedulaNamed("7848484");
//		log.info("Persona encontrada con Named: " + PerNamed);
//		// buscar por cedula TypedQuery y NamedQuery
//		Persona PerTypedNamed = this.iPersonaJpaService.buscarPorCedulaTypedNamed("45612315");
//		log.info("Persona encontrada con TypedQuery y NamedQuery: " + PerTypedNamed);
//		// buscar por nombre y apellido
//		
//		List<Persona> listaPer= this.iPersonaJpaService.buscarPorNombreApellido("Rom", "Aguilar");
//		for(Persona item : listaPer) {
//			log.info("Personas buscadas por nombre y apellido: "+ item );

//		// buscar por cedula Native
//		Persona personaNative = this.iPersonaJpaService.buscarPorCedulaNative("451234");
//		log.info("Persona encontrada con Native Query: " + personaNative);
//
//		// buscar por cedula Named Native
//		Persona personaNamedNative = this.iPersonaJpaService.buscarPorCedulaNamedNative("451234");
//		log.info("Persona encontrada con Named Native Query: " + personaNamedNative);

//		//buscar por edad
//		List<Estudiante> est =  this.iEstudianteJpaService.buscarPorEdadTyped(20);
//		log.info("Estudiante encontrada por edad (Typed): " + est);
//		
//		//buscar por correo
//		Estudiante est1 = this.iEstudianteJpaService.buscarPorCorreoTyped("kevinjkevps4@gmai.com");
//		log.info("Estudiante encontrada con correo(Typed): " + est1);
//		
//		//buscar por nombre y apellido
//		List<Estudiante> est2 =  this.iEstudianteJpaService.buscarPorNombreApellidoNamed("Romina", "Ramirez");
//		log.info("Estudiante encontrada por nombre y apellido(Named): " + est2);
//		
//		//buscar por nombre y edad
//		List<Estudiante> est3 =  this.iEstudianteJpaService.buscarPorNombreEdadNamed("Juanito", 25);
//		log.info("Estudiante encontrada por nombre y edad(Named): " + est3);
//		
//		//buscar por apellido y edad
//		List<Estudiante> est4 =  this.iEstudianteJpaService.buscarPorApellidoEdadTypedNamed("Aguilar", 24);
//		log.info("Estudiante encontrada por apellido y edad(TypedNamed): " + est4);
//		
//		//buscar por nombre y correo
//		Estudiante est5 = this.iEstudianteJpaService.buscarPorNombreCorreoTypedNamed("Juanito", "kkkashy@gmai.com");
//		log.info("Estudiante encontrada con correo(TypedNamed): " + est5);

//		



		Estudiante es = new Estudiante();
		es.setEdad(18);
		es.setApellido("Juanito");
		es.setNombre("Pereza");
		es.setCorreo("juaaanp6@gmai.com");
		 //this.iEstudianteJpaService.ingresar(es);

		// buscar por correo Native
		Estudiante estudianteNative = this.iEstudianteJpaService.buscarPorCorreoNative("kkkashy@gmai.com");
		log.info("Estudiante encontrado con Native Query: " + estudianteNative);

		// buscar por nombre Native
		List<Estudiante> estudianteNative2 = this.iEstudianteJpaService.buscarPorNombreNative("Xavier");
		log.info("Estudiante encontrado con Native Query: " + estudianteNative2);

		// buscar por apellido correo Named Native
		Estudiante estudianteNamedNative = this.iEstudianteJpaService.buscarPorApellidoCorreoNamedNative("Romina",
				"rramires21@gamil.com");
		log.info("Estudiante encontrado con Named Native Query: " + estudianteNamedNative);

		// buscar por cedula Named Native
		List<Estudiante> estudianteNamedNative2 = this.iEstudianteJpaService
				.buscarPorNombreApellidoNamedNative("Xavier", "Aguilar");
		log.info("Estudiante encontrado con Named Native Query: " + estudianteNamedNative2);
	}
}
//}
