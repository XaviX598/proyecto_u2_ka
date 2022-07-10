package com.uce.edu.demo.prueba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.prueba.repository.IVehiculoRepository;
import com.uce.edu.demo.prueba.repository.modelo.Vehiculo;

@Service
public class VehiculoServiceImpl implements IVehiculoService {

	@Autowired
	private IVehiculoRepository vehiculoRepository;

	@Override
	public void insertar(Vehiculo v) {
		this.vehiculoRepository.insertar(v);

	}

	@Override
	public Vehiculo buscar(String placa) {

		return this.vehiculoRepository.buscar(placa);
	}

	@Override
	public void actualizar(Vehiculo v) {
		this.vehiculoRepository.actualizar(v);

	}

	@Override
	public int eliminar(String placa) {
		return this.vehiculoRepository.eliminar(placa);

	}

	@Override
	public void eliminarPorID(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
