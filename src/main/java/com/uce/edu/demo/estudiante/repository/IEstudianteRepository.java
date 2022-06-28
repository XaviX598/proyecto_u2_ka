package com.uce.edu.demo.estudiante.repository;

import com.uce.edu.demo.estudiante.to.Estudiante;

public interface IEstudianteRepository {
	
	public void ingresar(Estudiante e);
	
	public Estudiante buscar(int id);
	
	public void actualizar(Estudiante e);
	
	public void eliminar(int id);

}
