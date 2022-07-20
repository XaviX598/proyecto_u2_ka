package com.uce.edu.demo;

import java.math.BigDecimal;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.Ciudadano;
import com.uce.edu.demo.repository.modelo.Empleado;
import com.uce.edu.demo.service.ICiudadanoService;

//import org.slf4j.LoggerFactory;
//import org.slf4j.Logger;

@SpringBootApplication
public class ProyectoU2KaApplication implements CommandLineRunner {

	private static final Logger log = Logger.getRootLogger();

	
	@Autowired
	private ICiudadanoService iCiudadanoService;
	
	@Autowired
	//private IEmpleadoService iEmpleadoService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2KaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Ciudadano ciu1 = new Ciudadano();
		ciu1.setNombre("David");
		ciu1.setApellido("Aguilar");
		
		Empleado empl1 = new Empleado();
		empl1.setCodigoIess("5451");
		empl1.setSalario(new BigDecimal(50));
		empl1.setCiudadano(ciu1);
		
		ciu1.setEmpleado(empl1);
		
		this.iCiudadanoService.insertar(ciu1);
		
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
		
		
	}
}

