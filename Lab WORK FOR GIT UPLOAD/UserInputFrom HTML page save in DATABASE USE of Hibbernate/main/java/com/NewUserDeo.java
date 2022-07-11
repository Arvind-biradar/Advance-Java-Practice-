package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class NewUserDeo {

	 void add(NewUser s) {
			
			

			EntityManagerFactory emf=Persistence.createEntityManagerFactory("Hibernate");
			EntityManager em=emf.createEntityManager();
			EntityTransaction tx=em.getTransaction();
			tx.begin();
			em.persist(s);
			tx.commit();
			emf.close();
		}
	
	
}
