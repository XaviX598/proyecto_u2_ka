package com.uce.edu.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.log4j.Logger;

@SpringBootApplication
public class ProyectoU2KaApplication implements CommandLineRunner{
	
	private static final Logger log = Logger.getRootLogger();
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2KaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("---------Consola normal-------------");
		System.out.println("hola mundo");
		System.out.println("---------Consola LOG-------------");
		log.info("Hola mundo");
	}

}
