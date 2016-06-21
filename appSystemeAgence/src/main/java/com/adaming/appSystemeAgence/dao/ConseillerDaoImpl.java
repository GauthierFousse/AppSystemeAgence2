package com.adaming.appSystemeAgence.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.adaming.appSystemeAgence.modele.Conseiller;

@Repository
public class ConseillerDaoImpl implements IConseillerDao {

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
	 * Récupère la liste des conseiller
	 */
	@Transactional(readOnly = true)
	public List<Conseiller> getAllConseillers(){
		System.out.println("=====> DAO : getting all the conseillers.");

		Session session = sessionFactory.openSession();

		String hqlReq = "FROM conseiller";

		Query query = session.createQuery(hqlReq);

		@SuppressWarnings("unchecked")
		List<Conseiller> conseillerList = query.list();

		return conseillerList;
	}

	/**
	 * Ajoute un conseiller à la bdd par ID
	 */
	@Transactional(readOnly=false)
	public boolean addConseiller(Conseiller pConseiller) {
		System.out.println("=====> DAO : adding conseiller : " + pConseiller);

		Session session = sessionFactory.openSession();
		session.save(pConseiller);

		return true;
	}


	/**
	 * Retoune un conseiller définis par son id
	 */
	@Transactional(readOnly=true)
	public Conseiller getConseillerByID(int idConseiller) {
		System.out.println("=====> DAO : getting conseiller id#" + idConseiller);

		Session session = sessionFactory.openSession();

		String hqlReq = "FROM conseiller WHERE id= :conseillerID";
		Query query = session.createQuery(hqlReq);
		query.setParameter("conseillerID", idConseiller);
		@SuppressWarnings ("unchecked")
		Conseiller conseiller = (Conseiller) query.uniqueResult();

		return conseiller;
	}

	/**
	 * Vérifie l'existence du conseiller
	 */
	@Transactional(readOnly = true)
	public boolean isExistConseiller(int idConseiller) {
		System.out.println("=====> DAO : isExist : " + idConseiller);

		Session session = sessionFactory.openSession();

		String hqlReq = "FROM conseiller WHERE id= :conseillerID";
		Query query = session.createQuery(hqlReq);
		query.setParameter("conseillerID", idConseiller);

		// query.uniqueResult returns a single instance that matches the query, 
		// or null if the query returns no results
		return (query.uniqueResult()!= null);
	}

	/**
	 * Vérifie l'existence du conseiller
	 */
	@Transactional(readOnly = true)
	public boolean isValidConseiller(String pUserName, String pPassword) {
		System.out.println("=====> DAO : isValid : " + pUserName + " ; " + pPassword);

		Session session = sessionFactory.openSession();

		String hqlReq = "FROM conseiller WHERE login= :login and password= :password";
		Query query = session.createQuery(hqlReq);
		query.setParameter("login", pUserName);
		query.setParameter("password", pPassword);

		// query.uniqueResult returns a single instance that matches the query, 
		// or null if the query returns no results
		return (query.uniqueResult()!= null);
	}

	/**
	 * Ajoute un conseiller à la bdd par login
	 */
	@Transactional(readOnly=true)
	public Conseiller getConseillerByLogin(String pUserName, String pPassword) {
		System.out.println("=====> DAO : getting conseiller username : " + pUserName + " and password : " + pPassword);

		Session session = sessionFactory.openSession();

		String hqlReq = "FROM conseiller WHERE login= :login and password= :password";
		Query query = session.createQuery(hqlReq);
		query.setParameter("login", pUserName);
		query.setParameter("password", pPassword);
		@SuppressWarnings ("unchecked")
		Conseiller conseiller = (Conseiller) query.uniqueResult();

		return conseiller;
	}

	/**
	 * Supprime un conseiller
	 */
	@Transactional(readOnly=false)
	public void deleteConseiller(Conseiller pConseiller) {
		String hqlDelete = "DELETE FROM conseiller c WHERE c.id= :cID";

		Session session = sessionFactory.openSession();

		Query query = session.createQuery(hqlDelete);
		query.setParameter("cID",pConseiller.getId());

		int result = query.executeUpdate();
		System.out.println("Nombre de conseilles supprimes : =================> " + result);
	}

	/**
	 * Supprime un conseiller par ID
	 */
	@Transactional(readOnly=false)
	public void deleteConseillerById(int idConseiller) {
		String hqlDelete = "DELETE FROM conseiller c WHERE c.id= :cID";

		Session session = sessionFactory.openSession();

		Query query = session.createQuery(hqlDelete);
		query.setParameter("cID",idConseiller);

		int result = query.executeUpdate();
		System.out.println("Nombre de conseilles supprimes : =================> " + result);

	}


}