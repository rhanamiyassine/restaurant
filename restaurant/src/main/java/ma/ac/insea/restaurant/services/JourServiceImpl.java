package ma.ac.insea.restaurant.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ac.insea.restaurant.dao.JourDao;
import ma.ac.insea.restaurant.entities.Jour;


@Service
@Transactional
public class JourServiceImpl implements JourService {
	
	@Autowired
	private JourDao jourDao;

	@Override
	public List<Jour> read() {
		return jourDao.read();
	}

	@Override
	public Jour getById(Long id) {
		return jourDao.getById(id);
	}

	@Override
	public void delete(Long id) {
		jourDao.delete(id);
	}

	@Override
	public void save(Jour jour) {
		jourDao.save(jour);
	}
	
}





