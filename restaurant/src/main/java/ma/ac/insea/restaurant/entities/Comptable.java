package ma.ac.insea.restaurant.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("CP")
public class Comptable extends Utilisateur {

	public Comptable() {

	}
	
	public Comptable(String login, String motDePasse, String nom, String prenom, Date dateDeNaissance, String email, String telephone) {
		super(login, motDePasse, nom, prenom, dateDeNaissance, email, telephone);
	}

}
