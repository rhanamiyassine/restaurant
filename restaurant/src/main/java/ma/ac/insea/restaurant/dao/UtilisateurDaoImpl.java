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
		Session currentSession = sessionFactory.getCurrentSession();
		Query query = currentSession.createQuery("from Utilisateur", Utilisateur.class);
		List<Utilisateur> Utilisateurs = query.getResultList();
		return Utilisateurs;
	}

	@Override
	public void save(Utilisateur utilisateur) {
		Session currentSession = sessionFactory.getCurrentSession();		
		currentSession.save(utilisateur);
	}

	@Override
	public Utilisateur getById(Long id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Utilisateur utilisateur = currentSession.get(Utilisateur.class, id);		
		return utilisateur;
	}

	@Override
	public void delete(Long id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query query = currentSession.createQuery("delete from Utilisateur where id=:id");
		query.setParameter("id", id);
		query.executeUpdate();		
	}

}
