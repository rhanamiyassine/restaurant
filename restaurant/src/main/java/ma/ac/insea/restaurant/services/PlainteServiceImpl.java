package ma.ac.insea.restaurant.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ac.insea.restaurant.dao.PlainteDao;
import ma.ac.insea.restaurant.entities.Plainte;


@Service
@Transactional
public class PlainteServiceImpl implements PlainteService {
	
	@Autowired
	private PlainteDao plainteDao;

	@Override
	public List<Plainte> read() {
		return plainteDao.read();
	}

	@Override
	public Plainte getById(Long id) {
		return plainteDao.getById(id);
	}

	@Override
	public void delete(Long id) {
		plainteDao.delete(id);
	}

	@Override
	public void save(Plainte plainte) {
		plainteDao.save(plainte);
	}
	
}





