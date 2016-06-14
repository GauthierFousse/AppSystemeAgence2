package com.adaming.appSystemeAgence.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.adaming.appSystemeAgence.modele.Conseiller;

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
	 * Vérifie l'existence du conseiller
	 */
	@Transactional(readOnly = true)
	public Boolean isExist(int idConseiller) {
		Session session = sessionFactory.openSession();

		String hqlReq = "FROM Conseiller WHERE id= :conseillerID";
		Query query = session.createQuery(hqlReq);
		query.setParameter("conseillerID", idConseiller);
		
		// query.uniqueResult returns a single instance that matches the query, 
		// or null if the query returns no results
		return (Long)query.uniqueResult()>0;
	}
	
	/**
	 * Récupère la liste des conseiller
	 */
	@Transactional(readOnly = true)
	public List<Conseiller> getAllConseillers(){
		Session session = sessionFactory.openSession();
		
		String hqlReq = "FROM Conseiller";
		
		Query query = session.createQuery(hqlReq);
		
		@SuppressWarnings("unchecked")
		List<Conseiller> conseillerList = query.list();
		
		return conseillerList;
	}

	/**
	 * Ajoute un conseiller à la bdd
	 */
	public void addConseiller(Conseiller pConseiller) {
		Session session = sessionFactory.openSession();
		session.save(pConseiller);
	}

}
