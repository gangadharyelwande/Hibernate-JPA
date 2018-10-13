package com.hibernateTutorial.jpa.hibernate.JPADemo.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;
import org.springframework.stereotype.Repository;

import com.hibernateTutorial.jpa.hibernate.JPADemo.entity.Course;

@Repository
public class CourseRepository {
	
	@Autowired
	EntityManager em;

	public Course findById(Long id) {
		
		return em.find(Course.class, id);
		
	}
}
