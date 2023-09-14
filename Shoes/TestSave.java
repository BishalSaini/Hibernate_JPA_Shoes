package com.jsp.java;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave { 
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("vishu"); 
		EntityManager entityManager=entityManagerFactory.createEntityManager(); 
		EntityTransaction entityTransaction=entityManager.getTransaction(); 
		
		Shoes shoes=new Shoes();  
		shoes.setBrand("Nike");
		shoes.setName("Air Max 1 Clot");  
		shoes.setColour("Solar Red");
		shoes.setPrice(30000); 
		
		entityTransaction.begin(); 
		entityManager.persist(shoes); 
		entityTransaction.commit();
	}
}
