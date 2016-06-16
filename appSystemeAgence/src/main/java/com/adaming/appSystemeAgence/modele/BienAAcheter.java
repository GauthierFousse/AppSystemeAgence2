package com.adaming.appSystemeAgence.modele;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	@JoinColumn (name = "proprietaire_id", referencedColumnName = "id_proprietaire")
	private Proprietaire proprietaire;
	
	@OneToMany(mappedBy = "bienALouer")
    private Collection<Visite> listeVisites;
	
	@OneToMany(mappedBy = "bienALouer")
    private Collection<Contrat> listeContrats;
	
	@ManyToOne (fetch = FetchType.EAGER)
	@JoinColumn (name = "classe_standard_id", referencedColumnName = "id_classe_standard")
	private ClasseStandard classeStandard;
	
	/**
	 * Constructeur vide
	 */
	public BienAAcheter() {
		super();
	}
	/**
	 * Constructeur sans l'id
	 * @param prixAchat
	 * @param etat
	 * @param adresse
	 * @param proprietaire
	 * @param classeStandard
	 */
	public BienAAcheter(double prixAchat, String etat, Adresse adresse, Proprietaire proprietaire,
			ClasseStandard classeStandard) {
		super();
		this.prixAchat = prixAchat;
		this.etat = etat;
		this.adresse = adresse;
		this.proprietaire = proprietaire;
		this.classeStandard = classeStandard;
	}
	/**
	 * Constructeur charge
	 * @param id
	 * @param prixAchat
	 * @param etat
	 * @param adresse
	 * @param proprietaire
	 * @param listeVisites
	 * @param listeContrats
	 * @param classeStandard
	 */
	public BienAAcheter(int id, double prixAchat, String etat, Adresse adresse, Proprietaire proprietaire,
			Collection<Visite> listeVisites, Collection<Contrat> listeContrats, ClasseStandard classeStandard) {
		super();
		this.id = id;
		this.prixAchat = prixAchat;
		this.etat = etat;
		this.adresse = adresse;
		this.proprietaire = proprietaire;
		this.listeVisites = listeVisites;
		this.listeContrats = listeContrats;
		this.classeStandard = classeStandard;
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
	
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	public Collection<Visite> getListeVisites() {
		return listeVisites;
	}
	public void setListeVisites(Collection<Visite> listeVisites) {
		this.listeVisites = listeVisites;
	}
	
	public Collection<Contrat> getListeContrats() {
		return listeContrats;
	}
	public void setListeContrats(Collection<Contrat> listeContrats) {
		this.listeContrats = listeContrats;
	}
	
	public ClasseStandard getClasseStandard() {
		return classeStandard;
	}
	public void setClasseStandard(ClasseStandard classeStandard) {
		this.classeStandard = classeStandard;
	}
	
	@Override
	public String toString() {
		return "BienAAcheter [id=" + id + ", prixAchat=" + prixAchat + ", etat=" + etat + ", adresse=" + adresse
				+ ", proprietaire=" + proprietaire + ", listeVisites=" + listeVisites + ", listeContrats="
				+ listeContrats + ", classeStandard=" + classeStandard + "]";
	}
	
}
