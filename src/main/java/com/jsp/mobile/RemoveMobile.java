package com.jsp.mobile;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class RemoveMobile {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("aniket");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Mobile mobile = entityManager.find(Mobile.class,10);

		if(mobile!= null) {
			entityTransaction.begin();
			entityManager.remove(mobile);
			entityTransaction.commit();
			System.out.println(" object with above id deleted");
           }
		else {
			System.out.println("No found");
		}
		
	}
}


