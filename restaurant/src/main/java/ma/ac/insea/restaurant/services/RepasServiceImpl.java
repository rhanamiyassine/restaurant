package ma.ac.insea.restaurant.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ac.insea.restaurant.dao.RepasDao;
import ma.ac.insea.restaurant.entities.Repas;


@Service
@Transactional
public class RepasServiceImpl implements RepasService {
	
	@Autowired
	private RepasDao repasDao;

	@Override
	public List<Repas> read() {
		return repasDao.read();
	}

	@Override
	public Repas getById(Long id) {
		return repasDao.getById(id);
	}

	@Override
	public void delete(Long id) {
		repasDao.delete(id);
	}

	@Override
	public void save(Repas repas) {
		repasDao.save(repas);
	}
	
}





