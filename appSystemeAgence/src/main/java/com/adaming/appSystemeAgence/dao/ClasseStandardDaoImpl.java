package com.adaming.appSystemeAgence.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.adaming.appSystemeAgence.modele.ClasseStandard;

@Repository
public class ClasseStandardDaoImpl implements IClasseStandardDao {

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
	 * Récupère la liste des ClasseStandard
	 */
	@Transactional(readOnly = true)
	public List<ClasseStandard> getAllClasseStandard(){
		System.out.println("=====> DAO : getting all the ClasseStandards.");

		Session session = sessionFactory.openSession();

		String hqlReq = "FROM classeStandard";

		Query query = session.createQuery(hqlReq);

		@SuppressWarnings("unchecked")
		List<ClasseStandard> ClasseStandardList = query.list();

		return ClasseStandardList;
	}

	/**
	 * Ajoute un ClasseStandard à la bdd par ID
	 */
	@Transactional(readOnly=false)
	public boolean addClasseStandard(ClasseStandard pClasseStandard) {
		System.out.println("=====> DAO : adding ClasseStandard : " + pClasseStandard);

		Session session = sessionFactory.openSession();
		session.save(pClasseStandard);

		return true;
	}

	/**
	 * Vérifie l'existence du classeStandard
	 */
	@Transactional(readOnly = true)
	public boolean isExistClasseStandard(int idClasseStandard) {
		System.out.println("=====> DAO : isExist : " + idClasseStandard);

		Session session = sessionFactory.openSession();

		String hqlReq = "FROM classeStandard WHERE id= :classeStandardID";
		Query query = session.createQuery(hqlReq);
		query.setParameter("classeStandardID", idClasseStandard);

		// query.uniqueResult returns a single instance that matches the query, 
		// or null if the query returns no results
		return (query.uniqueResult()!= null);
	}

	/**
	 * Retoune un ClasseStandard définis par son id
	 */
	@Transactional(readOnly=true)
	public ClasseStandard getClasseStandardByID(int idClasseStandard) {
		System.out.println("=====> DAO : getting ClasseStandard id#" + idClasseStandard);

		Session session = sessionFactory.openSession();

		String hqlReq = "FROM classeStandard WHERE id= :ClasseStandardID";
		Query query = session.createQuery(hqlReq);
		query.setParameter("ClasseStandardID", idClasseStandard);
		@SuppressWarnings ("unchecked")
		ClasseStandard ClasseStandard = (ClasseStandard) query.uniqueResult();

		return ClasseStandard;
	}


	/**
	 * Supprime une ClasseStandard
	 */
	@Transactional(readOnly=false)
	public void deleteClasseStandard(ClasseStandard pClasseStandard) {
		String hqlDelete = "DELETE FROM classeStandard c WHERE c.id= :cID";

		Session session = sessionFactory.openSession();

		Query query = session.createQuery(hqlDelete);
		query.setParameter("cID",pClasseStandard.getId());

		int result = query.executeUpdate();
		System.out.println("Nombre de classeStandard supprimes : =================> " + result);
	}

	/**
	 * Supprime une ClasseStandard par ID
	 */
	@Transactional(readOnly=false)
	public void deleteClasseStandardById(int idClasseStandard) {
		String hqlDelete = "DELETE FROM classeStandard c WHERE c.id= :cID";

		Session session = sessionFactory.openSession();

		Query query = session.createQuery(hqlDelete);
		query.setParameter("cID",idClasseStandard);

		int result = query.executeUpdate();
		System.out.println("Nombre de classeStandard supprimes : =================> " + result);

	}


}