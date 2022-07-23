package com.uce.edu.demo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.IHabitacionRepository;
import com.uce.edu.demo.repository.modelo.onetomany.Habitacion;
import com.uce.edu.demo.repository.modelo.onetomany.Hotel;
import com.uce.edu.demo.service.IHabitacionService;
import com.uce.edu.demo.service.IHotelService;

//import org.slf4j.LoggerFactory;
//import org.slf4j.Logger;

@SpringBootApplication
public class ProyectoU2KaApplication implements CommandLineRunner {

	private static final Logger log = Logger.getRootLogger();

	
	@Autowired
	private IHotelService iHotelService;
	
	@Autowired
	private IHabitacionService iHabitacionService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2KaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
//		Hotel hotel2 = new Hotel();
//		hotel2.setNombre("Hilton Colon");
//		hotel2.setDireccion("Malecon");
//		this.iHotelService.insertar(hotel2);
		
		//buscamos numero basta que tengamos la referencia del hotel para asignar las habitaciones en el hotel
		Hotel hote=new Hotel();
		hote.setId(1);
		
		Habitacion habitacion1 = new Habitacion();
		habitacion1.setNumero("A234");
		habitacion1.setPiso("10");
		habitacion1.setTipo("Familiar");
		habitacion1.setHotel(hote);
		
		Habitacion habitacion2 = new Habitacion();
		habitacion2.setNumero("4564651");
		habitacion2.setPiso("1");
		habitacion2.setTipo("Matrimonial");
		habitacion2.setHotel(hote);
		
		
		this.iHabitacionService.insertar(habitacion1);
		this.iHabitacionService.insertar(habitacion2);
		
		
	}
}

