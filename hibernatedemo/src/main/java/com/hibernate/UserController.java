package com.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserController {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ganavi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		User user = new User();

		user.setId(103);
		user.setName("Kanishka");
		user.setEmail("kanish@gmail.com");

		et.begin();
		em.persist(user);
		et.commit();
		System.out.println("----------Data Stored----------");

	}

}
