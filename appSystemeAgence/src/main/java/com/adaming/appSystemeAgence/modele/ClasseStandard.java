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
	
	@OneToMany(mappedBy = "classeStandard")
    private Collection<BienAAcheter> listeBiensALouer;
	
	@OneToMany(mappedBy = "classeStandard")
    private Collection<BienAAcheter> listeBiensAAcheter;
	
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
	 */
	public ClasseStandard(int id, String typeBien, double prixMax, double superficieMin, int modeOffre,
			Collection<BienAAcheter> listeBiensALouer, Collection<BienAAcheter> listeBiensAAcheter,
			Collection<AssociationClientsClassesStandards> listeAssociationClient) {
		super();
		this.id = id;
		this.typeBien = typeBien;
		this.prixMax = prixMax;
		this.superficieMin = superficieMin;
		this.modeOffre = modeOffre;
		this.listeBiensALouer = listeBiensALouer;
		this.listeBiensAAcheter = listeBiensAAcheter;
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
	
	public int getModeOffre() {
		return modeOffre;
	}
	public void setModeOffre(int modeOffre) {
		this.modeOffre = modeOffre;
	}
	
	public Collection<AssociationClientsClassesStandards> getListeAssociationClient() {
		return listeAssociationClient;
	}
	public void setListeAssociationClient(Collection<AssociationClientsClassesStandards> listeAssociationClient) {
		this.listeAssociationClient = listeAssociationClient;
	}
	
	public Collection<BienAAcheter> getListeBiensALouer() {
		return listeBiensALouer;
	}
	public void setListeBiensALouer(Collection<BienAAcheter> listeBiensALouer) {
		this.listeBiensALouer = listeBiensALouer;
	}
	
	public Collection<BienAAcheter> getListeBiensAAcheter() {
		return listeBiensAAcheter;
	}
	public void setListeBiensAAcheter(Collection<BienAAcheter> listeBiensAAcheter) {
		this.listeBiensAAcheter = listeBiensAAcheter;
	}
	
	@Override
	public String toString() {
		return "ClasseStandard [id=" + id + ", typeBien=" + typeBien + ", prixMax=" + prixMax + ", superficieMin="
				+ superficieMin + ", modeOffre=" + modeOffre + ", listeBiensALouer=" + listeBiensALouer
				+ ", listeBiensAAcheter=" + listeBiensAAcheter + ", listeAssociationClient=" + listeAssociationClient
				+ "]";
	}
	
}
