package com.adaming.appSystemeAgence.service;

import java.util.List;

import com.adaming.appSystemeAgence.modele.Proprietaire;

public interface IProprietaireService {

	public boolean addProprietaire (Proprietaire proprietaire);
	
	public boolean updateProprietaire (Proprietaire proprietaire);
	
	public List<Proprietaire> getAllProprietaires();
	
	public boolean deleteProprietaire(int id);
}