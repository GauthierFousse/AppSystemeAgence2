package com.adaming.appSystemeAgence.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.adaming.appSystemeAgence.modele.Proprietaire;

@Repository
public class ProprietaireDaoImpl implements IProprietaireDao {

	@Autowired
	private SessionFactory sf;
	
	/* Mutateur utilisé en Spring pour l'injection dans le conteneur. */
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}


	/**
	 * Ajout d'un propriétaire à la base de données.
	 */
	public void addProprietaire(Proprietaire proprietaire) {
		System.out.println("===== Entrée dans la méthode addProprietaire de ProprietaireDaoImpl. =====");
		Session session = sf.openSession();
		session.save(proprietaire);
		System.out.println("===== Sortie de la méthode addProprietaire de ProprietaireDaoImpl. =====");
	}
}