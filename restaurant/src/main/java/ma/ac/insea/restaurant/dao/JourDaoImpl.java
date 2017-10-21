package ma.ac.insea.restaurant.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ma.ac.insea.restaurant.entities.Jour;

@Repository
@Transactional 
public class JourDaoImpl implements JourDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Jour> read() {	
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query  ... sort by last name
		Query query = currentSession.createQuery("from Jour", Jour.class);
		
		// execute query and get result list
		List<Jour> Jour = query.getResultList();
				
		// return the results		
		return Jour;
	}

	@Override
	public void save(Jour jour) {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		// save/upate the Jour ... finally LOL
		currentSession.saveOrUpdate(jour);
	}

	@Override
	public Jour getById(Long id) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// now retrieve/read from database using the primary key
		Jour jour = currentSession.get(Jour.class, id);
		
		return jour;
	}

	@Override
	public void delete(Long id) {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		// delete object with primary key
		Query query = currentSession.createQuery("delete from Jour where id=:id");
		query.setParameter("id", id);
		query.executeUpdate();		
	}



}
