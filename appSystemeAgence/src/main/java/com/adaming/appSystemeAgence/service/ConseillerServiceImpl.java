package com.adaming.appSystemeAgence.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public boolean addConseiller(Conseiller pConseiller) {
		System.out.println("====> Service: adding Conseiller : " + pConseiller);
		if (conseillerDao.addConseiller(pConseiller)){
			System.out.println("====> Service: Conseiller added with success.");
			return true;
		} else {
			System.out.println("====> Service: Conseiller added with success.");
			return false;
		}
		
	}
	
	/**
	 * Vérifie l'existence de l'id conseiller
	 */
	public boolean isExistConseiller(int idConseiller) {
		System.out.println("====> Service: isExist Conseiller id#" + idConseiller);
		Boolean isExist = conseillerDao.isExistConseiller(idConseiller);
		if (isExist){
			System.out.println("====> Service: Conseiller id#" + idConseiller + " exists.");
		} else {
			System.out.println("====> Service: Conseiller id#" + idConseiller + " does NOT exist.");
		}
		return isExist;
		
	}

	/**
	 * Verifie l'existance du login et password conseiller dans la BDD.
	 */
	public boolean isValidConseiller(String pUserName, String pPassword) {
		System.out.println("====> Service: isValid Conseiller " + pUserName + " ; " + pPassword);
		Boolean isValid = conseillerDao.isValidConseiller(pUserName, pPassword);
		if (isValid){
			System.out.println("====> Service: Conseiller " + pUserName + " ; " + pPassword + " is valid.");
		} else {
			System.out.println("====> Service: Conseiller " + pUserName + " ; " + pPassword + " is NOT valid.");
		}
		return isValid;
	}
	
	
}
