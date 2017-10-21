package ma.ac.insea.restaurant.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Point {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private Integer libelle;

	public Point() {}
	
	public Point(Long id, Integer libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}
	
	public Integer getLibelle() {
		return libelle;
	}
	public void setLibelle(Integer libelle) {
		this.libelle = libelle;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}
