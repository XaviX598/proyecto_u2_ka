package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.onetone.repository.modelo.Ciudadanota;
import com.uce.edu.demo.onetone.repository.modelo.Pasaporte;
import com.uce.edu.demo.onetone.service.ICiudadanotaService;
import com.uce.edu.demo.onetone.service.IPasaporteService;

//import org.slf4j.LoggerFactory;
//import org.slf4j.Logger;

@SpringBootApplication
public class ProyectoU2KaApplication implements CommandLineRunner {

	private static final Logger log = Logger.getRootLogger();

	
//	@Autowired
//	private ICiudadanoService iCiudadanoService;
	
	@Autowired
	private ICiudadanotaService iCiudadanotaService;
	
	@Autowired
	private IPasaporteService iPasaporteService;
	
	@Autowired
	//private IEmpleadoService iEmpleadoService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2KaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		Ciudadano ciu1 = new Ciudadano();
//		ciu1.setNombre("David");
//		ciu1.setApellido("Aguilar");
//		
//		Empleado empl1 = new Empleado();
//		empl1.setCodigoIess("5451");
//		empl1.setSalario(new BigDecimal(50));
//		empl1.setCiudadano(ciu1);
//		
//		ciu1.setEmpleado(empl1);
//		
//		this.iCiudadanoService.insertar(ciu1);
		
//		Ciudadano ciu2 = new Ciudadano();
//		ciu2.setNombre("Davi2d");
//		ciu2.setApellido("Aguilar2");
//		
//		Empleado empl2 = new Empleado();
//		empl2.setCodigoIess("54512");
//		empl2.setSalario(new BigDecimal(502));
//		empl2.setCiudadano(ciu2);
//		
//		ciu2.setEmpleado(empl2);
//		this.iEmpleadoService.insertar(empl2);
		
		Ciudadanota ciu1 = new Ciudadanota();
		ciu1.setNombre("Paola");
		ciu1.setApellido("Castillo");
		ciu1.setCedula("6526516546");
		ciu1.setFechaNacimiento(LocalDateTime.of(1998, 3,2, 5, 0));
		
		Pasaporte pas1= new Pasaporte();
		
		pas1.setNumero(33324);
		pas1.setFechaEmision(LocalDateTime.of(2022, 1, 20, 17, 0));
		pas1.setFechaCaducidad(LocalDateTime.of(2025, 3, 2, 1, 0));
		
		pas1.setCiudadanota(ciu1);
		ciu1.setPasaporte(pas1);
		//this.iCiudadanotaService.insertar(ciu1);
		
		ciu1.setId(15);
		ciu1.setNombre("Carolina");
		ciu1.setApellido("Herrera");
		ciu1.setCedula("78945641");
		ciu1.setFechaNacimiento(LocalDateTime.of(1987, 3,5, 6, 30));
		ciu1.setPasaporte(pas1);
		//this.iCiudadanotaService.actualizar(ciu1);
		
//		log.info("El ciudadano con el id ingresado corresponde a: "+ this.iCiudadanotaService.buscarPorId(12));
//		log.info("El pasaporte con el id ingresado corresponde a: "+ this.iPasaporteService.buscarPorId(4));
		this.iPasaporteService.eliminar(16);
		//this.iCiudadanotaService.eliminar(24);
		
	}
}

