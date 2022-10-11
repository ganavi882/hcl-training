package org.alvas.autogeneratedid;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class EmployeeController {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ganavi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Employee emp  = new Employee();
		
		emp.setName("Mike");
		emp.setEmail("mk@gmail.com");
		et.begin();
		em.persist(emp);
		et.commit();
		
		System.out.println("****Data stored****");
		
	}

}
