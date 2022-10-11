package org.alvs.one_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonDao {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("ganavi");
	EntityManager em;
	EntityTransaction et;
	
	public Person savePerson(Person pr,Adhar adr) {
		em=emf.createEntityManager();
		et=em.getTransaction();
		et.begin();
		em.persist(pr);
		em.persist(adr);
		et.commit();
		System.out.println("******Data Inserted*****");
		return pr;
		
	}
	
	public Person getDetails(int id){
		em=emf.createEntityManager();
		Person person=em.find(Person.class, id);
		
		return person;
		
	}
	
	public Person deleteById(int id){
		em=emf.createEntityManager();
		et=em.getTransaction();
		Person per=em.find(Person.class, id);
		Adhar adhr=em.find(Adhar.class, per.getAdhar().getId());
	
			et.begin();
			em.remove(per);
			em.remove(adhr);
			et.commit();
			System.out.println("***Data deleted***");
		
		return per;
	}
	
	public Person updateCustomer(int id,String name,long adharNo) {
		em=emf.createEntityManager();
		et=em.getTransaction();
		Person per=em.find(Person.class, id);
		
		per.setName(name);
		per.getAdhar().setAdharNo(adharNo);
		Adhar adhr=em.find(Adhar.class, per.getAdhar().getId());
		
			et.begin();
			em.merge(per);
			em.merge(adhr);
			et.commit();
			System.out.println("***Data updated***");
			return per;
		
	}

}
