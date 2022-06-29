package com.uce.edu.demo.estudiante.repository;

import com.uce.edu.demo.estudiante.to.EstudianteTo;

public interface IEstudianteRepository {
	
	public void ingresar(EstudianteTo e);
	
	public EstudianteTo buscar(int id);
	
	public void actualizar(EstudianteTo e);
	
	public void eliminar(int id);

}
