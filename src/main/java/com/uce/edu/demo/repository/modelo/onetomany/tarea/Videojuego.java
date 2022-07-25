package com.uce.edu.demo.repository.modelo.onetomany.tarea;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="videojuego")
public class Videojuego {
	
	@Id
	@Column(name = "vide_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vide_id_seq")
	@SequenceGenerator(name = "vide_id_seq", sequenceName = "vide_id_seq", allocationSize = 1) //allocationSice es para la secuencia
	private Integer id;
	@Column(name = "vide_nombre")
	private String nombre;
	@Column(name = "vide_genero")
	private String genero;
	@Column(name = "vide_valor")
	private Integer valor;
	@ManyToOne
	@JoinColumn(name="vide_id_desarrolladora")
	private Desarrolladora desarrolladora;
	@Override
	public String toString() {
		return "Videojuego [id=" + id + ", nombre=" + nombre + ", genero=" + genero + ", valor=" + valor
				+  "]";
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
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Integer getValor() {
		return valor;
	}
	public void setValor(Integer valor) {
		this.valor = valor;
	}
	public Desarrolladora getDesarrolladora() {
		return desarrolladora;
	}
	public void setDesarrolladora(Desarrolladora desarrolladora) {
		this.desarrolladora = desarrolladora;
	}
	

}
