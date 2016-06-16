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

	/////////// ASSOCIATIONS ///////////
	
	@OneToOne
	@JoinColumn(name = "adresse_id", referencedColumnName = "id_adresse")
	private Adresse adresse;
	
	@OneToMany(mappedBy = "proprietaire")
    private Collection<BienALouer> listeBiensALouer;
	
	@OneToMany(mappedBy = "proprietaire")
    private Collection<BienAAcheter> listeBiensAAcheter;
	
	/**
	 * Constructeurs vide
	 */
	public Proprietaire() {
		super();
	}
	/**
	 * Constructeur sans l'id
	 * @param telTravail
	 * @param listeBiensALouer
	 * @param listeBiensAAcheter
	 */
	public Proprietaire(String telTravail, Collection<BienALouer> listeBiensALouer,
			Collection<BienAAcheter> listeBiensAAcheter) {
		super();
		this.telTravail = telTravail;
		this.listeBiensALouer = listeBiensALouer;
		this.listeBiensAAcheter = listeBiensAAcheter;
	}
	/**
	 * Constructeur plein
	 * @param id
	 * @param telTravail
	 * @param listeBiensALouer
	 * @param listeBiensAAcheter
	 */
	public Proprietaire(int id, String telTravail, Collection<BienALouer> listeBiensALouer,
			Collection<BienAAcheter> listeBiensAAcheter) {
		super();
		this.id = id;
		this.telTravail = telTravail;
		this.listeBiensALouer = listeBiensALouer;
		this.listeBiensAAcheter = listeBiensAAcheter;
	}
	/*
	 * GETTERS and SETTERS
	 */
	public String getTelTravail() {
		return telTravail;
	}
	public void setTelTravail(String telTravail) {
		this.telTravail = telTravail;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Collection<BienALouer> getListeBiensALouer() {
		return listeBiensALouer;
	}
	public void setListeBiensALouer(Collection<BienALouer> listeBiensALouer) {
		this.listeBiensALouer = listeBiensALouer;
	}
	public Collection<BienAAcheter> getListeBiensAcheter() {
		return listeBiensAAcheter;
	}
	public void setListeBiensAcheter(Collection<BienAAcheter> listeBiensAcheter) {
		this.listeBiensAAcheter = listeBiensAcheter;
	}
	
}
