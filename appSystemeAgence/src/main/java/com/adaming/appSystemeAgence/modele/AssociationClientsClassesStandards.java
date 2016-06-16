package com.adaming.appSystemeAgence.modele;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="client_classe_standard")
@Table(name="clients_classes_standards")
public class AssociationClientsClassesStandards implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_clients_classes_standards", nullable=false)
	private int id;
	
	/////////// ASSOCIATIONS ///////////
	
	@ManyToOne (fetch = FetchType.EAGER)
	@JoinColumn (name = "client_id", referencedColumnName = "id_client")
	private Client client;
	
	@ManyToOne (fetch = FetchType.EAGER)
	@JoinColumn (name = "classe_standard_id", referencedColumnName = "id_classe_standard")
	private ClasseStandard classeStandard;

	/**
	 * Constructeur vide
	 */
	public AssociationClientsClassesStandards() {
		super();
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

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public ClasseStandard getClasseStandard() {
		return classeStandard;
	}

	public void setClasseStandard(ClasseStandard classeStandard) {
		this.classeStandard = classeStandard;
	}
	
	
}
