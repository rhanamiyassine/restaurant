package ma.ac.insea.restaurant.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("admin")
public class Administrateur extends Utilisateur {
	
	@ManyToOne @JoinColumn(name="roleId")
	private Role role;
	
	public Administrateur() {}
	
	public Administrateur(String login, String motDePasse, String nom, String prenom, Date dateDeNaissance,
			String email, String telephone, Role role) {
		super(login, motDePasse, nom, prenom, dateDeNaissance, email, telephone);
		this.role=role;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	

}
