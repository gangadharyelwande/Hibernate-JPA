package com.hibernateTutorial.jpa.hibernate.JPADemo.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hibernateTutorial.jpa.hibernate.JPADemo.JpaDemoApplication;
import com.hibernateTutorial.jpa.hibernate.JPADemo.entity.Course;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JpaDemoApplication.class)
public class CourseRepositoryTest {
	
	@Autowired
	EntityManager em;
	
	@Autowired
	CourseRepository courseRepository;

	@Test
	public void findById_basic() {
		Course course = courseRepository.findById(10001L);
		//System.out.println("name of course-->"+course.getName());
		assertEquals("JPA in 50 Steps", course.getName());
	}
	
	@Test
	public void findById_basicWithUnequalCourseName() {
		Course course = courseRepository.findById(10001L);
		//System.out.println("name of course-->"+course.getName());
		assertNotEquals("JPA in 75 Steps", course.getName());
	}
}
