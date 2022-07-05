package com.uce.edu.demo.repository.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

//tambien debemos decir que es una entidad
@Entity
//para decir que la clase representa la tablla se utiliza anotaciones de javax.persistence
@Table(name = "persona1")
public class Persona {
	
	//para realizar el mapeo se una anotacion para cada atributo @Column( name = "nombreatributo")
	//para el atributo identificador se usa una anotacion@Id
	//nunca usar mapas primitivos sino emvoltorios osea no int, float, double, sino Integer...
	@Id
	@Column( name = "id")
	//Con la secuencia ya no hace falta poner un id ya que esta en secuencia
	//secuencia, no es necesario que se llame igual que en la abse
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="pers_id_seq")
	//secuencia de la base, obigario el mismo nombre (En el segundo "") y luego ponemos el incremento por defento en 50
	@SequenceGenerator(name="pers_id_seq", sequenceName="pers_id_seq", allocationSize = 1)
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
