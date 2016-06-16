package com.adaming.appSystemeAgence.modele;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "adresse")
@Table(name = "adresses")
public class Adresse implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_adresse", nullable = false)
	private int id;

	@Column(name = "rue")
	private String rue; // rue + numero rue

	@Column(name = "codePostal")
	private int codePostal;

	@Column(name = "ville")
	private String ville;
	
	/////////// ASSOCIATIONS ////////////
	
	@OneToOne(mappedBy = "adresse")
	private Conseiller conseiller;
	
	@OneToOne(mappedBy = "adresse")
	private Proprietaire proprietaire;
	
	/////////// CONSTRUCTEURS /////////
	/**
	 * Constructeur vide
	 */
	public Adresse() {
		super();
	}
	/////////// CONSEILLER /////////
	/**
	 * Constructeur Conseiller sans l'id
	 * @param rue
	 * @param codePostal
	 * @param ville
	 * @param conseiller
	 * @param proprietaire
	 */
	public Adresse(String rue, int codePostal, String ville, Conseiller conseiller) {
		super();
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.conseiller = conseiller;
	}
	/**
	 * Constructeur Conseiller charge
	 * @param id
	 * @param rue
	 * @param codePostal
	 * @param ville
	 * @param conseiller
	 */
	public Adresse(int id, String rue, int codePostal, String ville, Conseiller conseiller) {
		super();
		this.id = id;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.conseiller = conseiller;
	}
	/////////// PROPRIETAIRE /////////
	/**
	 * Constructeur Proprietaire sans l'id
	 * @param rue
	 * @param codePostal
	 * @param ville
	 * @param conseiller
	 * @param proprietaire
	 */
	public Adresse(String rue, int codePostal, String ville, Proprietaire proprietaire) {
		super();
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.proprietaire = proprietaire;
	}
	/**
	 * Constructeur Proprietaire charge
	 * @param id
	 * @param rue
	 * @param codePostal
	 * @param ville
	 * @param conseiller
	 * @param proprietaire
	 */
	public Adresse(int id, String rue, int codePostal, String ville, Proprietaire proprietaire) {
		super();
		this.id = id;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.proprietaire = proprietaire;
	}
	
	
	/////////// GETTERS & SETTERS /////////
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}

	public int getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	public Conseiller getConseiller() {
		return conseiller;
	}
	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}
	
	public Proprietaire getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(Proprietaire proprietaire) {
		this.proprietaire = proprietaire;
	}

	
}
