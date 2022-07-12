package com.uce.edu.demo.estudiante.repository;

import java.util.List;

import com.uce.edu.demo.estudiante.repository.modelo.Estudiante;

public interface IEstudianteJpaRepository {
	
	public void ingresar(Estudiante e);
	
	public Estudiante buscar(int id);
	
	public void actualizar(Estudiante e);
	
	public void eliminar(int id);
	
	public List<Estudiante> buscarPorEdadTyped(int edad);
	
	public Estudiante buscarPorCorreoTyped(String correo);
	
	public List<Estudiante>  buscarPorNombreApellidoNamed(String nombre, String apellido);
	
	public List<Estudiante>  buscarPorNombreEdadNamed(String nombre, int edad);
	
	public List<Estudiante>  buscarPorApellidoEdadTypedNamed(String apellido, int edad);
	
	public Estudiante  buscarPorNombreCorreoTypedNamed(String nombre,String correo);
	
	

}
