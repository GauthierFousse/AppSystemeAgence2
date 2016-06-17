package com.adaming.appSystemeAgence.service;

import java.util.List;

import com.adaming.appSystemeAgence.modele.Proprietaire;

public interface IProprietaireService {

	public void ajouterProprietaire (Proprietaire proprietaire);
	
	public void updateProprietaire (Proprietaire proprietaire);
	
	public List<Proprietaire> getAllProprietaires();
	
	public void deleteProprietaire(int id);
}