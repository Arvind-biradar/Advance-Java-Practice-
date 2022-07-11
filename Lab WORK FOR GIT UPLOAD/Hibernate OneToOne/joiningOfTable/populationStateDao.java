package joiningOfTable;
import javax.persistence.*;
public class populationStateDao {

	
	void adds(state s) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		
		tx.begin();
		em.persist(s);
		tx.commit();
		emf.close();
		
		
	}
	
	
	void addp(population p) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		
		tx.begin();
		em.persist(p);
		tx.commit();
		emf.close();
		
		
	}

}
