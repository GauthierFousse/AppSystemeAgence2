package com.adaming.appSystemeAgence.modele;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "proprietaire")
@Table(name = "proprietaires")
public class Proprietaire extends Personne implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_proprietaire")
	private int id;
	
	@Column(name = "tel_travail")
	private String telTravail;
	
//	private List<BienImmobilier> listeBiens;

	/////////// ASSOCIATIONS ///////////
	
	@OneToMany(mappedBy = "proprietaire")
    private Collection<BienImmobilier> listeBiens;
	
	/* Constructeurs. */
	public Proprietaire() {
		super();
	}
	public Proprietaire(String telTravail) {
		super();
		this.telTravail = telTravail;
	}
	public Proprietaire(int id, String telTravail) {
		super();
		this.id = id;
		this.telTravail = telTravail;
	}
	

	/* Accesseurs et mutateurs. */
	public String getTelTravail() {
		return telTravail;
	}
	public void setTelTravail(String telTravail) {
		this.telTravail = telTravail;
	}
}
