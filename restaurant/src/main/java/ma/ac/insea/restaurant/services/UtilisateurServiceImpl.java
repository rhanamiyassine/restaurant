package ma.ac.insea.restaurant.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ac.insea.restaurant.dao.UtilisateurDao;
import ma.ac.insea.restaurant.entities.Utilisateur;


@Service
@Transactional
public class UtilisateurServiceImpl implements UtilisateurService {
	
	@Autowired
	private UtilisateurDao utilisateurDao;

	@Override
	public List<Utilisateur> read() {
		return utilisateurDao.read();
	}

	@Override
	public Utilisateur getById(Long id) {
		return utilisateurDao.getById(id);
	}

	@Override
	public void delete(Long id) {
		utilisateurDao.delete(id);
	}

	@Override
	public void save(Utilisateur utilisateur) {
		utilisateurDao.save(utilisateur);
	}
	
	@Override
	public void update(Utilisateur utilisateur) {
		utilisateurDao.update(utilisateur);
	}
	
	
	
}





