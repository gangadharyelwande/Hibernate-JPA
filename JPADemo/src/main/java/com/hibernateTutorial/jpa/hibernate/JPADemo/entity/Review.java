package com.hibernateTutorial.jpa.hibernate.JPADemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Review {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String description;
	private String rating;
	

	protected Review() {
		
	}
	
	public Review(String rating, String description) {
		this.rating = rating;
		this.description = description;
	}
	
	public String getRating() {
			return rating;
		}

		public void setRating(String rating) {
			this.rating = rating;
		}

	public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return String.format("Review[%s %s]", rating, description);
	}
	
}
