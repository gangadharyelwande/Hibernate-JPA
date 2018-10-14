package com.hibernateTutorial.jpa.hibernate.JPADemo.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hibernateTutorial.jpa.hibernate.JPADemo.entity.Passport;
import com.hibernateTutorial.jpa.hibernate.JPADemo.entity.Student;

@Repository
@Transactional
public class StudentRepository {
	
	@Autowired
	EntityManager em;

	public Student findById(Long id) {
		
		return em.find(Student.class, id);
		
	}
	
	public void deleteById(Long id) {
		Student Student = findById(id);
		em.remove(Student);
	}
	
	public Student save(Student Student) {

		if (Student.getId() == null) {
			em.persist(Student);
		} else {
			em.merge(Student);
		}

		return Student;
	}
	
	public void saveStudentWithPassport() {
		Passport passport = new Passport("Z123456");
		em.persist(passport);

		Student student = new Student("Mike");

		student.setPassport(passport);
		em.persist(student);	
	}
	
}
