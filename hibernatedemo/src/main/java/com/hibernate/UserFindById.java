package com.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;

public class UserFindById {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ganavi");
		EntityManager em = emf.createEntityManager();
		
		
		User user = em.find(User.class, 102);
		System.out.println(user.toString());

	}

}
