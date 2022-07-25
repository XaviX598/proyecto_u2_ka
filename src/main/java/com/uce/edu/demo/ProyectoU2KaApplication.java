package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.onetomany.service.IDesarrolladoraService;
import com.uce.edu.demo.onetomany.service.IVideojuegoService;
import com.uce.edu.demo.repository.modelo.onetomany.tarea.Desarrolladora;

//import org.slf4j.LoggerFactory;
//import org.slf4j.Logger;

@SpringBootApplication
public class ProyectoU2KaApplication implements CommandLineRunner {

	private static final Logger log = Logger.getRootLogger();

//	@Autowired
//	private IHotelService iHotelService;
//	
//	@Autowired
//	private IHabitacionService iHabitacionService;

	@Autowired
	private IDesarrolladoraService iDesarrolladoraService;

	@Autowired
	private IVideojuegoService iVideojuegoService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2KaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		
////		Hotel hotel2 = new Hotel();
////		hotel2.setNombre("Hilton Colon");
////		hotel2.setDireccion("Malecon");
////		this.iHotelService.insertar(hotel2);
//		
//		//buscamos numero basta que tengamos la referencia del hotel para asignar las habitaciones en el hotel
//		Hotel hote=new Hotel();
//		hote.setId(1);
//		
//		Habitacion habitacion1 = new Habitacion();
//		habitacion1.setNumero("A234");
//		habitacion1.setPiso("10");
//		habitacion1.setTipo("Familiar");
//		habitacion1.setHotel(hote);
//		
//		Habitacion habitacion2 = new Habitacion();
//		habitacion2.setNumero("4564651");
//		habitacion2.setPiso("1");
//		habitacion2.setTipo("Matrimonial");
//		habitacion2.setHotel(hote);
//		
//		
//		this.iHabitacionService.insertar(habitacion1);
//		this.iHabitacionService.insertar(habitacion2);

		Desarrolladora desa1 = new Desarrolladora();
		desa1.setNombre("Rockstar");
		desa1.setFechaCreacion(LocalDateTime.of(1990, 5, 2, 0, 0));
		desa1.setNumeroEmpleados(2000);
		this.iDesarrolladoraService.insertar(desa1);
		
		Desarrolladora des2= new Desarrolladora();
		des2.setId(1);
		des2.setNombre("EA sports");
		des2.setFechaCreacion(LocalDateTime.of(2003, 5, 3, 12, 0));
		des2.setNumeroEmpleados(500);
		this.iDesarrolladoraService.actualizar(des2);
		
		this.iDesarrolladoraService.eliminar(1);
		log.info("El id de la desarrolladora corrsponde a:" + this.iDesarrolladoraService.buscarPorId(2));
		
		
		//Para probar a agregar un videojuego
//		Desarrolladora d = new Desarrolladora();
//		d.setId(2);
//		Videojuego v = new Videojuego();
//		v.setNombre("COD");
//		v.setGenero("Shooters");
//		v.setValor(60);
//		v.setDesarrolladora(d);
//		this.iVideojuegoService.insertar(v);
		
		
		
		
	}
}
