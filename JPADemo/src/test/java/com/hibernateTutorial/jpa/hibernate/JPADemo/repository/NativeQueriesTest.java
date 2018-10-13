package com.hibernateTutorial.jpa.hibernate.JPADemo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hibernateTutorial.jpa.hibernate.JPADemo.JpaDemoApplication;
import com.hibernateTutorial.jpa.hibernate.JPADemo.entity.Course;



@RunWith(SpringRunner.class)
@SpringBootTest(classes = JpaDemoApplication.class)
public class NativeQueriesTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	EntityManager em;

	@Test
	public void native_queries_basic() {
		Query query = em.createNativeQuery("SELECT * FROM COURSE", Course.class);
		List resultList = query.getResultList();
		logger.info("SELECT * FROM COURSE  -> {}", resultList);
		//SELECT * FROM COURSE  -> [Course[Web Services in 100 Steps], Course[JPA in 50 Steps - Updated], Course[Spring in 50 Steps], Course[Spring Boot in 100 Steps]]
	}


}
