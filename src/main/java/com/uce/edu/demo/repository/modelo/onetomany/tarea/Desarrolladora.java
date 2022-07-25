package com.uce.edu.demo.repository.modelo.onetomany.tarea;

import java.time.LocalDateTime;
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
@Table(name="desarrolladora")
public class Desarrolladora {
	
	@Id
	@Column(name = "desa_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "desa_id_seq")
	@SequenceGenerator(name = "desa_id_seq", sequenceName = "desa_id_seq", allocationSize = 1) //allocationSice es para la secuencia
	private Integer id;
	@Column(name = "desa_nombre")
	private String nombre;
	@Column(name = "desa_fecha_creacion")
	private LocalDateTime fechaCreacion;
	@Column(name = "desa_numero_empleados")
	private Integer numeroEmpleados; 
	@OneToMany(mappedBy = "desarrolladora")
	private List<Videojuego> videojuegos;
	@Override
	public String toString() {
		return "Desarrolladora [id=" + id + ", nombre=" + nombre + ", fechaCreacion=" + fechaCreacion
				+ ", numeroEmpleados=" + numeroEmpleados +  "]";
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
	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Integer getNumeroEmpleados() {
		return numeroEmpleados;
	}
	public void setNumeroEmpleados(Integer numeroEmpleados) {
		this.numeroEmpleados = numeroEmpleados;
	}
	public List<Videojuego> getVideojuegos() {
		return videojuegos;
	}
	public void setVideojuegos(List<Videojuego> videojuegos) {
		this.videojuegos = videojuegos;
	}
	
}
