package one_to_many_bi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TeacherDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("ganavi");
	EntityManager em;
	EntityTransaction et;
	
	public Teacher saveTeacher(Teacher tcr,List<Subject> sub){
		em = emf.createEntityManager();
		et = em.getTransaction();
		et.begin();
		em.persist(tcr);
		em.persist(sub);
		
		et.commit();
		System.out.println("******Data Stored*******");
		
		
		return tcr;
		
	}

}
