package com.uce.edu.demo;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.estudiante.service.IEstudianteJpaService;
import com.uce.edu.demo.repository.modelo.PersonaContadorGenero;
import com.uce.edu.demo.repository.modelo.PersonaSencilla;
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

//		// buscar por cedula Criteria Api
//		Persona personaCriteriaApi = this.iPersonaJpaService.buscarPorCedulaCriteriaApi("45612315");
//		log.info("Persona encontrada con Crtiteria API: " + personaCriteriaApi);
//
//		// buscar por cedula Criteria Api
//		Persona dinamicamenteCriteriaApi = this.iPersonaJpaService.buscarDinamicamente("Edison","Cayambe","M");
//		log.info("Persona encontrada dinamicamente con Crtiteria API: " + dinamicamenteCriteriaApi);

//		buscar por apellido sencillo
		List<PersonaSencilla> listaPersonaSencilla = this.iPersonaJpaService.buscarPorApellidoSenciloo("Aguilar");
		for (PersonaSencilla perItem : listaPersonaSencilla) {
			log.info("Perona encontrada mediante PersonaSencilla: " + perItem);
		}

//		consultar numero de personaspor genero
		List<PersonaContadorGenero> listaPersonaGenero = this.iPersonaJpaService.consultarCantidadPorGenero();
		for (PersonaContadorGenero perItem : listaPersonaGenero) {
			log.info("Genero: " + perItem);
		}
	}
}
//}
