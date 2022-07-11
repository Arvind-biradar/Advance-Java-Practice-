package manyToMany;

import java.util.*;

import javax.persistence.*;

public class Dao {

	
	
	public List<Student> fetchAllStudentByTeacherName(String teacher){
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		Query q=em.createQuery("select s from Student s join s.teacher t where teacherName=:n");
		q.setParameter("n",teacher);
		List<Student> list=q.getResultList();
		tx.commit();
		emf.close();
		return list;
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
