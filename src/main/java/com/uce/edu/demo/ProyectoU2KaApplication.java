package com.uce.edu.demo;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.cajero.repository.modelo.Detalle;
import com.uce.edu.demo.cajero.repository.modelo.Factura;
import com.uce.edu.demo.cajero.service.IFacturaService;

//import org.slf4j.LoggerFactory;
//import org.slf4j.Logger;

@SpringBootApplication
public class ProyectoU2KaApplication implements CommandLineRunner {

	private static final Logger log = Logger.getRootLogger();
	
	@Autowired
	private IFacturaService iFacturaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2KaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Factura fact = this.iFacturaService.consultar(1);
		log.info("Numero: "+fact.getNumero());
		log.info("Fecha: "+fact.getFecha());
		log.info("Cliente: "+fact.getCliente().getNumeroTarjeta());
		
		List<Detalle> detalles = fact.getDetalles();
		for(Detalle deta:detalles) {
			log.info("Detalle: "+deta);
		}
		
	}
}
