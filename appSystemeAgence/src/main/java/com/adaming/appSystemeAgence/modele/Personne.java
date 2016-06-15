package com.adaming.appSystemeAgence.modele;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="personne")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Table(name="personnes")
public abstract class Personne {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_presonne", nullable=false)
	private int id;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="prenom")
	private String prenom;
	
	@Column(name="tel_prive")
	private String telPrive;
	
	
	/////////// ASSOCIATIONS ///////////
	
	@OneToOne
	@JoinColumn(name = "adresse_id", referencedColumnName = "id_adresse")
	private Adresse adresse;

	/////////// CONSTRUCTEURS /////////
	
	public Personne() {
		super();
	}

	public Personne(String nom, String prenom, Adresse adresse, String telPrive) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telPrive = telPrive;
	}

	public Personne(int id, String nom, String prenom, Adresse adresse, String telPrive) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telPrive = telPrive;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public String getTelPrive() {
		return telPrive;
	}

	public void setTelPrive(String telPrive) {
		this.telPrive = telPrive;
	}

}
