package com.adaming.appSystemeAgence.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.appSystemeAgence.dao.ProprietaireDaoImpl;
import com.adaming.appSystemeAgence.modele.Proprietaire;

@Service("proprietaireServiceBean")
public class ProprietaireServiceImpl implements IProprietaireService {

	@Autowired
	private ProprietaireDaoImpl proprietaireDao;
	
	/**
	 * Ajout d'un propri�taire dans la base de donn�es.
	 */
	public void ajouterProprietaire(Proprietaire proprietaire) {
		System.out.println("===== Entr�e dans la m�thode ajouterProprietaire de ProprietaireServiceImpl. =====");
		proprietaireDao.addProprietaire(proprietaire);
		System.out.println("===== Sortie de la m�thode ajouterProprietaire de ProprietaireServiceImpl. =====");
	}

}
