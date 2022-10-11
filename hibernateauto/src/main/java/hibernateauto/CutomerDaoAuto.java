package hibernateauto;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class CutomerDaoAuto {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("ganavi");
	EntityManager em;
	EntityTransaction et;
	
	public CustomerAuto saveCustomer(CustomerAuto cus){
		em=emf.createEntityManager();
		et=em.getTransaction();
		
		if(cus!=null){
			et.begin();
			em.persist(cus);
			et.commit();
			System.out.println("***Data stored***");
		}
		
		return cus;
}
	
	public CustomerAuto updateCustomer(int id,String name) {
		em=emf.createEntityManager();
		et=em.getTransaction();
		CustomerAuto cus=em.find(CustomerAuto.class, id);
		cus.setName(name);
		if(cus!=null){
			et.begin();
			em.merge(cus);
			et.commit();
			System.out.println("***Data updated***");
		}
		return cus;
		
		
	}
	
	public CustomerAuto deleteCustomer(int id) {
		em=emf.createEntityManager();
		et=em.getTransaction();
		CustomerAuto cus=em.find(CustomerAuto.class, id);
		
		if(cus!=null){
			et.begin();
			em.remove(cus);
			et.commit();
			System.out.println("***Data deleted***");
		}
		return cus;
	}
	
	public List<CustomerAuto> displayAll(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ganavi");
		EntityManager em = emf.createEntityManager();

		String query = "SELECT u FROM CustomerAuto u";
		Query query2 = em.createQuery(query);
		List<CustomerAuto> list = query2.getResultList();
		return list;
	}
	
	
}


