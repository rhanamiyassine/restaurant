package ma.ac.insea.restaurant.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Reservation {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@ManyToOne @JoinColumn(name="jourId")
	private Jour jour;
	@ManyToOne @JoinColumn(name="elementChoixId")
	private ElementChoix elementChoix;
	@ManyToOne @JoinColumn(name="repasId")
	private Repas repas;
	@ManyToOne @JoinColumn(name="etudiantId")
	private Etudiant etudiant;
	private Boolean estAnnule;
	
	public Reservation() {}
	
	public Reservation(Jour jour, ElementChoix elementChoix, Repas repas) {
		super();
		this.jour = jour;
		this.elementChoix = elementChoix;
		this.repas = repas;
	}

	public Jour getJour() {
		return jour;
	}
	public void setJour(Jour jour) {
		this.jour = jour;
	}
	public ElementChoix getElementChoix() {
		return elementChoix;
	}
	public void setElementChoix(ElementChoix elementChoix) {
		this.elementChoix = elementChoix;
	}
	public Repas getRepas() {
		return repas;
	}
	public void setRepas(Repas repas) {
		this.repas = repas;
	}

	public Boolean getEstAnnule() {
		return estAnnule;
	}

	public void setEstAnnule(Boolean estAnnule) {
		this.estAnnule = estAnnule;
	}
	
	
	

}
