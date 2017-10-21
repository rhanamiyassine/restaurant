package ma.ac.insea.restaurant.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ac.insea.restaurant.dao.RoleDao;
import ma.ac.insea.restaurant.entities.Role;


@Service
@Transactional
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	private RoleDao roleDao;

	@Override
	public List<Role> read() {
		return roleDao.read();
	}

	@Override
	public Role getById(Long id) {
		return roleDao.getById(id);
	}

	@Override
	public void delete(Long id) {
		roleDao.delete(id);
	}

	@Override
	public void save(Role role) {
		roleDao.save(role);
	}
	
}





