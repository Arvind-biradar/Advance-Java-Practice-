package bidirectionalJoin;

import java.util.List;

import javax.persistence.*;

public class Dao {
	
	
	void add(Cars c) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		
		tx.begin();
		em.persist(c);
		tx.commit();
		emf.close();
		
	}

	public List<Cars> getCarName(String c) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		
		tx.begin();
		Query q=em.createQuery("select c from Cars c join c.function f where c.owner=:n");
		q.setParameter("n",c);
		List<Cars> c2=q.getResultList();
	    tx.commit();
		emf.close();
		return c2;
		
	}
	
	public List<Function> getCarDetailsByCarID(int c) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		
		tx.begin();
		Query q=em.createQuery("select f from Function f  join f.cars c where c.car_id=:n");
		q.setParameter("n",c);
		List<Function> c2=q.getResultList();
	    tx.commit();
		emf.close();
		return c2;
		
	}
	
public List<Cars> getCarSubString(String c) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		
		tx.begin();
		Query q=em.createQuery("select c from Cars c join c.function f where c.model like:n");
		q.setParameter("n","%"+c+"%");
		List<Cars> c2=q.getResultList();
	    tx.commit();
		emf.close();
		return c2;
		
	}
	
}
