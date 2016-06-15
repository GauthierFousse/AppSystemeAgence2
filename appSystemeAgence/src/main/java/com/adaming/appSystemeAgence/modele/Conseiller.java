package com.adaming.appSystemeAgence.modele;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name="conseiller")
@Table(name="conseillers")  
@AttributeOverrides({  
    @AttributeOverride(name="id_personne", column=@Column(name="id_personne")),  
    @AttributeOverride(name="nom", column=@Column(name="nom")), 
    @AttributeOverride(name="prenom", column=@Column(name="prenom")), 
    @AttributeOverride(name="tel_prive", column=@Column(name="tel_prive"))  
})  
public class Conseiller {
	
	@Column(name="login")
	private String login;
	
	@Column(name="password")
	private String password;
	
	@Column(name="chiffre_affaire")
	private double CA;
	
	private List<Client> listeClients;
	
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

	public Conseiller(String login, String password,
			List<Client> listeClients, double cA) {
		super();
		this.login = login;
		this.password = password;
		this.listeClients = listeClients;
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

	public List<Client> getListeClients() {
		return listeClients;
	}

	public void setListeClients(List<Client> listeClients) {
		this.listeClients = listeClients;
	}

	public double getCA() {
		return CA;
	}

	public void setCA(double cA) {
		CA = cA;
	}
	
	
	
}
