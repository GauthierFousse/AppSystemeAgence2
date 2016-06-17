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
	
	/* Mutateur utilis� en Spring pour l'injection dans le conteneur. */
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}


	/**
	 * Ajout d'un propri�taire � la base de donn�es.
	 */
	public boolean addProprietaire(Proprietaire proprietaire) {
		System.out.println("=====> DAO : addProprietaire : " + proprietaire);
		Session session = sf.openSession();
		session.save(proprietaire);
		return true;
	}


	/**
	 * recu�ration de tous les proprios
	 */
	public List<Proprietaire> getAllProprietaires() {
		System.out.println("=====> DAO : getting all the proprietaires");
		
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
	public boolean updateProprietaire(Proprietaire proprietaire) {
		System.out.println("=====> DAO : update Proprietaire : " + proprietaire);
		Session session = sf.openSession();
		session.update(proprietaire);
		return true;
	}


	/**
	 * suppression d'un proprio par l'id
	 */
	public boolean deleteProprietaire(int id) {
		System.out.println("=====> DAO : deleting prorpietaire id#" + id);
		
		Session session = sf.openSession();
		
		String hqlDelete = "DELETE FROM proprietaire p WHERE p.id = :pID";
		Query query = session.createQuery(hqlDelete);
		query.setParameter("pID", id);
		
		int result = query.executeUpdate();
		
		System.out.println("=====> DAO : " + result + "proprietaires supprimes.");
		
		if (result > 0) {
			return true;
		} else {
			return true;
		}
		
	}
}