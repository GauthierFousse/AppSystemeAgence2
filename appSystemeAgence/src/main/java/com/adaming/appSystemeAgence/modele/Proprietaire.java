package com.adaming.appSystemeAgence.modele;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "proprietaire")
@Table(name = "proprietaires")
public class Proprietaire extends Personne implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_proprietaire")
	private int id;
	
	@Column(name = "tel_travail")
	private String telTravail;
	
//	private List<BienImmobilier> listeBiens;

	
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
