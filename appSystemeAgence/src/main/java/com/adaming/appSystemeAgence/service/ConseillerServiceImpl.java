package com.adaming.appSystemeAgence.service;

import java.util.List;

import com.adaming.appSystemeAgence.dao.IConseillerDao;
import com.adaming.appSystemeAgence.modele.Conseiller;


public class ConseillerServiceImpl implements IConseillerService {

	private IConseillerDao conseillerDao;
	
	/**
	 * Récupération de l'ensemble des conseillers sous forme de liste.
	 */
	public List<Conseiller> getAllConseillers() {
		return conseillerDao.getAllConseillers();
	}

	/**
	 * Ajout d'un conseiller
	 */
	public void addConseiller(Conseiller pConseiller) {
		System.out.println("===== Entr�e dans la m�thode addConseiller de ConseillerServiceImpl.java. =====");
		conseillerDao.addConseiller(pConseiller);
		System.out.println("===== Sortie de la m�thode addConseiller de ConseillerServiceImpl.java. =====");
	}
	
	/**
	 * Initialisation d'un conseiller d'un conseiller
	 */
	public void initConseiller(Conseiller pConseiller) {
		System.out.println("===== Entr�e dans la m�thode initConseiller de ConseillerServiceImpl.java. =====");
		conseillerDao.initConseiller(pConseiller);
		System.out.println("===== Sortie de la m�thode initConseiller de ConseillerServiceImpl.java. =====");
	}
}
