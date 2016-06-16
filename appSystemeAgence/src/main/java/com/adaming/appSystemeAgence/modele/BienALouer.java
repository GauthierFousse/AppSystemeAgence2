package com.adaming.appSystemeAgence.modele;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	private Boolean garniture;
	
	/////////// ASSOCIATIONS ///////////
	
	@OneToOne
	@JoinColumn(name = "adresse_id", referencedColumnName = "id_adresse")
	private Adresse adresse;
	
	@ManyToOne (fetch = FetchType.EAGER)
	@JoinColumn (name = "proprietaire_id", 
	           referencedColumnName = "id_proprietaire")
	private Proprietaire proprietaire;

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
	 * @param proprietaire
	 */
	public BienALouer(double caution, double loyerMensuel, double chargesMensuelles, String typeBail, Boolean garniture,
			Proprietaire proprietaire) {
		super();
		this.caution = caution;
		this.loyerMensuel = loyerMensuel;
		this.chargesMensuelles = chargesMensuelles;
		this.typeBail = typeBail;
		this.garniture = garniture;
		this.proprietaire = proprietaire;
	}
	/**
	 * Constructeur plein
	 * @param id
	 * @param caution
	 * @param loyerMensuel
	 * @param chargesMensuelles
	 * @param typeBail
	 * @param garniture
	 * @param proprietaire
	 */
	public BienALouer(int id, double caution, double loyerMensuel, double chargesMensuelles, String typeBail,
			Boolean garniture, Proprietaire proprietaire) {
		super();
		this.id = id;
		this.caution = caution;
		this.loyerMensuel = loyerMensuel;
		this.chargesMensuelles = chargesMensuelles;
		this.typeBail = typeBail;
		this.garniture = garniture;
		this.proprietaire = proprietaire;
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
	public Boolean getGarniture() {
		return garniture;
	}
	public void setGarniture(Boolean garniture) {
		this.garniture = garniture;
	}
	public Proprietaire getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(Proprietaire proprietaire) {
		this.proprietaire = proprietaire;
	}
	
	
}
