package com.uce.edu.demo.to;

public class PersonaTo {
	
	private int id;
	private String nombre;
	private String apellido;
	
	// constructor por defecto 
	public PersonaTo() {
		
	}
	//constructor diferencte (con argumentos) al por defecto debemos tambien poner el por defecto
	public PersonaTo(int id, String nombre, String apellido) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	
	
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	//set y get
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	

}
