package ma.ac.insea.restaurant.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Plainte {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private Date date;
	private String titre;
	private String description;
	@ManyToOne @JoinColumn(name="etudiantId")
	private Etudiant etudiant;
	
	public Plainte() {}
	
	public Plainte(Long id, Date date, String titre, String description) {
		super();
		this.id = id;
		this.date = date;
		this.titre = titre;
		this.description = description;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
