package ma.ac.insea.restaurant.services;

import java.util.List;

import ma.ac.insea.restaurant.entities.Categorie;

public interface CategorieService {

	public List<Categorie> read();

	public Categorie getById(Long id);

	public void delete(Long id);

	void save(Categorie categorie);
		
}
