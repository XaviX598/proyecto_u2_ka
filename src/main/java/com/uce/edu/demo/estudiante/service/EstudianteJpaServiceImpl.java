package com.uce.edu.demo.estudiante.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.estudiante.repository.IEstudianteJpaRepository;
import com.uce.edu.demo.estudiante.repository.modelo.Estudiante;
@Service
public class EstudianteJpaServiceImpl implements IEstudianteJpaService{
	
	@Autowired
	private IEstudianteJpaRepository iEstudianteJpaRepository;

	@Override
	public void ingresar(Estudiante e) {
		// TODO Auto-generated method stub
		this.iEstudianteJpaRepository.ingresar(e);
	}

	@Override
	public Estudiante buscar(int id) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscar(id);
	}

	@Override
	public void actualizar(Estudiante e) {
		// TODO Auto-generated method stub
		this.iEstudianteJpaRepository.actualizar(e);
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		this.iEstudianteJpaRepository.eliminar(id);
	}

	@Override
	public List<Estudiante> buscarPorEdadTyped(int edad) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorEdadTyped(edad);
	}

	@Override
	public Estudiante buscarPorCorreoTyped(String correo) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorCorreoTyped(correo);
	}

	@Override
	public List<Estudiante> buscarPorNombreApellidoNamed(String nombre, String apellido) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorNombreApellidoNamed(nombre, apellido);
	}

	@Override
	public List<Estudiante> buscarPorNombreEdadNamed(String nombre, int edad) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorNombreEdadNamed(nombre, edad);
	}

	@Override
	public List<Estudiante> buscarPorApellidoEdadTypedNamed(String apellido, int edad) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorApellidoEdadTypedNamed(apellido, edad);
	}

	@Override
	public Estudiante buscarPorNombreCorreoTypedNamed(String nombre, String correo) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorNombreCorreoTypedNamed(nombre, correo);
	}

	@Override
	public Estudiante buscarPorCorreoNative(String correo) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorCorreoNative(correo);
	}

	@Override
	public List<Estudiante> buscarPorNombreNative(String nombre) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorNombreNative(nombre);
	}

	@Override
	public Estudiante buscarPorApellidoCorreoNamedNative(String apellido, String correo) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorApellidoCorreoNamedNative(apellido, correo);
	}

	@Override
	public List<Estudiante> buscarPorNombreApellidoNamedNative(String nombre, String apellido) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorNombreApellidoNamedNative(nombre, apellido);
	}

}
