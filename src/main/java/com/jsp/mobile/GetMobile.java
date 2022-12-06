package com.jsp.mobile;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetMobile {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("aniket");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Mobile mobile = entityManager.find(Mobile.class, 1);
		
		if(mobile!= null) {
			System.out.println(mobile.getBrand());
			System.out.println(mobile.getName());
			System.out.println(mobile.getId());
           }
		else {
			System.out.println("No mobile object found");
		}
	}

}
