package ma.ac.insea.restaurant.services;

import java.util.List;

import ma.ac.insea.restaurant.entities.Plainte;

public interface PlainteService {

	public List<Plainte> read();

	public Plainte getById(Long id);

	public void delete(Long id);

	void save(Plainte filiere);
		
}
