package ma.ac.insea.restaurant.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
@DiscriminatorValue("GR")
public class Gerant extends Utilisateur {

	@ManyToOne @JoinColumn(name="fonctionId")
	private Fonction fonction;
	
	public Gerant() {}
	
	public Gerant(String login, String motDePasse, String nom, String prenom, Date dateDeNaissance, String email,
			String telephone) {
		super(login, motDePasse, nom, prenom, dateDeNaissance, email, telephone);
	}

	
}
