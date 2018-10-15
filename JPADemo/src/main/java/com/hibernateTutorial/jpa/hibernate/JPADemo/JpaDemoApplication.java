package com.hibernateTutorial.jpa.hibernate.JPADemo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hibernateTutorial.jpa.hibernate.JPADemo.entity.Course;
import com.hibernateTutorial.jpa.hibernate.JPADemo.entity.FullTimeEmployee;
import com.hibernateTutorial.jpa.hibernate.JPADemo.entity.PartTimeEmployee;
import com.hibernateTutorial.jpa.hibernate.JPADemo.entity.Review;
import com.hibernateTutorial.jpa.hibernate.JPADemo.entity.Student;
import com.hibernateTutorial.jpa.hibernate.JPADemo.repository.CourseRepository;
import com.hibernateTutorial.jpa.hibernate.JPADemo.repository.EmployeeRepository;
import com.hibernateTutorial.jpa.hibernate.JPADemo.repository.StudentRepository;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(JpaDemoApplication.class);
	
	@Autowired
	CourseRepository courseRepository;
	
	@Autowired
	StudentRepository studentRepository;
	
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*Course courseById = courseRepository.findById(10001L);
		logger.info("Course 10001L details {} "+courseById);
		
		courseRepository.deleteById(10001L);*/
		
		//courseRepository.playWithEntityManager();
		
		//studentRepository.saveStudentWithPassport();
		
		//courseRepository.addReviewsForCourse();
		
		//add 2 reviews to it
		
		/*List<Review> reviews = new ArrayList<>();
		
		reviews.add(new Review("5", "Great Hands-on Stuff."));	
		reviews.add(new Review("5", "Hatsoff."));
		
		courseRepository.addReviewsForCourse(10003L, reviews);
	*/	
		
		//Commented on October 14
		/*studentRepository.insertStudentAndCourse(new Student("Jack"),
				 new Course("Microservices in 100 Steps"));
		*/
		
		employeeRepository.insert(new PartTimeEmployee("Jill", new BigDecimal("50")));
		employeeRepository.insert(new FullTimeEmployee("Jack", new BigDecimal("10000")));
		
	}
}
