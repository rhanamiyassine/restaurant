package ma.ac.insea.restaurant.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ma.ac.insea.restaurant.entities.Plainte;

@Repository
@Transactional 
public class PlainteDaoImpl implements PlainteDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Plainte> read() {	
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query  ... sort by last name
		Query query = currentSession.createQuery("from Plainte", Plainte.class);
		
		// execute query and get result list
		List<Plainte> Plaintes = query.getResultList();
				
		// return the results		
		return Plaintes;
	}

	@Override
	public void save(Plainte plainte) {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		// save/upate the Plainte ... finally LOL
		currentSession.saveOrUpdate(plainte);
	}

	@Override
	public Plainte getById(Long id) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// now retrieve/read from database using the primary key
		Plainte plainte = currentSession.get(Plainte.class, id);
		
		return plainte;
	}

	@Override
	public void delete(Long id) {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		// delete object with primary key
		Query query = currentSession.createQuery("delete from Plainte where id=:id");
		query.setParameter("id", id);
		query.executeUpdate();		
	}



}
