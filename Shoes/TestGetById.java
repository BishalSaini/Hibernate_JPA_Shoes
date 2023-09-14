package com.jsp.java;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetById {  
	public static void main(String[] args) {

	EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("vishu"); 
	EntityManager entityManager= entityManagerFactory.createEntityManager(); 
	
	Shoes car=entityManager.find(Shoes.class,1);
	System.out.println(car.getId()); 
	System.out.println(car.getBrand()); 
	System.out.println(car.getName()); 
	System.out.println(car.getPrice());  
	}

}
