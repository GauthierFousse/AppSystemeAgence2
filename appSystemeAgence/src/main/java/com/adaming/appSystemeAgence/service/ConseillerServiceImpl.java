package com.adaming.appSystemeAgence.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adaming.appSystemeAgence.dao.IConseillerDao;
import com.adaming.appSystemeAgence.modele.Conseiller;

@Service("conseillerServiceBean")
public class ConseillerServiceImpl implements IConseillerService {

	@Autowired
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
		System.out.println("===== Entree dans la methode addConseiller de ConseillerServiceImpl.java. =====");
		conseillerDao.addConseiller(pConseiller);
		System.out.println("===== Sortie de la methode addConseiller de ConseillerServiceImpl.java. =====");
	}
	
	/**
	 * Vérifie l'existence du conseiller
	 */
	public Boolean isExistConseiller(int idConseiller) {
		System.out.println("===== Entree dans la methode isExistConseiller de ConseillerServiceImpl.java. =====");
		Boolean isExist = conseillerDao.isExistConseiller(idConseiller);
		System.out.println("===== Sortie de la methode isExistConseiller de ConseillerServiceImpl.java. =====");
		return isExist;
		
	}

	public Boolean isValidConseiller(String pUserName, String pPassword) {
		System.out.println("===== Entree dans la methode isValidConseiller de ConseillerServiceImpl.java. =====");
		Boolean isValid = conseillerDao.isValidConseiller(pUserName, pPassword);
		System.out.println("===== Sortie de la methode isValidConseiller de ConseillerServiceImpl.java. =====");
		return isValid;
	}
	
	
}
