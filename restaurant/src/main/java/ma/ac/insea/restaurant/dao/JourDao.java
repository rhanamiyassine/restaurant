package ma.ac.insea.restaurant.dao;

import java.util.List;

import ma.ac.insea.restaurant.entities.Jour;

public interface JourDao {
	
	public List<Jour> read();

	public Jour getById(Long id);

	public void delete(Long id);

	void save(Jour jour);
	
}
