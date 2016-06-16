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

@Entity(name = "client")
@Table(name = "clients")
public class Client extends Personne {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_client")
	private int id;
	
	@Column(name = "acquereur")
	private int acquereur; // boolean

	/////////// ASSOCIATIONS ///////////
	
	@OneToOne
	@JoinColumn(name = "adresse_id", referencedColumnName = "id_adresse")
	private Adresse adresse;
	
	@ManyToOne (fetch = FetchType.EAGER)
	@JoinColumn (name = "conseiller_id", referencedColumnName = "id_conseiller")
	private Conseiller conseiller;
	
	@OneToMany(mappedBy = "client")
    private Collection<Contrat> listeContrats;
	
	@OneToMany(mappedBy = "client")
    private Collection<Visite> listeVisites;
	
	@OneToMany(mappedBy = "client")
    private Collection<AssociationClientsClassesStandards> listeAssociationClasseStandard;
	
	/**
	 * Constructeur vide
	 */
	public Client() {
		super();
	}
	/**
	 * Constructeur sans id
	 * @param acquereur
	 * @param adresse
	 * @param conseiller
	 */
	public Client(int acquereur, Adresse adresse, Conseiller conseiller) {
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
	 * @param listeContrats
	 * @param listeVisites
	 * @param listeAssociationClasseStandard
	 */
	public Client(int id, int acquereur, Adresse adresse, Conseiller conseiller, Collection<Contrat> listeContrats,
			Collection<Visite> listeVisites,
			Collection<AssociationClientsClassesStandards> listeAssociationClasseStandard) {
		super();
		this.id = id;
		this.acquereur = acquereur;
		this.adresse = adresse;
		this.conseiller = conseiller;
		this.listeContrats = listeContrats;
		this.listeVisites = listeVisites;
		this.listeAssociationClasseStandard = listeAssociationClasseStandard;
	}
	

	/*
	 * GETTERS and SETTERSS
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getAcquereur() {
		return acquereur;
	}
	public void setAcquereur(int acquereur) {
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
	
	public Collection<Contrat> getListeContrats() {
		return listeContrats;
	}
	public void setListeContrats(Collection<Contrat> listeContrats) {
		this.listeContrats = listeContrats;
	}
	
	public Collection<Visite> getListeVisites() {
		return listeVisites;
	}
	public void setListeVisites(Collection<Visite> listeVisites) {
		this.listeVisites = listeVisites;
	}
	
	public Collection<AssociationClientsClassesStandards> getListeAssociationClasseStandard() {
		return listeAssociationClasseStandard;
	}
	public void setListeAssociationClasseStandard(
			Collection<AssociationClientsClassesStandards> listeAssociationClasseStandard) {
		this.listeAssociationClasseStandard = listeAssociationClasseStandard;
	}
	
	@Override
	public String toString() {
		return "Client [id=" + id + ", acquereur=" + acquereur + ", adresse=" + adresse + ", conseiller=" + conseiller
				+ ", listeContrats=" + listeContrats + ", listeVisites=" + listeVisites
				+ ", listeAssociationClasseStandard=" + listeAssociationClasseStandard + "]";
	}
	
	
	
}
