package ma.ac.insea.restaurant.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ma.ac.insea.restaurant.entities.Role;

@Repository
@Transactional 
public class RoleDaoImpl implements RoleDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Role> read() {	
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query  ... sort by last name
		Query query = currentSession.createQuery("from Role", Role.class);
		
		// execute query and get result list
		List<Role> Roles = query.getResultList();
				
		// return the results		
		return Roles;
	}

	@Override
	public void save(Role role) {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		// save/upate the Role ... finally LOL
		currentSession.saveOrUpdate(role);
	}

	@Override
	public Role getById(Long id) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// now retrieve/read from database using the primary key
		Role role = currentSession.get(Role.class, id);
		
		return role;
	}

	@Override
	public void delete(Long id) {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		// delete object with primary key
		Query query = currentSession.createQuery("delete from Role where id=:id");
		query.setParameter("id", id);
		query.executeUpdate();		
	}



}
