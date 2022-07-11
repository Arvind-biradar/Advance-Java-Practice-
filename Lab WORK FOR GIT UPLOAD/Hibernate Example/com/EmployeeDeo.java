package com;
import java.util.List;

import javax.persistence.*;

public class EmployeeDeo {

 void add(NewAccess s) {
		
		

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		em.persist(s);
		tx.commit();
		emf.close();
	}
	
// 
  public NewAccess getFromId(int id) {

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em=emf.createEntityManager();  
		NewAccess na=em.find(NewAccess.class, id);
		emf.close();
		return na;
	  
  }


public List<NewAccess> getAll() {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Hibernate");
	EntityManager em=emf.createEntityManager();  
	
	Query q=em.createQuery("select e from NewAccess e ");
	List<NewAccess> na=q.getResultList();
	
	emf.close();
	return na;
} 



public List<NewAccess> getByName(String string) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Hibernate");
	EntityManager em=emf.createEntityManager();  
	
	Query q=em.createQuery("select e from NewAccess e where e.name=:string");
	q.setParameter("string", string);
	List<NewAccess> na=q.getResultList();
	
	emf.close();
	return na;
}


	
}
