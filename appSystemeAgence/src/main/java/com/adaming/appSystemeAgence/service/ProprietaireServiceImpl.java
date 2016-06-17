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
	 * Ajout d'un propri�taire dans la base de donn�es.
	 */
	public void ajouterProprietaire(Proprietaire proprietaire) {
		System.out.println("===== Entr�e dans la m�thode ajouterProprietaire de ProprietaireServiceImpl. =====");
		proprietaireDao.addProprietaire(proprietaire);
		System.out.println("===== Sortie de la m�thode ajouterProprietaire de ProprietaireServiceImpl. =====");
	}

	@Override
	public void updateProprietaire(Proprietaire proprietaire) {
		
		proprietaireDao.updateProprietaire(proprietaire);
	}

	@Override
	public List<Proprietaire> getAllProprietaires() {
		
		return proprietaireDao.getAllProprietaires();
	}

	@Override
	public void deleteProprietaire(int id) {
		
		proprietaireDao.deleteProprietaire(id);
	}
	
	

}
