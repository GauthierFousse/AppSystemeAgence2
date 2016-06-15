package com.adaming.appSystemeAgence.modele;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@MappedSuperclass
public abstract class BienImmobilier implements Serializable {

	private static final long serialVersionUID = 1L;

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "id_b_immo")
//	private int id;
	
//	@Column(name = "code_standard")
//	private int codeStandard;
	
	@Column(name = "statut")
	private int statut;
	
	@Column(name = "date_entree")
	private Date dateEntree;
	
	@Column(name = "date_disponibilite")
	private Date dateDisponibilite;
	
	@Column(name = "revenu_cadastral")
	private double revenuCadastral;
	
//	private List<Visite> listeVisites = null;	// Il peut n'y avoir eu aucune visite => nul par défaut.
	
//	@Column(name = "client_acquereur")
//	private Client clientAcquereur = null;		// Il peut n'y avoir pas d'acquéreur => nul par défaut.
	
	@Column(name = "num_contrat")
	private String numContrat = null;

	
	/* Constructeurs. */
	public BienImmobilier() {
		super();
	}
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
