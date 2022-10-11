package com.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.boot.jaxb.mapping.spi.JaxbQueryHint;

public class UserDisplay {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ganavi");
		EntityManager em = emf.createEntityManager();

		String query = "SELECT u FROM User u";
		Query query2 = em.createQuery(query);
		List<User> list = query2.getResultList();
		list.forEach(a -> System.out.println(a.getId() + "\n" + a.getName() + "\n" + a.getEmail() + "\n"));
	}

}
