package com.adaming.appSystemeAgence.modele;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	
	/* A faire en one to many, puisque la classe represente SEULEMENT une table.
	 * private List<Client> listeClients;
	 */
	
	/**
	 * Constructors
	 */
	
	public Conseiller() {
		super();
	}

	public Conseiller(String login, String password, double cA, Adresse adresse) {
		super();
		this.login = login;
		this.password = password;
		CA = cA;
		this.adresse = adresse;
	}
	
	public Conseiller(int id, String login, String password, double cA, Adresse adresse) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		CA = cA;
		this.adresse = adresse;
	}

	/**
	 * Getters / Setters
	 * @return
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
	
	
	
}
