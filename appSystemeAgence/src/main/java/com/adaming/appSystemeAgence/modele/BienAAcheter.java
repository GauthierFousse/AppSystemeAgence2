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

@Entity(name="bienAAcheter")
@Table(name="biens_a_acheter")
public class BienAAcheter extends BienImmobilier {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_bien_a_acheter", nullable=false)
	private int id;
	
	@Column(name="prix_achat")
	private double prixAchat;
	
	@Column(name="etat")
	private String etat;
	
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
	public BienAAcheter() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * Constructeur sans l'id
	 * @param prixAchat
	 * @param etat
	 * @param proprietaire
	 */
	public BienAAcheter(double prixAchat, String etat, Proprietaire proprietaire) {
		super();
		this.prixAchat = prixAchat;
		this.etat = etat;
		this.proprietaire = proprietaire;
	}
	/**
	 * Constructeur plein
	 * @param id
	 * @param prixAchat
	 * @param etat
	 * @param proprietaire
	 */
	public BienAAcheter(int id, double prixAchat, String etat, Proprietaire proprietaire) {
		super();
		this.id = id;
		this.prixAchat = prixAchat;
		this.etat = etat;
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
	public double getPrixAchat() {
		return prixAchat;
	}
	public void setPrixAchat(double prixAchat) {
		this.prixAchat = prixAchat;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public Proprietaire getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(Proprietaire proprietaire) {
		this.proprietaire = proprietaire;
	}

	
	
	
	
}
