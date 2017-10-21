package ma.ac.insea.restaurant.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ac.insea.restaurant.dao.FiliereDao;
import ma.ac.insea.restaurant.entities.Filiere;


@Service
@Transactional
public class FiliereServiceImpl implements FiliereService {
	
	@Autowired
	private FiliereDao filiereDao;

	@Override
	public List<Filiere> read() {
		return filiereDao.read();
	}

	@Override
	public Filiere getById(Long id) {
		return filiereDao.getById(id);
	}

	@Override
	public void delete(Long id) {
		filiereDao.delete(id);
	}

	@Override
	public void save(Filiere filiere) {
		filiereDao.save(filiere);
	}
	
}





