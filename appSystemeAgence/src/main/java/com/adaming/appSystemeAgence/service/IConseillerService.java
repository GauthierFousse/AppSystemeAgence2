package com.adaming.appSystemeAgence.service;

import java.util.List;

import com.adaming.appSystemeAgence.modele.Conseiller;


public interface IConseillerService {
	
	public List<Conseiller> getAllConseillers();
	public boolean addConseiller(Conseiller pConseiller);
	public boolean isExistConseiller(int idConseiller);
	public boolean isValidConseiller(String pUserName, String pPassword);
}
