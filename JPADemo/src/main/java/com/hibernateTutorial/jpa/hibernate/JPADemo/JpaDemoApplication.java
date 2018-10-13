package com.hibernateTutorial.jpa.hibernate.JPADemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hibernateTutorial.jpa.hibernate.JPADemo.entity.Course;
import com.hibernateTutorial.jpa.hibernate.JPADemo.repository.CourseRepository;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(JpaDemoApplication.class);
	
	@Autowired
	CourseRepository courseRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*Course courseById = courseRepository.findById(10001L);
		logger.info("Course 10001L details {} "+courseById);
		
		courseRepository.deleteById(10001L);*/
		
		//courseRepository.playWithEntityManager();
		
	}
}
