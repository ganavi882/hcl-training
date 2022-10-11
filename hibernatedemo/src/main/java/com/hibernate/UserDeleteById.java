package com.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserDeleteById {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ganavi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		User user = em.find(User.class, 103);
		et.begin();
		em.remove(user);
		et.commit();

		System.out.println("******Deleted Successfully*******");

	}

}
