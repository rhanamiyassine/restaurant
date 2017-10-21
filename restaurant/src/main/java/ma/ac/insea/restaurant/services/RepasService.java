package ma.ac.insea.restaurant.services;

import java.util.List;

import ma.ac.insea.restaurant.entities.Repas;

public interface RepasService {

	public List<Repas> read();

	public Repas getById(Long id);

	public void delete(Long id);

	void save(Repas repas);
		
}
