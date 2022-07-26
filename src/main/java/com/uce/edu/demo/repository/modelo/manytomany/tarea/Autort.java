package com.uce.edu.demo.repository.modelo.manytomany.tarea;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table( name="autort")
public class Autort {
	
	@Id
	@Column(name = "auto_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "auto_id_seq")
	@SequenceGenerator(name = "auto_id_seq", sequenceName = "auto_id_seq", allocationSize = 1) //allocationSice es para la secuencia
	private Integer id;
	@Column(name = "auto_nombre")
	private String nombre;
	@OneToMany(mappedBy = "autort")
	private List<Librot_Autort> libroAutor;
	@Override
	public String toString() {
		return "Autort [id=" + id + ", nombre=" + nombre + "]";
	}
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
	public List<Librot_Autort> getLibroAutor() {
		return libroAutor;
	}
	public void setLibroAutor(List<Librot_Autort> libroAutor) {
		this.libroAutor = libroAutor;
	}
	
	
}
