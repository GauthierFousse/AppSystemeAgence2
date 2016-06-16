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

@Entity(name = "client")
@Table(name = "clients")
public class Client extends Personne {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_proprietaire")
	private int id;
	
	@Column(name = "tel_travail")
	private Boolean acquereur;

	/////////// ASSOCIATIONS ///////////
	
	@OneToOne
	@JoinColumn(name = "adresse_id", referencedColumnName = "id_adresse")
	private Adresse adresse;
	
	@ManyToOne (fetch = FetchType.EAGER)
	@JoinColumn (name = "conseiller_id", 
	         referencedColumnName = "id_conseiller")
	private Conseiller conseiller;
	
	/**
	 * Constructeur vide
	 */
	public Client() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * Constructeur sans id
	 * @param acquereur
	 * @param adresse
	 * @param conseiller
	 */
	public Client(Boolean acquereur, Adresse adresse, Conseiller conseiller) {
		super();
		this.acquereur = acquereur;
		this.adresse = adresse;
		this.conseiller = conseiller;
	}
	/**
	 * Constructeur charge
	 * @param id
	 * @param acquereur
	 * @param adresse
	 * @param conseiller
	 */
	public Client(int id, Boolean acquereur, Adresse adresse, Conseiller conseiller) {
		super();
		this.id = id;
		this.acquereur = acquereur;
		this.adresse = adresse;
		this.conseiller = conseiller;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public Boolean getAcquereur() {
		return acquereur;
	}
	public void setAcquereur(Boolean acquereur) {
		this.acquereur = acquereur;
	}

	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Conseiller getConseiller() {
		return conseiller;
	}
	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}
	
	
}
