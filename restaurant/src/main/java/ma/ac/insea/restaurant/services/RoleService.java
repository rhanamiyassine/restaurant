package ma.ac.insea.restaurant.services;

import java.util.List;

import ma.ac.insea.restaurant.entities.Role;

public interface RoleService {

	public List<Role> read();

	public Role getById(Long id);

	public void delete(Long id);

	void save(Role filiere);
		
}
