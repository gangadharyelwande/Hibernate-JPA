package com.hibernateTutorial.database.databasedemo.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PersonJdbcDao {
	
	@Autowired
	JdbcTemplate jdbcTemplateObj;
	
	public List<Person> findAll() {
		return jdbcTemplateObj.query("select * from person", 
					new BeanPropertyRowMapper<Person>(Person.class));
	}


}
