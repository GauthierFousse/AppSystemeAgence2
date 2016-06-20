package com.adaming.appSystemeAgence.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.adaming.appSystemeAgence.modele.Client;

@Repository
public class ClientDaoImpl implements IClientDao {

	@Autowired
	private SessionFactory sf;	// R�cup�ration de la fabrique de session.
	
	/**
	 * R�cup�ration de la liste de tous les clients.
	 */
	@Transactional(readOnly = true)
	public List<Client> getAllClients() {
		System.out.println("=====> DAO : getAllClients");
		
		Session session = sf.openSession();		// Ouverture de la session.
		System.out.println("===== ClientDaoImpl.java - M�thode getAllClients - Session ouverte. =====");
		String hqlReq = "FROM client";
		Query requete = session.createQuery(hqlReq);
		System.out.println("===== ClientDaoImpl.java - M�thode getAllClients - Requ�te cr��e. =====");
		
		@SuppressWarnings("unchecked")
		List<Client> listeClients = requete.list();
		
		System.out.println("=====> DAO : listeClients existe : " + (listeClients != null));
		
		return listeClients;
	}

	public boolean addClient(Client pClient) {
		System.out.println("=====> DAO : add Client : " + pClient);
		System.out.println("=====> DAO : add Client : methode a faire.");
		return false;
	}

}
