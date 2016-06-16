package com.adaming.appSystemeAgence.modele;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="visite")
@Table(name="visites")
public class Visite implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_visite", nullable=false)
	private int id;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="heure")
	private Date heure;
	
	/////////// ASSOCIATIONS ///////////
		
	@ManyToOne (fetch = FetchType.EAGER)
	@JoinColumn(name = "bien_a_louer_id", referencedColumnName = "id_bien_a_louer")
	private BienALouer bienALouer;
	
	@ManyToOne (fetch = FetchType.EAGER)
	@JoinColumn(name = "bien_a_acheter_id", referencedColumnName = "id_bien_a_acheter")
	private BienAAcheter bienAAcheter;
	
	@ManyToOne (fetch = FetchType.EAGER)
	@JoinColumn (name = "client_id", referencedColumnName = "id_client")
	private Client client;
	
	@ManyToOne (fetch = FetchType.EAGER)
	@JoinColumn (name = "conseiller_id", referencedColumnName = "id_conseiller")
	private Conseiller conseiller;
	
	
	/**
	 * Constructeur vide
	 */
	public Visite() {
	}
	/* Bien a louer */
	/**
	 * Constructeur bien a louer sans id
	 * @param date
	 * @param heure
	 * @param bienALouer
	 * @param client
	 * @param conseiller
	 */
	public Visite(Date date, Date heure, BienALouer bienALouer, Client client, Conseiller conseiller) {
		super();
		this.date = date;
		this.heure = heure;
		this.bienALouer = bienALouer;
		this.client = client;
		this.conseiller = conseiller;
	}
	/**
	 * Constructeur bien a louer charge
	 * @param id
	 * @param date
	 * @param heure
	 * @param bienALouer
	 * @param client
	 * @param conseiller
	 */
	public Visite(int id, Date date, Date heure, BienALouer bienALouer, Client client, Conseiller conseiller) {
		super();
		this.id = id;
		this.date = date;
		this.heure = heure;
		this.bienALouer = bienALouer;
		this.client = client;
		this.conseiller = conseiller;
	}
	/* Bien a acheter */
	/**
	 * Constructeur bien a acheter sans id
	 * @param date
	 * @param heure
	 * @param bienAAcheter
	 * @param client
	 * @param conseiller
	 */
	public Visite(Date date, Date heure, BienAAcheter bienAAcheter, Client client, Conseiller conseiller) {
		super();
		this.date = date;
		this.heure = heure;
		this.bienAAcheter = bienAAcheter;
		this.client = client;
		this.conseiller = conseiller;
	}
	/**
	 * Constructeur bien a acheter charge
	 * @param id
	 * @param date
	 * @param heure
	 * @param bienAAcheter
	 * @param client
	 * @param conseiller
	 */
	public Visite(int id, Date date, Date heure, BienAAcheter bienAAcheter, Client client, Conseiller conseiller) {
		super();
		this.id = id;
		this.date = date;
		this.heure = heure;
		this.bienAAcheter = bienAAcheter;
		this.client = client;
		this.conseiller = conseiller;
	}
	
	/*
	 * GETTERS and SETTERS
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Date getHeure() {
		return heure;
	}
	public void setHeure(Date heure) {
		this.heure = heure;
	}
	
	public BienALouer getBienALouer() {
		return bienALouer;
	}
	public void setBienALouer(BienALouer bienALouer) {
		this.bienALouer = bienALouer;
	}
	
	public BienAAcheter getBienAAcheter() {
		return bienAAcheter;
	}
	public void setBienAAcheter(BienAAcheter bienAAcheter) {
		this.bienAAcheter = bienAAcheter;
	}
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	public Conseiller getConseiller() {
		return conseiller;
	}
	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}
	
	@Override
	public String toString() {
		return "Visite [id=" + id + ", date=" + date + ", heure=" + heure + ", bienALouer=" + bienALouer
				+ ", bienAAcheter=" + bienAAcheter + ", client=" + client + ", conseiller=" + conseiller + "]";
	}
}
