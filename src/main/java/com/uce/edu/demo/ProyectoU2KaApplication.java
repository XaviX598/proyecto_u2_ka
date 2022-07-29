package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.cajero.repository.modelo.Detalle;
import com.uce.edu.demo.cajero.repository.modelo.Factura;
import com.uce.edu.demo.cajero.service.IFacturaService;
import com.uce.edu.demo.prueba.repository.modelo.Matricula;
import com.uce.edu.demo.prueba.repository.modelo.Propietario;
import com.uce.edu.demo.prueba.repository.modelo.Vehiculo;
import com.uce.edu.demo.prueba.service.IMatriculaService;
import com.uce.edu.demo.prueba.service.IPropietarioService;
import com.uce.edu.demo.prueba.service.IVehiculoService;

//import org.slf4j.LoggerFactory;
//import org.slf4j.Logger;

@SpringBootApplication
public class ProyectoU2KaApplication implements CommandLineRunner {

	private static final Logger log = Logger.getRootLogger();
	
	@Autowired
	private IVehiculoService iVehiculoService;
	
	@Autowired
	private IPropietarioService iPropietarioService;
	
	@Autowired
	@Qualifier("pesado")
	private IMatriculaService iMatriculaPesado;
	
	@Autowired
	@Qualifier("liviano")
	private IMatriculaService iMatriculaLiviano;
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2KaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//crear un propietario
		Propietario p = new Propietario();
		p.setNombre("Xavier");
		p.setApellido("Aguilar");
		p.setCedula("444541545");
		p.setFechaNacimiento(LocalDateTime.of(2022, 3, 5, 12, 0) );
		this.iPropietarioService.crear(p);
		
		//crear vehiculo
		Vehiculo v= new Vehiculo();
		v.setPrecio(new BigDecimal(30000));
		v.setPlaca("CVB5468");
		v.setMarca("KIA");
		v.setTipo("P");
		this.iVehiculoService.insertar(v);
		
		//actualzar vehiculo
		v.setId(5);
		v.setPrecio(new BigDecimal(30000));
		v.setPlaca("CVB5468");
		v.setMarca("Hyundai");
		v.setTipo("P");
		this.iVehiculoService.actualizar(v);
		
		//relizar matricula con los datos anteriores
		Matricula m1 = new Matricula();
		m1.setValorMatrciula(new BigDecimal(200));
		m1.setPropietario(p);
		m1.setFechaMatricula(LocalDateTime.of(2022, 3, 5, 12, 1));
		m1.setVehiculo(v);
		List<Matricula> m = new ArrayList<>();
		m.add(m1);
		
		
		
	}
}
