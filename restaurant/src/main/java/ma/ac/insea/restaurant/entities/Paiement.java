package ma.ac.insea.restaurant.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Paiement {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String libelle;

}
