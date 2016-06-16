package com.adaming.appSystemeAgence.modele;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="classeStandard")
@Table(name="classes_standards")
public class ClasseStandard implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_classe_standard", nullable=false)
	private int id;
	
	@Column(name="type_bien")
	private String typeBien;
	
	@Column(name="prix_max")
	private double prixMax;
	
	@Column(name="superficie_min")
	private double superficieMin;
	
	@Column(name="mode_offre")
	private int modeOffre; // boolean
	
	/////////// ASSOCIATIONS ///////////
	
	@ManyToOne (fetch = FetchType.EAGER)
	@JoinColumn (name = "bien_a_louer_id", referencedColumnName = "id_conseiller")
	private BienALouer bienALouer;
	
	@OneToMany(mappedBy = "classeStandard")
    private Collection<AssociationClientsClassesStandards> listeAssociationClient;

	/**
	 * Constructeur vide
	 */
	public ClasseStandard() {
		super();
	}
	/**
	 * Constructeur sans id
	 * @param typeBien
	 * @param prixMax
	 * @param superficieMin
	 * @param modeOffre
	 */
	public ClasseStandard(String typeBien, double prixMax, double superficieMin, int modeOffre) {
		super();
		this.typeBien = typeBien;
		this.prixMax = prixMax;
		this.superficieMin = superficieMin;
		this.modeOffre = modeOffre;
	}
	/**
	 * Constructeur charge
	 * @param id
	 * @param typeBien
	 * @param prixMax
	 * @param superficieMin
	 * @param modeOffre
	 * @param bienALouer
	 * @param listeAssociationClient
	 */
	public ClasseStandard(int id, String typeBien, double prixMax, double superficieMin, int modeOffre,
			BienALouer bienALouer, Collection<AssociationClientsClassesStandards> listeAssociationClient) {
		super();
		this.id = id;
		this.typeBien = typeBien;
		this.prixMax = prixMax;
		this.superficieMin = superficieMin;
		this.modeOffre = modeOffre;
		this.bienALouer = bienALouer;
		this.listeAssociationClient = listeAssociationClient;
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
	
	public String getTypeBien() {
		return typeBien;
	}
	public void setTypeBien(String typeBien) {
		this.typeBien = typeBien;
	}
	
	public double getPrixMax() {
		return prixMax;
	}
	public void setPrixMax(double prixMax) {
		this.prixMax = prixMax;
	}
	
	public double getSuperficieMin() {
		return superficieMin;
	}
	public void setSuperficieMin(double superficieMin) {
		this.superficieMin = superficieMin;
	}
	
	public int isModeOffre() {
		return modeOffre;
	}
	public void setModeOffre(int modeOffre) {
		this.modeOffre = modeOffre;
	}
	
	public BienALouer getBienALouer() {
		return bienALouer;
	}
	public void setBienALouer(BienALouer bienALouer) {
		this.bienALouer = bienALouer;
	}
	
	public Collection<AssociationClientsClassesStandards> getListeAssociationClient() {
		return listeAssociationClient;
	}
	public void setListeAssociationClient(Collection<AssociationClientsClassesStandards> listeAssociationClient) {
		this.listeAssociationClient = listeAssociationClient;
	}
	
	@Override
	public String toString() {
		return "ClasseStandard [id=" + id + ", typeBien=" + typeBien + ", prixMax=" + prixMax + ", superficieMin="
				+ superficieMin + ", modeOffre=" + modeOffre + ", bienALouer=" + bienALouer
				+ ", listeAssociationClient=" + listeAssociationClient + "]";
	}
	
}
