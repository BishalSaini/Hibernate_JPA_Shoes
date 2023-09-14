package com.jsp.java;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class TestGetAll {  
	public static void main(String[] args) { 
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("vishu");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		
		String sql="Select s From Shoes"; 
		Query query=entityManager.createQuery(sql); 
		
		List<Shoes> shoes=query.getResultList(); 
		for(Shoes s:shoes) { 
				System.out.println("======================"); 
				System.out.println(s.getId()); 
				System.out.println(s.getBrand()); 
				System.out.println(s.getName()); 
				System.out.println(s.getPrice());  
				System.out.println("======================"); 
		}	
	} 
}

	 