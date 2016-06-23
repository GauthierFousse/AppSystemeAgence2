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
	private String strDateEntree; // pour la conversion
	
	@Column(name = "date_disponibilite")
	private Date dateDisponibilite;
	private String strDateDisponibilite; // pour la conversion
	
	@Column(name = "revenu_cadastral")
	private double revenuCadastral;
	
	/**
	 * Constructeur vide
	 */
	public BienImmobilier() {
		super();
	}
	/**
	 * Constructeur plein, sans les dates (String)
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
	
	/**
	 * Constructeur plein, sans les dates (Date)
	 * @param statut
	 * @param strDateEntree
	 * @param strDateDisponibilite
	 * @param revenuCadastral
	 * @param numContrat
	 */
	public BienImmobilier(int statut, String strDateEntree, String strDateDisponibilite, double revenuCadastral,
			String numContrat) {
		super();
		this.statut = statut;
		this.strDateEntree = strDateEntree;
		this.strDateDisponibilite = strDateDisponibilite;
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
	public String getStrDateEntree() {
		return strDateEntree;
	}
	public void setStrDateEntree(String strDateEntree) {
		this.strDateEntree = strDateEntree;
	}
	public String getStrDateDisponibilite() {
		return strDateDisponibilite;
	}
	public void setStrDateDisponibilite(String strDateDisponibilite) {
		this.strDateDisponibilite = strDateDisponibilite;
	}
	
}
