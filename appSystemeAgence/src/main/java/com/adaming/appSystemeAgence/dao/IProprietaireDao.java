package com.adaming.appSystemeAgence.dao;

import java.util.List;
import com.adaming.appSystemeAgence.modele.Proprietaire;

public interface IProprietaireDao {

	public boolean addProprietaire (Proprietaire proprietaire);
	
	public List<Proprietaire> getAllProprietaires();
	
	public boolean updateProprietaire (Proprietaire proprietaire);
	
	public boolean deleteProprietaire (int id);
	
}