package com.jsp.mobile;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class MobileDriver {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("aniket");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Mobile mobile=new Mobile();
	
		mobile.setName("Iphone");
		mobile.setBrand("IOS");
		
		entityTransaction.begin();
		entityManager.persist(mobile);
		entityTransaction.commit();
		
		
		System.out.println("all good");
	}

}
