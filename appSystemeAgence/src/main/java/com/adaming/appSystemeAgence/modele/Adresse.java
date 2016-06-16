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
	
	@OneToOne(mappedBy = "adresse")
	private Client client;
	
	@OneToOne(mappedBy = "adresse")
	private BienALouer bienALouer;
	
	@OneToOne(mappedBy = "adresse")
	private BienAAcheter bienAAcheter;
	
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
	
	/////////// CLIENT /////////
	/**
	 * Constructeur client sans id
	 * @param rue
	 * @param codePostal
	 * @param ville
	 * @param client
	 */
	public Adresse(String rue, int codePostal, String ville, Client client) {
		super();
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.client = client;
	}
	/**
	 * Constructeur client charge
	 * @param id
	 * @param rue
	 * @param codePostal
	 * @param ville
	 * @param client
	 */
	public Adresse(int id, String rue, int codePostal, String ville, Client client) {
		super();
		this.id = id;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.client = client;
	}
	
	/////////// BIEN A LOUER /////////
	/**
	 * Constructeur bien a louer sans id
	 * @param rue
	 * @param codePostal
	 * @param ville
	 * @param bienALouer
	 */
	public Adresse(String rue, int codePostal, String ville, BienALouer bienALouer) {
		super();
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.bienALouer = bienALouer;
	}
	/**
	 * Constructeur bien a louer charge
	 * @param id
	 * @param rue
	 * @param codePostal
	 * @param ville
	 * @param bienALouer
	 */
	public Adresse(int id, String rue, int codePostal, String ville, BienALouer bienALouer) {
		super();
		this.id = id;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.bienALouer = bienALouer;
	}
	
	/////////// BIEN A ACHETER /////////
	/**
	 * Constructeur bien a acheter sans id
	 * @param rue
	 * @param codePostal
	 * @param ville
	 * @param bienAAcheter
	 */
	public Adresse(String rue, int codePostal, String ville, BienAAcheter bienAAcheter) {
		super();
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.bienAAcheter = bienAAcheter;
	}
	/**
	 * Constructeur bien a acheter charge
	 * @param id
	 * @param rue
	 * @param codePostal
	 * @param ville
	 * @param bienAAcheter
	 */
	public Adresse(int id, String rue, int codePostal, String ville, BienAAcheter bienAAcheter) {
		super();
		this.id = id;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.bienAAcheter = bienAAcheter;
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

	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}

	public BienALouer getBienALouer() {
		return bienALouer;
	}
	public void setBienALouer(BienALouer bienALouer) {
		this.bienALouer = bienALouer;
	}

	public BienAAcheter getBienAAcheter() {
		return bienAAcheter;
	}
	public void setBienAAcheter(BienAAcheter bienAAcheter) {
		this.bienAAcheter = bienAAcheter;
	}

	
}
