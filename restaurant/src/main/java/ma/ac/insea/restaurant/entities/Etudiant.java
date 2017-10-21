package ma.ac.insea.restaurant.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
@DiscriminatorValue("ET")
public class Etudiant extends Utilisateur {
	
	private Integer nbPoints;
	@OneToMany(mappedBy="etudiant")
	private List<Plainte> plaintes;
	@ManyToOne @JoinColumn(name="filiereId")
	private Filiere filiere;
	@OneToMany(mappedBy="etudiant")
	private List<Reservation> reservations;
	
	public List<Plainte> getPlaintes() {
		return plaintes;
	}

	public void setPlaintes(List<Plainte> plaintes) {
		this.plaintes = plaintes;
	}

	public Etudiant() {}
	
	public Etudiant(String login, String motDePasse, String nom, String prenom, Date dateDeNaissance, String email, String telephone, Filiere filiere, Integer nbPoints) {
		super(login, motDePasse, nom, prenom, dateDeNaissance, email, telephone);
		this.filiere=filiere;
		this.nbPoints=nbPoints;
	}

	public Integer getNbPoints() {
		return nbPoints;
	}

	public void setNbPoints(Integer nbPoints) {
		this.nbPoints = nbPoints;
	}

	public Filiere getFiliere() {
		return filiere;
	}

	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}

}
