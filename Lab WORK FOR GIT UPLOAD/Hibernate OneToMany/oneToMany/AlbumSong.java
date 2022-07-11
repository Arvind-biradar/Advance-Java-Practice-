



/*Always   Start with Primary table Like the table have mappedBy is there ....add in this Teacher table  and then add in second table*/



package oneToMany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AlbumSong {

	
	/*public List<Song> fetchAllSOngByAlbumName(String name) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Hibernate");
		try{
		EntityManager em=emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		Query q=em.createQuery("select s from Song s join s.album where albumName= :n");
		q.setParameter("n",name);
		List<Song> list=q.getResultList();
		tx.commit();
		return list;
		}
		finally {
		emf.close();}	
		
		
		}*/
	
	
	public List<Song> fetchAllSongBYSIngerName(String name) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Hibernate");
		try{
		EntityManager em=emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		Query q=em.createQuery("select s from Song s join s.album where singerName like :n");
		q.setParameter("n","%"+name+"%");
		List<Song> list=q.getResultList();
		tx.commit();
		return list;
		}
		finally {
		emf.close();}	
		
		
		}
	
	
	
	
	
}
