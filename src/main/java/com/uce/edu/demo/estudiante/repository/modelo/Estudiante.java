package com.uce.edu.demo.estudiante.repository.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "estudiante")
@NamedQuery(name = "Estudiante.buscarPorNombreApellido", query = "SELECT e FROM Estudiante e WHERE e.nombre = :datoNombre AND e.apellido = :datoApellido")
@NamedQuery(name = "Estudiante.buscarPorNombreEdad", query = "SELECT e FROM Estudiante e WHERE e.nombre = :datoNombre AND e.edad = :datoEdad")
@NamedQuery(name = "Estudiante.buscarPorApellidoEdad", query = "SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido AND e.edad = :datoEdad")
@NamedQuery(name = "Estudiante.buscarPorNombreCorreo", query = "SELECT e FROM Estudiante e WHERE e.nombre = :datoNombre AND e.correo = :datoCorreo")

@NamedNativeQueries({
	@NamedNativeQuery(name = "Estudiante.buscarPorApellidoCorreoNative", query = "SELECT * FROM estudiante Where estu_apellido=:datoApellido AND estu_correo=:datoCorreo", resultClass = Estudiante.class),
	@NamedNativeQuery(name = "Estudiante.buscarPorNombreNativeApellido", query = "SELECT * FROM estudiante Where estu_nombre=:datoNombre AND estu_apellido=:datoApellido", resultClass = Estudiante.class) })
public class Estudiante {

	@Id
	@Column(name = "estu_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estu_id_seq")
	@SequenceGenerator(name = "estu_id_seq", sequenceName = "estu_id_seq", allocationSize = 1)
	private Integer id;
	@Column(name = "estu_nombre")
	private String nombre;
	@Column(name = "estu_apellido")
	private String apellido;
	@Column(name = "estu_correo")
	private String correo;
	@Column(name = "estu_edad")
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
