package ma.ac.insea.restaurant.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ma.ac.insea.restaurant.entities.Filiere;

@Repository
@Transactional 
public class FiliereDaoImpl implements FiliereDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Filiere> read() {	
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query  ... sort by last name
		Query query = currentSession.createQuery("from Filiere", Filiere.class);
		
		// execute query and get result list
		List<Filiere> Filieres = query.getResultList();
				
		// return the results		
		return Filieres;
	}

	@Override
	public void save(Filiere filiere) {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		// save/upate the Filiere ... finally LOL
		currentSession.saveOrUpdate(filiere);
	}

	@Override
	public Filiere getById(Long id) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// now retrieve/read from database using the primary key
		Filiere filiere = currentSession.get(Filiere.class, id);
		
		return filiere;
	}

	@Override
	public void delete(Long id) {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		// delete object with primary key
		Query query = currentSession.createQuery("delete from Filiere where id=:id");
		query.setParameter("id", id);
		query.executeUpdate();		
	}



}
