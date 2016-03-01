package data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import org.springframework.transaction.annotation.Transactional;


@Transactional
public class SooperDAO {
	@PersistenceContext
	private EntityManager em;
	
	public Sooperiority getByID(int id) {
		return em.find(Sooperiority.class, id);
	}

	public List <Sooperiority> getAll() {
		 CriteriaQuery<Sooperiority> cq = em.getCriteriaBuilder().createQuery(Sooperiority.class);
	        cq.select(cq.from(Sooperiority.class));
	       List<Sooperiority> soopers = em.createQuery(cq).getResultList();
		return soopers;
	}
	
	public Boolean newEntry (Sooperiority s) {
		em.persist(s);
		return true;
	}
	
	public Boolean removeEntry (int i) {
		Sooperiority soops= em.find(Sooperiority.class, i);
		em.remove(soops);
		return true;
	}
} 
