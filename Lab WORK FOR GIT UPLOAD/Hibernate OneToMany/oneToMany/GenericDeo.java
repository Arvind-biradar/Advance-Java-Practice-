package oneToMany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.*;

public class GenericDeo {

	
	public void save(Object obj) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		
		tx.begin();
		em.merge(obj);
		tx.commit();
		emf.close();		
		}
	public Object fetchById(Class clazz, int id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Hibernate");
		try{
		EntityManager em=emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		Object obj =em.find(clazz,id);
		
		tx.commit();
		return obj;
		}
		finally {
		emf.close();
		}		
		}
	
	public void delete(Class clazz, int id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Hibernate");
		try{
		EntityManager em=emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		Object obj =em.find(clazz,id);
	      em.remove(obj);	
		tx.commit();
	
		}
		finally {
		emf.close();
		}		
		}
				
   
	
	

	
	
}
