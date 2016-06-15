package com.adaming.appSystemeAgence.modele;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Personne implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name="nom")
	private String nom;
	
	@Column(name="prenom")
	private String prenom;
	
	@Column(name="tel_prive")
	private String telPrive;
	
	/////////// CONSTRUCTEURS /////////
	
	public Personne() {
		super();
	}

	public Personne(String nom, String prenom, String telPrive) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.telPrive = telPrive;
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

	public String getTelPrive() {
		return telPrive;
	}

	public void setTelPrive(String telPrive) {
		this.telPrive = telPrive;
	}

}
