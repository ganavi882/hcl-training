package one_to_one_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("ganavi");
	EntityManager em;
	EntityTransaction et;
	
	public Person savePerson(Person per,Pan pan){
		em = emf.createEntityManager();
		et = em.getTransaction();
		et.begin();
		em.persist(per);
		em.persist(pan);
		
		et.commit();
		System.out.println("******Data Stored*******");

		return per;
	}
}
