package com.adaming.appSystemeAgence.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.appSystemeAgence.dao.ProprietaireDaoImpl;
import com.adaming.appSystemeAgence.modele.Proprietaire;

@Service("proprietaireServiceBean")
public class ProprietaireServiceImpl implements IProprietaireService {

	@Autowired
	private ProprietaireDaoImpl proprietaireDao;
	
	/**
	 * Ajout d'un propriétaire dans la base de données.
	 */
	public boolean addProprietaire(Proprietaire proprietaire) {
		System.out.println("====> Service : ajout Proprietaire");
		if (proprietaireDao.addProprietaire(proprietaire)) {
			System.out.println("====> Service : ajout success.");
			return true;
		} else {
			System.out.println("====> Service : ajout fail.");
			return false;
		}
	}

	/**
	 * MAJ proprietaire
	 */
	public boolean updateProprietaire(Proprietaire proprietaire) {
		System.out.println("====> Service : update Proprietaire");
		if (proprietaireDao.updateProprietaire(proprietaire)) {
			System.out.println("====> Service : update success.");
			return true;
		} else {
			System.out.println("====> Service : update fail.");
			return false;
		}
	}

	/**
	 * return the list of all the proprietaires
	 */
	public List<Proprietaire> getAllProprietaires() {
		System.out.println("====> Service : getting all proprietaires");
		return proprietaireDao.getAllProprietaires();
	}

	/**
	 * Supprime un proprietaire
	 */
	public boolean deleteProprietaire(int id) {
		System.out.println("====> Service : delete Proprietaire");
		if (proprietaireDao.deleteProprietaire(id)) {
			System.out.println("====> Service : delete success.");
			return true;
		} else {
			System.out.println("====> Service : delete fail.");
			return false;
		}
	}
	
	

}
