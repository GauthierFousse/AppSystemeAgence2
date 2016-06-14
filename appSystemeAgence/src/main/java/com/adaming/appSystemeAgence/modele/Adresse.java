package com.adaming.appSystemeAgence.modele;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "adresse")
@Table(name = "adresses")
public class Adresse {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_adresse", nullable = false)
	private int id;

	@Column(name = "rue")
	private String rue; // rue + numero rue

	@Column(name = "codePostal")
	private int codePostal;

	@Column(name = "ville")
	private String ville;
	
	/////////// ASSOCIATIONS ////////////
	
	@OneToOne(mappedBy = "adresse")
	private Personne personne;
	
	/////////// CONSTRUCTEURS /////////
	
	public Adresse() {
		super();
	}

	public Adresse(String rue, int codePostal, String ville) {
		super();
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	public Adresse(int id, String rue, int codePostal, String ville) {
		super();
		this.id = id;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	/////////// GETTERS & SETTERS /////////
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

}
