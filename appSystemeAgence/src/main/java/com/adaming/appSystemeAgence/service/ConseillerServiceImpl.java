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
	 * RÃ©cupÃ©ration de l'ensemble des conseillers sous forme de liste.
	 */
	public List<Conseiller> getAllConseillers() {
		return conseillerDao.getAllConseillers();
	}

	/**
	 * Ajout d'un conseiller
	 */
	public void addConseiller(Conseiller pConseiller) {
		System.out.println("===== Entrée dans la méthode addConseiller de ConseillerServiceImpl.java. =====");
		conseillerDao.addConseiller(pConseiller);
		System.out.println("===== Sortie de la méthode addConseiller de ConseillerServiceImpl.java. =====");
	}
}
