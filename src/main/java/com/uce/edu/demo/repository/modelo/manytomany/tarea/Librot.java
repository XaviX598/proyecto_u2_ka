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
@Table( name="librot")
public class Librot {
	
	@Id
	@Column(name = "libr_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "libr_id_seq")
	@SequenceGenerator(name = "libr_id_seq", sequenceName = "libr_id_seq", allocationSize = 1) //allocationSice es para la secuencia
	private Integer id;
	@Column(name = "libr_titulo")
	private String titulo;
	@Column(name = "libr_cantidad_paginas")
	private Integer cantidadPaginas;
	//la tabla principal puedes ser o  Autor o  Libros la principal en este caso es libro
	@OneToMany(mappedBy = "librot")
	private List<Librot_Autort> libroAutor;
	@Override
	public String toString() {
		return "Librot [id=" + id + ", titulo=" + titulo + ", cantidadPaginas=" + cantidadPaginas + "]";
	}
	
	//set y get
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Integer getCantidadPaginas() {
		return cantidadPaginas;
	}
	public void setCantidadPaginas(Integer cantidadPaginas) {
		this.cantidadPaginas = cantidadPaginas;
	}

	public List<Librot_Autort> getLibroAutor() {
		return libroAutor;
	}

	public void setLibroAutor(List<Librot_Autort> libroAutor) {
		this.libroAutor = libroAutor;
	}

	

}
