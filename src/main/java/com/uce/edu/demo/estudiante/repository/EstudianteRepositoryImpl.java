package com.uce.edu.demo.estudiante.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.uce.edu.demo.estudiante.to.EstudianteTo;
@Repository
public class EstudianteRepositoryImpl implements IEstudianteRepository{

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void ingresar(EstudianteTo e) {
		this.jdbcTemplate.update("insert into estudiante (id, nombre, apellido, correo, edad) values (?, ?, ?, ?, ?)",
				new Object[] { e.getId(), e.getNombre(), e.getApellido(), e.getCorreo(), e.getEdad() });
		
	}

	@Override
	public EstudianteTo buscar(int id) {
		// TODO Auto-generated method stub
		return this.jdbcTemplate.queryForObject("select * from estudiante where id=?",
				new Object[] {id}, 
				new BeanPropertyRowMapper<EstudianteTo>(EstudianteTo.class));
	}

	@Override
	public void actualizar(EstudianteTo e) {
		this.jdbcTemplate.update("update estudiante set nombre=?,apellido=?, correo=?, edad=? where id=?",
				new Object[] { e.getNombre(), e.getApellido(), e.getCorreo(), e.getEdad(), e.getId() });
		
	}

	@Override
	public void eliminar(int id) {
		this.jdbcTemplate.update("delete from estudiante where id=?",
				new Object[] {id});
		
	}

}
