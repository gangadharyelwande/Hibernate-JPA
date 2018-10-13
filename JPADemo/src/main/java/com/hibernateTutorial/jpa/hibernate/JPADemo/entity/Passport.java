package com.hibernateTutorial.jpa.hibernate.JPADemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Passport {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String number;

	protected Passport() {
		
	}

	public Passport(String number) {
		this.number = number;
	}
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

		public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return String.format("Passport Number[%s]", number);
	}
	
}
