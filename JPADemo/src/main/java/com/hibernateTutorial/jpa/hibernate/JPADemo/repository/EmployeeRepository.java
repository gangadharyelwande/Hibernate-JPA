package com.hibernateTutorial.jpa.hibernate.JPADemo.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hibernateTutorial.jpa.hibernate.JPADemo.entity.Employee;

@Repository
@Transactional
public class EmployeeRepository {
	
	private Logger logger = LoggerFactory.getLogger(EmployeeRepository.class);
	
	@Autowired
	EntityManager em;

	//Insert employee details
	public void insert(Employee employee) {
		em.persist(employee);
	}
}
