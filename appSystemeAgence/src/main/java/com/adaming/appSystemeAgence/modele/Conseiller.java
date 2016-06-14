package com.adaming.appSystemeAgence.modele;

import java.util.List;

public class Conseiller {
	
	private int id;
	private String login;
	private String password;
	private List<Client> listeClients;
	private double CA;

	
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

	public Conseiller(int id, String login, String password) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
	}
	
	public Conseiller(int id, String login, String password,
			List<Client> listeClients, double cA) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.listeClients = listeClients;
		CA = cA;
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
