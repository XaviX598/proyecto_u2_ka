package com.uce.edu.demo.repository.modelo.manytomany.tarea;

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
@Table( name="librot_autort")
public class Librot_Autort {
	
	@Id
	@Column(name = "libr_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "libr_id_seq")
	@SequenceGenerator(name = "libr_id_seq", sequenceName = "libr_id_seq", allocationSize = 1) //allocationSice es para la secuencia
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="libr_id_librot")
	private Librot librot;
	
	@ManyToOne
	@JoinColumn(name="libr_id_autort")
	private Autort autort;

	
	//set y get
	
	public Librot getLibrot() {
		return librot;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setLibrot(Librot librot) {
		this.librot = librot;
	}

	public Autort getAutort() {
		return autort;
	}

	public void setAutort(Autort autort) {
		this.autort = autort;
	}
	
	

}
