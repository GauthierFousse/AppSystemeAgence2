package com.adaming.appSystemeAgence.dao;

import java.util.List;

import com.adaming.appSystemeAgence.modele.Conseiller;

public interface IConseillerDao {
	
	
	public List<Conseiller> getAllConseillers();
	
	public boolean addConseiller(Conseiller pConseiller);
	
	public Conseiller getConseillerByID(int idConseiller);
	
	public boolean isExistConseiller(int idConseiller);
	
	public boolean isValidConseiller(String pUserName, String pPassword);

}
