package ma.ac.insea.restaurant.dao;

import java.util.List;

import ma.ac.insea.restaurant.entities.Categorie;

public interface CategorieDao {
	
	public List<Categorie> read();

	public Categorie getById(Long id);

	public void delete(Long id);

	void save(Categorie filiere);
	
}
