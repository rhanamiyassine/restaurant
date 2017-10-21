package ma.ac.insea.restaurant.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ma.ac.insea.restaurant.entities.Repas;

@Repository
@Transactional 
public class RepasDaoImpl implements RepasDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Repas> read() {	
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query  ... sort by last name
		Query query = currentSession.createQuery("from Repas", Repas.class);
		
		// execute query and get result list
		List<Repas> Repas = query.getResultList();
				
		// return the results		
		return Repas;
	}

	@Override
	public void save(Repas repas) {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		// save/upate the Repas ... finally LOL
		currentSession.saveOrUpdate(repas);
	}

	@Override
	public Repas getById(Long id) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// now retrieve/read from database using the primary key
		Repas repas = currentSession.get(Repas.class, id);
		
		return repas;
	}

	@Override
	public void delete(Long id) {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		// delete object with primary key
		Query query = currentSession.createQuery("delete from Repas where id=:id");
		query.setParameter("id", id);
		query.executeUpdate();		
	}



}
