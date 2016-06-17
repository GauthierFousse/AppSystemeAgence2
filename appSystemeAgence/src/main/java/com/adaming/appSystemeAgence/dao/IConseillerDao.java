package com.adaming.appSystemeAgence.dao;

import java.util.List;

import com.adaming.appSystemeAgence.modele.Conseiller;

public interface IConseillerDao {
	
	
	public List<Conseiller> getAllConseillers();
	
	public void addConseiller(Conseiller pConseiller);
	
	public Conseiller getConseillerByID(int idConseiller);
	
	Boolean isExistConseiller(int idConseiller);
	
	Boolean isValidConseiller(String pUserName, String pPassword);

}
