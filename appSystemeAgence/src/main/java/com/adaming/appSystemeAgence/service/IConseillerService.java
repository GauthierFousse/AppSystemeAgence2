package com.adaming.appSystemeAgence.service;

import java.util.List;

import com.adaming.appSystemeAgence.modele.Conseiller;


public interface IConseillerService {
	
	public List<Conseiller> getAllConseillers();
	public void addConseiller(Conseiller pConseiller);
	public Boolean isExistConseiller(int idConseiller);
	public Boolean isValidConseiller(String pUserName, String pPassword);
}
