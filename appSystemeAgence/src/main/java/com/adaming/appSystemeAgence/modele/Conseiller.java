package com.adaming.appSystemeAgence.modele;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="conseiller")
@Table(name="conseillers")
public class Conseiller extends Personne implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_conseiller", nullable=false)
	private int id;
	
	@Column(name="login")
	private String login;
	
	@Column(name="password")
	private String password;
	
	@Column(name="chiffre_affaire")
	private double CA;
	
	/////////// ASSOCIATIONS ///////////
		
	@OneToOne
	@JoinColumn(name = "adresse_id", referencedColumnName = "id_adresse")
	private Adresse adresse;
	
	@OneToMany(mappedBy = "conseiller")
    private Collection<Client> listeClients;
	
	@OneToMany(mappedBy = "conseiller")
    private Collection<Contrat> listeContrats;
	
	@OneToMany(mappedBy = "conseiller")
    private Collection<Visite> listeVisites;
	
	/**
	 * Constructor vide
	 */
	public Conseiller() {
		super();
	}
	/**
	 * Consturcteur sans id
	 * @param login
	 * @param password
	 * @param cA
	 * @param adresse
	 */
	public Conseiller(String login, String password, double cA, Adresse adresse) {
		super();
		this.login = login;
		this.password = password;
		CA = cA;
		this.adresse = adresse;
	}
	/**
	 * Constructeur charge
	 * @param id
	 * @param login
	 * @param password
	 * @param cA
	 * @param adresse
	 */
	public Conseiller(int id, String login, String password, double cA, Adresse adresse) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		CA = cA;
		this.adresse = adresse;
	}

	/*
	 * Getters / Setters
	 */

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public double getCA() {
		return CA;
	}
	public void setCA(double cA) {
		CA = cA;
	}
	
	public Collection<Client> getListeClients() {
		return listeClients;
	}
	public void setListeClients(Collection<Client> listeClients) {
		this.listeClients = listeClients;
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
	
	@Override
	public String toString() {
		return "Conseiller [id=" + id + ", login=" + login + ", password=" + password + ", CA=" + CA + ", adresse="
				+ adresse + ", listeClients=" + listeClients + ", listeContrats=" + listeContrats + ", listeVisites="
				+ listeVisites + "]";
	}
	
}
