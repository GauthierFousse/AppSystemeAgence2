package com.adaming.appSystemeAgence.dao;

import java.util.List;

import com.adaming.appSystemeAgence.modele.Conseiller;

public interface IConseillerDao {
	
	Boolean isExist(int idConseiller);
	
	public List<Conseiller> getAllConseillers();
	
	public void addConseiller(Conseiller pConseiller);

}
