package ma.ac.insea.restaurant.dao;

import java.util.List;

import ma.ac.insea.restaurant.entities.Utilisateur;

public interface UtilisateurDao {
	
	public List<Utilisateur> read();

	public Utilisateur getById(Long id);

	public void delete(Long id);

	void save(Utilisateur utilisateur);

}
