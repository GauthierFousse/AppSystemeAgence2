package com.adaming.appSystemeAgence.service;

import java.util.List;

import com.adaming.appSystemeAgence.modele.Conseiller;


public interface IConseillerService {
	
	public List<Conseiller> getAllConseillers();
	public boolean addConseiller(Conseiller pConseiller);
	public void deleteConseiller(Conseiller pConseiller);
	public void deleteConseillerById(int idConseiller);
	public boolean isExistConseiller(int idConseiller);
	public boolean isValidConseiller(String pUserName, String pPassword);
	public Conseiller getConseillerByID(int idConseiller);
	public Conseiller getConseillerByLogin(String pUserName, String pPassword);
}
