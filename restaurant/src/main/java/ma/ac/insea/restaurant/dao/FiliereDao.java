package ma.ac.insea.restaurant.dao;

import java.util.List;

import ma.ac.insea.restaurant.entities.Filiere;

public interface FiliereDao {
	
	public List<Filiere> read();

	public Filiere getById(Long id);

	public void delete(Long id);

	void save(Filiere filiere);
	
}
