package com.uce.edu.demo.estudiante.repository.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "estudiante")
@NamedQuery(name = "Estudiante.buscarPorNombreApellido", query = "SELECT e FROM Estudiante e WHERE e.nombre = :datoNombre AND e.apellido = :datoApellido")
@NamedQuery(name = "Estudiante.buscarPorNombreEdad", query = "SELECT e FROM Estudiante e WHERE e.nombre = :datoNombre AND e.edad = :datoEdad")
@NamedQuery(name = "Estudiante.buscarPorApellidoEdad", query = "SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido AND e.edad = :datoEdad")
@NamedQuery(name = "Estudiante.buscarPorNombreCorreo", query = "SELECT e FROM Estudiante e WHERE e.nombre = :datoNombre AND e.correo = :datoCorreo")
public class Estudiante {

	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellido")
	private String apellido;
	@Column(name = "correo")
	private String correo;
	@Column(name = "edad")
	private Integer edad;

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo
				+ ", edad=" + edad + "]";
	}

	// set y get
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

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

}
