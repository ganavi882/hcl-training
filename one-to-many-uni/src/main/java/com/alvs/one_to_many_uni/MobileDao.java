package com.alvs.one_to_many_uni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MobileDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("ganavi");
	EntityManager em;
	EntityTransaction et;

	public Mobile saveMobile(Mobile mob, Sim sim, Sim sim2) {
		em = emf.createEntityManager();
		et = em.getTransaction();
		et.begin();
		em.persist(mob);
		em.persist(sim);
		em.persist(sim2);
		et.commit();
		System.out.println("******Data Inserted*****");
		return mob;

	}

	public Mobile deleteMobileById(int id) {
		em = emf.createEntityManager();
		et = em.getTransaction();
		Mobile mob = em.find(Mobile.class, id);
		Sim sim = em.find(Sim.class, mob.getId());
		et.begin();
		em.remove(sim);

		et.commit();
		System.out.println("............Data deleted.........");
		return mob;

	}

	public Mobile getById(int id) {
		em = emf.createEntityManager();
		et = em.getTransaction();
		Mobile mob = em.find(Mobile.class, id);

		System.out.println(mob);

		return mob;
	}

	public Mobile updateById(int id, String prov, String type) {
		em = emf.createEntityManager();
		et = em.getTransaction();
		Mobile mob = em.find(Mobile.class, id);
		Sim sim = em.find(Sim.class, mob.getId());
		sim.setProvider(prov);
		sim.setType(type);

		et.begin();
		em.merge(sim);
		et.commit();
		System.out.println("............Data updated.........");
		return mob;
	}
}
