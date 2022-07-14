package com.uce.edu.demo.estudiante.service;

import java.util.List;

import com.uce.edu.demo.estudiante.repository.modelo.Estudiante;

public interface IEstudianteJpaService {

	public void ingresar(Estudiante e);

	public Estudiante buscar(int id);

	public void actualizar(Estudiante e);

	public void eliminar(int id);

	public List<Estudiante> buscarPorEdadTyped(int edad);

	public Estudiante buscarPorCorreoTyped(String correo);

	public Estudiante buscarPorCorreoNative(String correo);

	public List<Estudiante> buscarPorNombreNative(String nombre);

	public List<Estudiante> buscarPorNombreApellidoNamed(String nombre, String apellido);

	public List<Estudiante> buscarPorNombreEdadNamed(String nombre, int edad);

	public List<Estudiante> buscarPorApellidoEdadTypedNamed(String apellido, int edad);

	public Estudiante buscarPorNombreCorreoTypedNamed(String nombre, String correo);

	public Estudiante buscarPorApellidoCorreoNamedNative(String apellido, String correo);

	public List<Estudiante> buscarPorNombreApellidoNamedNative(String nombre, String apellido);

}
