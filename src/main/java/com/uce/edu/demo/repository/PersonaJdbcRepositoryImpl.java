package com.uce.edu.demo.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.uce.edu.demo.to.PersonaTo;

@Repository
public class PersonaJdbcRepositoryImpl implements IPersonaJdbcRepository {

	// para conectar por jdbc
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public PersonaTo buscarPorId(int id) {
		// TODO Auto-generated method stub
		//mitas de <> la clase a retornor en este caso Persona  y dentro del argumento la clase en .class
		return this.jdbcTemplate.queryForObject("select * from persona where id=?",
				new Object[] {id}, 
				new BeanPropertyRowMapper<PersonaTo>(PersonaTo.class));
		
	}

	@Override
	public void insertar(PersonaTo p) {
		// TODO Auto-generated method stub
		// frase que esta en pgadmin
		this.jdbcTemplate.update("insert into persona (id, nombre, apellido) values (?, ?, ?)",
				new Object[] { p.getId(), p.getNombre(), p.getApellido() });
		// arreglo de objetos que se obtendran de Persona en el mismo orden, en este
		// caso id nombre apellido
	}

	@Override
	public void actualizar(PersonaTo p) {
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

	
	
	@Override
	public List<PersonaTo> buscartodos() {
		// TODO Auto-generated method stub
		return this.jdbcTemplate.query("select * from persona order by id desc", new PersonaRowMapper());
	}
	
	
	//esto hay que hacer para retornar en una consulkta que retorna un listadod e informacion como en el caso de buscar todos
	class  PersonaRowMapper implements RowMapper<PersonaTo>{

		@Override
		public PersonaTo mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			PersonaTo persona = new PersonaTo();
			persona.setId(rs.getInt("id"));
			persona.setNombre(rs.getString("nombre"));
			persona.setApellido(rs.getString("apellido"));
			return persona;
		}
		
	}

}
