package com.adaming.appSystemeAgence.dao;

import java.util.List;

import org.hibernate.Query;
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


	/**
	 * recuération de tous les proprios
	 */
	@Override
	public List<Proprietaire> getAllProprietaires() {
		Session session = sf.openSession();
		
		String hqlReq = "FROM proprietaire";
		
		Query query = session.createQuery(hqlReq);
		
		@SuppressWarnings("unchecked")
		List<Proprietaire> proprietaireList = query.list();
		
		return proprietaireList;

	}


	/**
	 * Maj d'un proprio
	 */
	@Override
	public void updateProprietaire(Proprietaire proprietaire) {
		
		Session session = sf.openSession();
		session.update(proprietaire);
		
	}


	/**
	 * suppression d'un proprio par l'id
	 */
	@Override
	public void deleteProprietaire(int id) {
		
		Session session = sf.openSession();
		
		String hqlDelete = "DELETE FROM proprietaire p WHERE p.id = :pID";
		Query query = session.createQuery(hqlDelete);
		query.setParameter("pID", id);
		
		int result = query.executeUpdate();
		
		System.out.println(" Nombre de proprietaires supprimés : =========> " + result);
		
	}
}