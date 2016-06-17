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
	public void ajouterProprietaire(Proprietaire proprietaire) {
		System.out.println("====> Service : ajout Proprietaire");
		if (proprietaireDao.addProprietaire(proprietaire)) {
			System.out.println("====> Service : ajout success.");
		} else {
			System.out.println("====> Service : ajout fail.");
		}
	}

	/**
	 * MAJ proprietaire
	 */
	public void updateProprietaire(Proprietaire proprietaire) {
		System.out.println("====> Service : update Proprietaire");
		if (proprietaireDao.updateProprietaire(proprietaire)) {
			System.out.println("====> Service : update success.");
		} else {
			System.out.println("====> Service : update fail.");
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
	public void deleteProprietaire(int id) {
		System.out.println("====> Service : delete Proprietaire");
		if (proprietaireDao.deleteProprietaire(id)) {
			System.out.println("====> Service : delete success.");
		} else {
			System.out.println("====> Service : delete fail.");
		}
	}
	
	

}
