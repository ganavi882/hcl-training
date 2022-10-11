package com.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UserNameByParameter {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ganavi");
		EntityManager em = emf.createEntityManager();

		String query = "SELECT u FROM User u where u.email=:name";
		Query query2 = em.createQuery(query);
		query2.setParameter("name", "sh@gmail.com");
		List<User> list = query2.getResultList();
		list.forEach(a -> System.out.println(a.getId() + "\n" + a.getName() + "\n" + a.getEmail() + "\n"));

	}

}
