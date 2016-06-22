package com.adaming.appSystemeAgence.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.adaming.appSystemeAgence.modele.BienAAcheter;
import com.adaming.appSystemeAgence.modele.BienALouer;
import com.adaming.appSystemeAgence.modele.Client;

@Repository
public class BienDaoImpl implements IBienDao, Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private SessionFactory sessionFactory;
	
	/**
	 * setter pour injection spring 
	 * @param sessionFactory
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	/**
	 * return la liste de tous les Biens a louer
	 */
	@Transactional(readOnly = true)
	public List<BienALouer> getAllBiensALouer() {
		System.out.println("=====> DAO : getting all the biens a louer.");
		
		Session session = sessionFactory.openSession();
		String getAllBienALouerReq = "FROM bienALouer";
		Query query = session.createQuery(getAllBienALouerReq);
		@SuppressWarnings("unchecked")
		List<BienALouer> listeBiensALouer = query.list();
		
		return listeBiensALouer;
	}
	
	/**
	 * return la liste de tous les Biens a louer
	 */
	@Transactional(readOnly = true)
	public List<BienAAcheter> getAllBiensAAcheter() {
		System.out.println("=====> DAO : getting all the biens a acheter.");
		
		Session session = sessionFactory.openSession();
		String getAllBienAAcheterReq = "FROM bienAAcheter";
		Query query = session.createQuery(getAllBienAAcheterReq);
		@SuppressWarnings("unchecked")
		List<BienAAcheter> listeBiensAAcheter = query.list();
		
		return listeBiensAAcheter;
	}

	/**
	 * return le bien a louer dont l'id est passe en parametre
	 */
	@Transactional(readOnly = true)
	public BienALouer getBienALouerById(int pId) {
		System.out.println("=====> DAO : getting bien a louer id#" + pId);
		
		Session session = sessionFactory.openSession();
		String hqlReq = "FROM bienALouer WHERE id= :bienId";
		Query requete = session.createQuery(hqlReq);
		requete.setParameter("bienId", pId);
		BienALouer bien = (BienALouer) requete.uniqueResult();

		System.out.println("=====> DAO : got bien : " + bien);
		return bien;
	}

	/**
	 * return le bien a acheter dont l'id est passe en parametre
	 */
	@Transactional(readOnly = true)
	public BienAAcheter getBienAAcheterById(int pId) {
		System.out.println("=====> DAO : getting bien a acheter id#" + pId);
		
		Session session = sessionFactory.openSession();
		String hqlReq = "FROM bienAAcheter WHERE id= :bienId";
		Query requete = session.createQuery(hqlReq);
		requete.setParameter("bienId", pId);
		BienAAcheter bien = (BienAAcheter) requete.uniqueResult();

		System.out.println("=====> DAO : got bien : " + bien);
		return bien;
	}

	/**
	 * ajoute le bien a louer dans la BDD.
	 */
	@Transactional(readOnly = false)
	public boolean addBienALouer(BienALouer pBien) {
		System.out.println("=====> DAO : adding bien a louer : " + pBien);
		
		Session session = sessionFactory.openSession();
		session.save(pBien);
		
		return true;
	}

	/**
	 * ajoute le bien a acheter dans la BDD.
	 */
	@Transactional(readOnly = false)
	public boolean addBienAAcheter(BienAAcheter pBien) {
		System.out.println("=====> DAO : adding bien a acheter : " + pBien);
		
		Session session = sessionFactory.openSession();
		session.save(pBien);
		
		return true;
	}

	/**
	 * MAJ du bien a louer dans la BDD.
	 */
	@Transactional(readOnly = false)
	public boolean updateBienALouer(BienALouer pBien) {
		System.out.println("=====> DAO : upadate bien a louer : " + pBien);
		System.out.println("=====> DAO : methode a faire.");
		return false;
	}

	/**
	 * MAJ du bien a acheter dans la BDD.
	 */
	@Transactional(readOnly = false)
	public boolean updateBienAAcheter(BienAAcheter pBien) {
		System.out.println("=====> DAO : update bien a acheter : " + pBien);
		System.out.println("=====> DAO : methode a faire.");
		return false;
	}

	/**
	 * supprime le bien a louer dans la BDD.
	 */
	@Transactional(readOnly = false)
	public boolean deleteBienALouer(int pId) {
		System.out.println("=====> DAO : deleting bien a louer id#" + pId);
		
		Session session = sessionFactory.openSession();

		BienALouer bien = getBienALouerById(pId);

		/* Suppression du bien de la table biens a louer. */
		String supprBienReq = "DELETE FROM bienALouer b WHERE b.id = :bienID";
		Query requete = session.createQuery(supprBienReq);
		requete.setParameter("bienID", pId);
		int resultat = requete.executeUpdate();
		System.out.println("=====> DAO : " + resultat + " bien(s) supprimé(s).");

		/* Suppression de l'adresse du bien de la table adresses. */
		String supprAdresseReq = "DELETE FROM adresse a WHERE a.id = :aID";
		Query requete2 = session.createQuery(supprAdresseReq);
		requete2.setParameter("aID", bien.getAdresse().getId());
		int resultat2 = requete2.executeUpdate();
		System.out.println("=====> DAO : " + resultat + " adresse(s) supprimée(s).");

		boolean success;
		if (resultat != 0 && resultat2 != 0)
			success = true;
		else
			success = false;
		
		return success;
	}

	/**
	 * supprime le bien a acheter dans la BDD.
	 */
	@Transactional(readOnly = false)
	public boolean deleteBienAAcheter(int pId) {
		System.out.println("=====> DAO : deleting bien a acheter id#" + pId);

		Session session = sessionFactory.openSession();

		BienAAcheter bien = getBienAAcheterById(pId);

		/* Suppression du bien de la table biens a acheter. */
		String supprBienReq = "DELETE FROM bienAAcheter b WHERE b.id = :bienID";
		Query requete = session.createQuery(supprBienReq);
		requete.setParameter("bienID", pId);
		int resultat = requete.executeUpdate();
		System.out.println("=====> DAO : " + resultat + " bien(s) supprimé(s).");

		/* Suppression de l'adresse du bien de la table adresses. */
		String supprAdresseReq = "DELETE FROM adresse a WHERE a.id = :aID";
		Query requete2 = session.createQuery(supprAdresseReq);
		requete2.setParameter("aID", bien.getAdresse().getId());
		int resultat2 = requete2.executeUpdate();
		System.out.println("=====> DAO : " + resultat + " adresse(s) supprimée(s).");

		boolean success;
		if (resultat != 0 && resultat2 != 0)
			success = true;
		else
			success = false;
		
		return success;
	}


}
