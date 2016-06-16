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

@Entity(name="contrat")
@Table(name="contrats")
public class Contrat implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_contrat", nullable=false)
	private int id;
	
	@Column(name="num_contrat")
	private String numContrat;
	
	@Column(name="prix_achat")
	private double prixAchat;
	
	@Column(name="date_achat")
	private Date dateAchat;
	
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
	public Contrat() {
		super();
	}
	/* BIEN A LOUER */
	/**
	 * Constructeur avec bien a louer sans id
	 * @param numContrat
	 * @param prixAchat
	 * @param dateAchat
	 * @param bienALouer
	 * @param client
	 * @param conseiller
	 */
	public Contrat(String numContrat, double prixAchat, Date dateAchat, BienALouer bienALouer, Client client,
			Conseiller conseiller) {
		super();
		this.numContrat = numContrat;
		this.prixAchat = prixAchat;
		this.dateAchat = dateAchat;
		this.bienALouer = bienALouer;
		this.client = client;
		this.conseiller = conseiller;
	}
	/**
	 * Constructeur avec bien a louer charge
	 * @param id
	 * @param numContrat
	 * @param prixAchat
	 * @param dateAchat
	 * @param bienALouer
	 * @param client
	 * @param conseiller
	 */
	public Contrat(int id, String numContrat, double prixAchat, Date dateAchat, BienALouer bienALouer, Client client,
			Conseiller conseiller) {
		super();
		this.id = id;
		this.numContrat = numContrat;
		this.prixAchat = prixAchat;
		this.dateAchat = dateAchat;
		this.bienALouer = bienALouer;
		this.client = client;
		this.conseiller = conseiller;
	}
	/* BIEN A ACHETER */
	/**
	 * Constructeur avec bien a acheter sans id
	 * @param numContrat
	 * @param prixAchat
	 * @param dateAchat
	 * @param bienAAcheter
	 * @param client
	 * @param conseiller
	 */
	public Contrat(String numContrat, double prixAchat, Date dateAchat, BienAAcheter bienAAcheter, Client client,
			Conseiller conseiller) {
		super();
		this.numContrat = numContrat;
		this.prixAchat = prixAchat;
		this.dateAchat = dateAchat;
		this.bienAAcheter = bienAAcheter;
		this.client = client;
		this.conseiller = conseiller;
	}
	/**
	 * Constructeur avec bien a acheter charge
	 * @param id
	 * @param numContrat
	 * @param prixAchat
	 * @param dateAchat
	 * @param bienAAcheter
	 * @param client
	 * @param conseiller
	 */
	public Contrat(int id, String numContrat, double prixAchat, Date dateAchat, BienAAcheter bienAAcheter,
			Client client, Conseiller conseiller) {
		super();
		this.id = id;
		this.numContrat = numContrat;
		this.prixAchat = prixAchat;
		this.dateAchat = dateAchat;
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

	public String getNumContrat() {
		return numContrat;
	}
	public void setNumContrat(String numContrat) {
		this.numContrat = numContrat;
	}

	public double getPrixAchat() {
		return prixAchat;
	}
	public void setPrixAchat(double prixAchat) {
		this.prixAchat = prixAchat;
	}

	public Date getDateAchat() {
		return dateAchat;
	}
	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
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
		return "Contrat [id=" + id + ", numContrat=" + numContrat + ", prixAchat=" + prixAchat + ", dateAchat="
				+ dateAchat + ", bienALouer=" + bienALouer + ", bienAAcheter=" + bienAAcheter + ", client=" + client
				+ ", conseiller=" + conseiller + "]";
	}

}
