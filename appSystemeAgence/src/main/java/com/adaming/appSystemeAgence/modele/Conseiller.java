package com.adaming.appSystemeAgence.modele;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name="conseiller")
@Table(name="conseillers")  
/*@AttributeOverrides({  
    @AttributeOverride(name="id_personne", column=@Column(name="id_personne")),  
    @AttributeOverride(name="nom", column=@Column(name="nom")), 
    @AttributeOverride(name="prenom", column=@Column(name="prenom")), 
    @AttributeOverride(name="tel_prive", column=@Column(name="tel_prive"))  
})*/
public class Conseiller extends Personne implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column(name="login")
	private String login;
	
	@Column(name="password")
	private String password;
	
	@Column(name="chiffre_affaire")
	private double CA;
	
	/* A faire en one to many, puisque la classe represente SEULEMENT une table.
	 * private List<Client> listeClients;
	 */
	
	/**
	 * Constructors
	 */
	
	public Conseiller() {
		super();
	}

	public Conseiller(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	public Conseiller(String login, String password, double cA) {
		super();
		this.login = login;
		this.password = password;
		CA = cA;
	}

	/**
	 * Getters / Setters
	 * @return
	 */

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
