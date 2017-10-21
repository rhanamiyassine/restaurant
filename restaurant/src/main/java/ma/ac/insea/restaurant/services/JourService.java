package ma.ac.insea.restaurant.services;

import java.util.List;

import ma.ac.insea.restaurant.entities.Jour;

public interface JourService {

	public List<Jour> read();

	public Jour getById(Long id);

	public void delete(Long id);

	void save(Jour jour);
		
}
