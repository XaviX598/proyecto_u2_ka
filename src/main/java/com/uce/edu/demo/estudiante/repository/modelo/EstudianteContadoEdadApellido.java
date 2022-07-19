package com.uce.edu.demo.estudiante.repository.modelo;

import java.io.Serializable;

public class EstudianteContadoEdadApellido implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer edad;
	private Long numero;

	public EstudianteContadoEdadApellido() {
		// TODO Auto-generated constructor stub
	}

	public EstudianteContadoEdadApellido(Integer edad, Long numero) {

		this.edad = edad;
		this.numero = numero;
	}

	// set y get

	public Long getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return "EstudianteContadoEdadApellido [edad=" + edad +  ", numero=" + numero + "]";
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	
}
