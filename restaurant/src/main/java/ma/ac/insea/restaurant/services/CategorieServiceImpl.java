package ma.ac.insea.restaurant.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ac.insea.restaurant.dao.CategorieDao;
import ma.ac.insea.restaurant.entities.Categorie;


@Service
@Transactional
public class CategorieServiceImpl implements CategorieService {
	
	@Autowired
	private CategorieDao categorieDao;

	@Override
	public List<Categorie> read() {
		return categorieDao.read();
	}

	@Override
	public Categorie getById(Long id) {
		return categorieDao.getById(id);
	}

	@Override
	public void delete(Long id) {
		categorieDao.delete(id);
	}

	@Override
	public void save(Categorie categorie) {
		categorieDao.save(categorie);
	}
	
}





