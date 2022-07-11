



/*Always   Start with Primary table Like the table have mappedBy is there ....add in this Teacher table  and then add in second table*/






//package com;
//import java.time.LocalDate;
//
//import javax.persistence.*;
//public class AccessEmp {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Hibernate");
//		EntityManager em=emf.createEntityManager();
//		EntityTransaction tx=em.getTransaction();
//		
//		tx.begin();
//		
//		Emp e=new Emp();
//		e.setDoj(LocalDate.of(2022,10,13));
//		e.setId(3);
//		e.setName("Vishal");
//		e.setSalary(47567.0);
//		em.persist(e);
//		tx.commit();
//		emf.close();
//	}
//
//}
