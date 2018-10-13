package com.hibernateTutorial.jpa.hibernate.JPADemo.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
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
	
	@Test
	@DirtiesContext
	public void deleteById_basic() {
		courseRepository.deleteById(10002L);
		assertNull(courseRepository.findById(10002L));
	}
	
	@Test
	@DirtiesContext
	public void save_basic() {
		// get a course
		Course course = courseRepository.findById(10001L);
		assertEquals("JPA in 50 Steps", course.getName());

		// update details
		course.setName("JPA in 50 Steps - Updated");
		courseRepository.save(course);

		// check the value
		Course course1 = courseRepository.findById(10001L);
		assertEquals("JPA in 50 Steps - Updated", course1.getName());
	}

}
