package com.adaming.appSystemeAgence.modele;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BienImmobilier implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "statut")
	private int statut;
	
	@Column(name = "date_entree")
	private Date dateEntree;
	
	@Column(name = "date_disponibilite")
	private Date dateDisponibilite;
	
	@Column(name = "revenu_cadastral")
	private double revenuCadastral;
	
	@Column(name = "num_contrat")
	private String numContrat = null;

	/* ASSOCIATIONS A FAIRE
	 * 
	 * codeStandard
	 * listeVisites
	 * Contrat 
	 * 
	 */
	
	/**
	 * Constructeur vide
	 */
	public BienImmobilier() {
		super();
	}
	/**
	 * Constructeur plein
	 * @param statut
	 * @param dateEntree
	 * @param dateDisponibilite
	 * @param revenuCadastral
	 */
	public BienImmobilier(int statut, Date dateEntree,
			Date dateDisponibilite, double revenuCadastral) {
		super();
		this.statut = statut;
		this.dateEntree = dateEntree;
		this.dateDisponibilite = dateDisponibilite;
		this.revenuCadastral = revenuCadastral;
	}


	/* Accesseurs et mutateurs. */
	public int getStatut() {
		return statut;
	}
	public void setStatut(int statut) {
		this.statut = statut;
	}
	public Date getDateEntree() {
		return dateEntree;
	}
	public void setDateEntree(Date dateEntree) {
		this.dateEntree = dateEntree;
	}
	public Date getDateDisponibilite() {
		return dateDisponibilite;
	}
	public void setDateDisponibilite(Date dateDisponibilite) {
		this.dateDisponibilite = dateDisponibilite;
	}
	public double getRevenuCadastral() {
		return revenuCadastral;
	}
	public void setRevenuCadastral(double revenuCadastral) {
		this.revenuCadastral = revenuCadastral;
	}
}
