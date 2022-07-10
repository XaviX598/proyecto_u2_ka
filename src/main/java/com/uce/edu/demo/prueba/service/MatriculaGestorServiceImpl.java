package com.uce.edu.demo.prueba.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.prueba.repository.IMatriculaRepository;
import com.uce.edu.demo.prueba.repository.IPropietrarioRepository;
import com.uce.edu.demo.prueba.repository.IVehiculoRepository;
import com.uce.edu.demo.prueba.repository.modelo.Matricula;
import com.uce.edu.demo.prueba.repository.modelo.Propietario;
import com.uce.edu.demo.prueba.repository.modelo.Vehiculo;

@Service
public class MatriculaGestorServiceImpl implements IMatriculaGestorService {

	@Autowired
	private IPropietrarioRepository propietrarioRepository;
	
	@Autowired
	private IVehiculoRepository vehiculoRepository;
	
	@Autowired
	@Qualifier("pesado")
	private IMatriculaService matriculaServicePesado;
	
	@Autowired
	@Qualifier("liviano")
	private IMatriculaService matriculaServiceLiviano;
	
	@Autowired
	private IMatriculaRepository matriculaRepository;
	
	@Override
	public void generar(String cedula, String placa) {
		// TODO Auto-generated method stub
		Propietario p = this.propietrarioRepository.consultar(cedula);
		Vehiculo v = this.vehiculoRepository.buscar(placa);
		String tipo = v.getTipo();
		BigDecimal valorMatricula;
		if(tipo.equals("P")) {
			valorMatricula = this.matriculaServicePesado.calcular(v.getPrecio());
		}else {
			valorMatricula = this.matriculaServiceLiviano.calcular(v.getPrecio());
		}
	
		if(valorMatricula.compareTo(new BigDecimal(2000))>0) {
			BigDecimal valorD = valorMatricula.multiply(new BigDecimal(7)).divide(new BigDecimal(100));
			valorMatricula = valorMatricula.subtract(valorD);
		}
		Matricula m = new Matricula();
		m.setFechaMatricula(LocalDateTime.now());
		m.setValorMatrciula(valorMatricula);
		m.setPropietario(p);
		m.setVehiculo(v);
		
		this.matriculaRepository.crer(m);
		
	}

}
