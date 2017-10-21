package ma.ac.insea.restaurant.dao;

import java.util.List;

import ma.ac.insea.restaurant.entities.Repas;

public interface RepasDao {
	
	public List<Repas> read();

	public Repas getById(Long id);

	public void delete(Long id);

	void save(Repas repas);
	
}
