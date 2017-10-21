package ma.ac.insea.restaurant.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Jour {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String libelle;

	public Jour() {}
	
	public Jour(Long id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}
	
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}
