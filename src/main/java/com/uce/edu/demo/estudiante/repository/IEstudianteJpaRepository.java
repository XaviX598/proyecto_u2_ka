package com.uce.edu.demo.estudiante.repository;

import java.util.List;

import com.uce.edu.demo.estudiante.repository.modelo.Estudiante;
import com.uce.edu.demo.estudiante.repository.modelo.EstudianteContadoEdadApellido;
import com.uce.edu.demo.estudiante.repository.modelo.EstudianteSencillo;

public interface IEstudianteJpaRepository {
	
	public void ingresar(Estudiante e);
	
	public Estudiante buscar(int id);
	
	public void actualizar(Estudiante e);
	
	public void eliminar(int id);
	
	public List<Estudiante> buscarPorEdadTyped(int edad);
	
	public Estudiante buscarPorCorreoTyped(String correo);
	
	public Estudiante buscarPorCorreoNative(String correo);
	
	public List<Estudiante> buscarPorNombreNative(String nombre);
	
	public List<Estudiante>  buscarPorNombreApellidoNamed(String nombre, String apellido);
	
	public List<Estudiante>  buscarPorNombreEdadNamed(String nombre, int edad);
	
	public List<Estudiante>  buscarPorApellidoEdadTypedNamed(String apellido, int edad);
	
	public Estudiante  buscarPorNombreCorreoTypedNamed(String nombre,String correo);
	
	public Estudiante buscarPorApellidoCorreoNamedNative(String apellido, String correo);
	
	public List<Estudiante> buscarPorNombreApellidoNamedNative(String nombre, String apellido);
	
	public List<Estudiante> busquedaDinamicaNombreApellidoEdad(String nombre, String apellido, int edad);
	
	public List<Estudiante> busquedaDinamicaIdCorreo(int id, String correo);	
	
	public List<EstudianteSencillo> busquedaApellidoCorreo( String apellido);
	
	public List<EstudianteContadoEdadApellido> consultarEdadConApellido(String apellido);

}
