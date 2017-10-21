package ma.ac.insea.restaurant.services;

import java.util.List;

import ma.ac.insea.restaurant.entities.Utilisateur;

public interface UtilisateurService {

	public List<Utilisateur> read();

	public Utilisateur getById(Long id);

	public void delete(Long id);

	void save(Utilisateur utilisateur);
	
}
