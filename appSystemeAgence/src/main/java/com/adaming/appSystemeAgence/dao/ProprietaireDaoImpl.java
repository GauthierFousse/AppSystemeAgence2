package com.adaming.appSystemeAgence.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
	public boolean addProprietaire(Proprietaire proprietaire) {
		System.out.println("=====> DAO : addProprietaire : " + proprietaire);
		Session session = sf.openSession();
		session.save(proprietaire);
		return true;
	}


	/**
	 * recuération de tous les proprios
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
		//sf.getCurrentSession().merge(proprietaire);
		Session session = sf.openSession();
		//session.saveOrUpdate(proprietaire);
		
		String hqlUpdate = "UPDATE proprietaire p SET p.nom = :pNom , p.prenom = :pPrenom , p.telPrive = :pTel_prive , p.telTravail = :pTel_travail WHERE p.id = :pID";
		Query query = session.createQuery(hqlUpdate);
		query.setParameter("pNom", proprietaire.getNom());
		query.setParameter("pPrenom", proprietaire.getPrenom());
		query.setParameter("pTel_prive", proprietaire.getTelPrive());
		query.setParameter("pTel_travail", proprietaire.getTelTravail());
		query.setParameter("pID", proprietaire.getId());
		
		int result = query.executeUpdate();
		
		System.out.println("=====> DAO : " + result + "proprietaire (sans adresse) MAJ.");
		
		String hqlUpdate2 = "Update adresse a SET a.rue = :aRue , a.codePostal = :aCodePostal , a.ville = :aVille WHERE a.id = :aID ";
		Query query2 = session.createQuery(hqlUpdate2);
		query2.setParameter("aRue", proprietaire.getAdresse().getRue());
		query2.setParameter("aCodePostal", proprietaire.getAdresse().getCodePostal());
		query2.setParameter("aVille", proprietaire.getAdresse().getVille());
		query2.setParameter("aID", proprietaire.getAdresse().getId());
		
		int result2 = query2.executeUpdate();
		
		System.out.println("=====> DAO : " + result2 + " adresse proprietaire MAJ.");
		System.out.println("=====> Id adresse : " + proprietaire.getAdresse().getId());
		
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


	public Proprietaire getProprietaireById(int id) {

System.out.println("=====> DAO : getting proprietaire by id");
		
		Session session = sf.openSession();
		
		String hqlReq = "FROM proprietaire WHERE id= :pId";
		
		Query query = session.createQuery(hqlReq);
		query.setParameter("pId", id);
		
		Proprietaire prop = (Proprietaire) query.uniqueResult();
		
		
		return prop;
		
	}
}