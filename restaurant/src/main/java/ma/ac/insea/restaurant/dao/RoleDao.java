package ma.ac.insea.restaurant.dao;

import java.util.List;

import ma.ac.insea.restaurant.entities.Role;

public interface RoleDao {
	
	public List<Role> read();

	public Role getById(Long id);

	public void delete(Long id);

	void save(Role role);
	
}
