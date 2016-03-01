package data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;

public class Tester {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sooperPU");
		EntityManager em = emf.createEntityManager();

		 CriteriaQuery<Sooperiority> cq = em.getCriteriaBuilder().createQuery(Sooperiority.class);
	        cq.select(cq.from(Sooperiority.class));
	       List<Sooperiority> soopers = em.createQuery(cq).getResultList();
	       for(Sooperiority soop : soopers) {
	    	   System.out.println(soop.getStoreName());
	    	   System.out.println(soop.getAmount());
	    	   System.out.println(soop.getNumItems());
	       }
		
	}
}