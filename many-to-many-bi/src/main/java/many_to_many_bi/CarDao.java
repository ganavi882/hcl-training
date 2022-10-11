package many_to_many_bi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CarDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("ganavi");
	EntityManager em;
	EntityTransaction et;
	
	public List<Car> saveCar(List<Car> cars,List<Feature> ftrs){
		em = emf.createEntityManager();
		et = em.getTransaction();
		et.begin();
		
		for(Feature ftr:ftrs){
			em.persist(ftr);
		}
		for( Car car:cars){
			em.persist(car);
		}
		et.commit();
		System.out.println("****Data Stored*****");
		return cars;
		
		
		
	}

}
