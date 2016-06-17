package com.adaming.appSystemeAgence.dao;

import java.util.List;
import com.adaming.appSystemeAgence.modele.Proprietaire;

public interface IProprietaireDao {

	public void addProprietaire (Proprietaire proprietaire);
	
	public List<Proprietaire> getAllProprietaires();
	
	public void updateProprietaire (Proprietaire proprietaire);
	
	public void deleteProprietaire (int id);
	
}