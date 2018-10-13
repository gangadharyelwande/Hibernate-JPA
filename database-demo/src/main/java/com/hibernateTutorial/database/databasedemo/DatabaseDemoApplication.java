package com.hibernateTutorial.database.databasedemo;

import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hibernateTutorial.database.databasedemo.entity.PersonJdbcDao;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner{
	
	
	@Autowired
	PersonJdbcDao personJdbcDao;
	
	private Logger logger = LoggerFactory.getLogger(DatabaseDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		logger.info("All users -> {}", personJdbcDao.findAll());
		
		
	}
}
