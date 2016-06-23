package com.adaming.appSystemeAgence.modele;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="bienALouer")
@Table(name="biens_a_louer")
public class BienALouer extends BienImmobilier {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_bien_a_louer", nullable=false)
	private int id;
	
	@Column(name="caution")
	private double caution;
	
	@Column(name="loyer_mensuel")
	private double loyerMensuel;
	
	@Column(name="charges_mensuelles")
	private double chargesMensuelles;
	
	@Column(name="type_bail")
	private String typeBail;
	
	@Column(name="garniture")
	private int garniture; // boolean
	
	/////////// ASSOCIATIONS ///////////
	
	@OneToOne
	@JoinColumn(name = "adresse_id", referencedColumnName = "id_adresse")
	private Adresse adresse;
	
	@ManyToOne (fetch = FetchType.EAGER)
	@JoinColumn (name = "proprietaire_id", referencedColumnName = "id_proprietaire")
	private Proprietaire proprietaire;

	@OneToMany(mappedBy = "bienALouer")
    private Collection<Visite> listeVisites;
	
	@OneToOne
	@JoinColumn(name = "contrat_id", referencedColumnName = "id_contrat")
    private Contrat contrat;
	
	@ManyToOne (fetch = FetchType.EAGER)
	@JoinColumn (name = "classe_standard_id", referencedColumnName = "id_classe_standard")
	private ClasseStandard classeStandard;
	
	/**
	 * Constructeur vide
	 */
	public BienALouer() {
		super();
	}
	/**
	 * Constructeur sans l'id
	 * @param caution
	 * @param loyerMensuel
	 * @param chargesMensuelles
	 * @param typeBail
	 * @param garniture
	 * @param adresse
	 * @param proprietaire
	 * @param classeStandard
	 */
	public BienALouer(double caution, double loyerMensuel, double chargesMensuelles, String typeBail, int garniture,
			Adresse adresse, Proprietaire proprietaire, ClasseStandard classeStandard) {
		super();
		this.caution = caution;
		this.loyerMensuel = loyerMensuel;
		this.chargesMensuelles = chargesMensuelles;
		this.typeBail = typeBail;
		this.garniture = garniture;
		this.adresse = adresse;
		this.proprietaire = proprietaire;
		this.classeStandard = classeStandard;
	}
	/**
	 * Constructeur charge
	 * @param id
	 * @param caution
	 * @param loyerMensuel
	 * @param chargesMensuelles
	 * @param typeBail
	 * @param garniture
	 * @param adresse
	 * @param proprietaire
	 * @param listeVisites
	 * @param listeContrats
	 * @param classeStandard
	 */
	public BienALouer(int id, double caution, double loyerMensuel, double chargesMensuelles, String typeBail,
			int garniture, Adresse adresse, Proprietaire proprietaire, Collection<Visite> listeVisites,
			Contrat contrat, ClasseStandard classeStandard) {
		super();
		this.id = id;
		this.caution = caution;
		this.loyerMensuel = loyerMensuel;
		this.chargesMensuelles = chargesMensuelles;
		this.typeBail = typeBail;
		this.garniture = garniture;
		this.adresse = adresse;
		this.proprietaire = proprietaire;
		this.listeVisites = listeVisites;
		this.contrat = contrat;
		this.classeStandard = classeStandard;
	}
	
	
	/*
	 * GETTERS and SETTERS
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public double getCaution() {
		return caution;
	}
	public void setCaution(double caution) {
		this.caution = caution;
	}
	
	public double getLoyerMensuel() {
		return loyerMensuel;
	}
	public void setLoyerMensuel(double loyerMensuel) {
		this.loyerMensuel = loyerMensuel;
	}
	
	public double getChargesMensuelles() {
		return chargesMensuelles;
	}
	public void setChargesMensuelles(double chargesMensuelles) {
		this.chargesMensuelles = chargesMensuelles;
	}
	
	public String getTypeBail() {
		return typeBail;
	}
	public void setTypeBail(String typeBail) {
		this.typeBail = typeBail;
	}
	
	public int getGarniture() {
		return garniture;
	}
	public void setGarniture(int garniture) {
		this.garniture = garniture;
	}
	
	public Proprietaire getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(Proprietaire proprietaire) {
		this.proprietaire = proprietaire;
	}
	
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	public Collection<Visite> getListeVisites() {
		return listeVisites;
	}
	public void setListeVisites(Collection<Visite> listeVisites) {
		this.listeVisites = listeVisites;
	}
	
	public Contrat getContrat() {
		return contrat;
	}
	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}
	
	@Override
	public String toString() {
		return "BienALouer [id=" + id + ", loyerMensuel=" + loyerMensuel + "]";
	}
	
}
