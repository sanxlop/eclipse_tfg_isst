package es.upm.dit.isst.t4.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import es.upm.dit.isst.t4.model.TFG;

public class TFGDAOImpl implements TFGDAO {

	private static TFGDAOImpl instance;
	private TFGDAOImpl () {
	}
	
	public static TFGDAOImpl getInstance() {
		if ( instance == null )
			instance = new TFGDAOImpl();
		return instance ;
	}
	
	@Override
	public TFG create(String autor, String titulo, String resumen,
			String tutor) {
		
		TFG tfg = null;
		EntityManager em = EMFService.get().createEntityManager();
		tfg = new TFG (autor, titulo, resumen, tutor);
		em.persist(tfg);
		em.close();
		return tfg;
		
	}

	@Override
	public List<TFG> read() {

		EntityManager em = EMFService.get().createEntityManager();
		Query q = em.createQuery("select m from TFG m");
		List<TFG> res = q.getResultList();
		em.close();
		return res;
		
	}

	@Override
	public TFG update(TFG tfg) {

		EntityManager em = EMFService.get().createEntityManager();
		TFG res = em.merge(tfg);
		em.close();
		return res;
		
	}

	@Override
	public void delete(String id) {
		
		EntityManager em = EMFService.get().createEntityManager();
		try {
			TFG todo = em.find(TFG.class, id);
			em.remove(todo);
		} finally {
			em.close();
		}

	}

}
