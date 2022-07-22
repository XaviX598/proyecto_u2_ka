package com.uce.edu.demo.onetone.repository.modelo;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "pasaporte")
public class Pasaporte {
	
	@Id
	@Column(name = "pasa_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pasa_id_seq")
	@SequenceGenerator(name = "pasa_id_seq", sequenceName = "pasa_id_seq", allocationSize = 1) // allocationSice es para// la secuencia																				
	private Integer id;
	@Column(name="pasa_numero")
	private Integer numero;
	@Column(name="pasa_fecha_emision")
	private LocalDateTime fechaEmision;
	@Column(name="pasa_fecha_caducidad")
	private LocalDateTime fechaCaducidad;
	@OneToOne( cascade = CascadeType.ALL)
	@JoinColumn(name = "ciud_id_ciudadanota")
	private Ciudadanota ciudadanota;
	
	@Override
	public String toString() {
		return "Pasaporte [id=" + id + ", numero=" + numero + ", fechaEmision=" + fechaEmision + ", fechaCaducidad="
				+ fechaCaducidad +  "]";
	}
	
	//set y get
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public LocalDateTime getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(LocalDateTime fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	public LocalDateTime getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(LocalDateTime fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	public Ciudadanota getCiudadanota() {
		return ciudadanota;
	}
	public void setCiudadanota(Ciudadanota ciudadano) {
		this.ciudadanota = ciudadano;
	}
	
	

}
