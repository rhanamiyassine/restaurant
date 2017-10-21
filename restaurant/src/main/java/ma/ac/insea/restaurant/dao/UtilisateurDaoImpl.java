package ma.ac.insea.restaurant.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ma.ac.insea.restaurant.entities.Utilisateur;

@Repository
@Transactional 
public class UtilisateurDaoImpl implements UtilisateurDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Utilisateur> read() {	
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query  ... sort by last name
		Query query = currentSession.createQuery("from Utilisateur", Utilisateur.class);
		
		// execute query and get result list
		List<Utilisateur> Utilisateurs = query.getResultList();
				
		// return the results		
		return Utilisateurs;
	}

	@Override
	public void save(Utilisateur utilisateur) {

		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// save/upate the Utilisateur ... finally LOL
		currentSession.save(utilisateur);
	}

	@Override
	public void update(Utilisateur utilisateur) {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		// save/upate the Utilisateur ... finally LOL
		currentSession.update(utilisateur);
	}
	@Override
	public Utilisateur getById(Long id) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// now retrieve/read from database using the primary key
		Utilisateur utilisateur = currentSession.get(Utilisateur.class, id);
		
		return utilisateur;
	}

	@Override
	public void delete(Long id) {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		// delete object with primary key
		Query query = currentSession.createQuery("delete from Utilisateur where id=:id");
		query.setParameter("id", id);
		query.executeUpdate();		
	}

}
