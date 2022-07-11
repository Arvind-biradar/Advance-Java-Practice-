package joinOfTable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import java.util.List;

import javax.persistence.*;

import org.hibernate.query.Query;



public class StateTinDao {

	public void adds(State addr) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(addr); //persist method will generate insert query
		
		tx.commit();
		emf.close();
	}
	
	public void addt(Tin addr) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(addr); //persist method will generate insert query
		
		tx.commit();
		emf.close();
	}
	
	
	public State fetchState(int no) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		State s=em.find(State.class,no); //persist method will generate insert query
		
		tx.commit();
		emf.close();
		return s;
		
	}

	public Tin fetchTin(int no) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		Tin s=em.find(Tin.class,no); //persist method will generate insert query
		
		tx.commit();
		emf.close();
		return s;
		
	}
	
	public void Update(State s) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.merge(s); //merge method will generate update query
		
		tx.commit();
		emf.close();
	
		
	}
	
	public List<State> GetStateByChar(String s) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		javax.persistence.Query q=em.createQuery("select s from State s where s.name like :sn");
		q.setParameter("sn", s+"%");
		List<State> list=q.getResultList();
		tx.commit();
		emf.close();
	
		return list;
	}
	
	
	public List<State> getByTinCode(String s) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		javax.persistence.Query q=em.createQuery("select s from State s join s.tin t where t.stateCode =:c");
		q.setParameter("c", s);
		List<State> list=q.getResultList();
		tx.commit();
		emf.close();
	
		return list;
	}
	
	public List<Tin> getTinCodeByStateName(String s) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		javax.persistence.Query q=em.createQuery("select t from State s join s.tin t where s.name =:c");
		q.setParameter("c", s);
		List<Tin> list=q.getResultList();
		tx.commit();
		emf.close();
	
		return list;
	}
	
	
	public List<State> getStateNameByTinCode(String s) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		javax.persistence.Query q=em.createQuery("select s.name from State s join s.tin t where t.stateCode =:c");
		q.setParameter("c", s);
		List<State> list=q.getResultList();
		tx.commit();
		emf.close();
	
		return list;
	}
	
	
}
