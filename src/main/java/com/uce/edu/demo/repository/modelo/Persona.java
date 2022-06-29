package com.uce.edu.demo.repository.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//tambien debemos decir que es una entidad
@Entity
//para decir que la clase representa la tablla se utiliza anotaciones de javax.persistence
@Table(name = "persona")
public class Persona {
	
	//para realizar el mapeo se una anotacion para cada atributo @Column( name = "nombreatributo")
	//para el atributo identificador se usa una anotacion@Id
	//nunca usar mapas primitivos sino emvoltorios osea no int, float, double, sino Integer...
	@Id
	@Column( name = "id")
	private Integer id;
	@Column( name = "nombre")
	private String nombre;
	@Column( name = "apellido")
	private String apellido;
	
	//set y get
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
	
	

}
