package com.uce.edu.demo.estudiante.repository.modelo;

public class EstudianteSencillo {
	
	private String apellido;
	private String correo;

	public EstudianteSencillo() {
		// TODO Auto-generated constructor stub
	}

	public EstudianteSencillo( String apellido, String correo) {
		
		this.apellido = apellido;
		this.correo = correo;
	}

	

	@Override
	public String toString() {
		return "EstudianteSencillo [apellido=" + apellido + ", correo=" + correo + "]";
	}

	// set y get
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	

}
