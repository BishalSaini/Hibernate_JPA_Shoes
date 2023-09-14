package com.jsp.java;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDelete { 
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("vishu"); 
		EntityManager entityManager= entityManagerFactory.createEntityManager(); 
		EntityTransaction entityTransaction=entityManager.getTransaction(); 
		
		Shoes shoes=entityManager.find(Shoes.class, 1); 
		
		if(shoes!=null) { 
			entityTransaction.begin(); 
			entityManager.remove(shoes); 
			entityTransaction.commit();
		}else { 
			System.out.println("NoT DeleTed");
		}
	}
}
