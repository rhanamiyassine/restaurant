package ma.ac.insea.restaurant.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ma.ac.insea.restaurant.entities.Categorie;

@Repository
@Transactional 
public class CategorieDaoImpl implements CategorieDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Categorie> read() {	
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query  ... sort by last name
		Query query = currentSession.createQuery("from Categorie", Categorie.class);
		
		// execute query and get result list
		List<Categorie> Categories = query.getResultList();
				
		// return the results		
		return Categories;
	}

	@Override
	public void save(Categorie categorie) {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		// save/upate the Categorie ... finally LOL
		currentSession.saveOrUpdate(categorie);
	}

	@Override
	public Categorie getById(Long id) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// now retrieve/read from database using the primary key
		Categorie categorie = currentSession.get(Categorie.class, id);
		
		return categorie;
	}

	@Override
	public void delete(Long id) {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		// delete object with primary key
		Query query = currentSession.createQuery("delete from Categorie where id=:id");
		query.setParameter("id", id);
		query.executeUpdate();		
	}



}
