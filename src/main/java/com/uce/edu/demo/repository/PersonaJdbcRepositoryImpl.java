package com.uce.edu.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.uce.edu.demo.to.Persona;

@Repository
public class PersonaJdbcRepositoryImpl implements IPersonaJdbcRepository {

	// para conectar por jdbc
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Persona buscarPorId(int id) {
		// TODO Auto-generated method stub
		//mitas de <> la clase a retornor en este caso Persona  y dentro del argumento la clase en .class
		return this.jdbcTemplate.queryForObject("select * from persona where id=?",
				new Object[] {id}, 
				new BeanPropertyRowMapper<Persona>(Persona.class));
		
	}

	@Override
	public void insertar(Persona p) {
		// TODO Auto-generated method stub
		// frase que esta en pgadmin
		this.jdbcTemplate.update("insert into persona (id, nombre, apellido) values (?, ?, ?)",
				new Object[] { p.getId(), p.getNombre(), p.getApellido() });
		// arreglo de objetos que se obtendran de Persona en el mismo orden, en este
		// caso id nombre apellido
	}

	@Override
	public void actualizar(Persona p) {
		// TODO Auto-generated method stub
		this.jdbcTemplate.update("update persona set nombre=?,apellido=? where id=?",
				new Object[] { p.getNombre(), p.getApellido(), p.getId() });
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		this.jdbcTemplate.update("delete from persona where id=?",
				new Object[] {id});

	}

}
