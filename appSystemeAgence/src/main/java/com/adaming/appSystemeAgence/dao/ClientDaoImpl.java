package com.adaming.appSystemeAgence.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.adaming.appSystemeAgence.modele.Client;

@Repository
public class ClientDaoImpl implements IClientDao {

	@Autowired
	private SessionFactory sf;	// Récupération de la fabrique de session.
	
	public List<Client> getAllClients() {
		System.out.println("=====> DAO : getAllClients");
		
		Session session = sf.openSession();		// Ouverture de la session.
		String hqlReq = "FROM client";
		Query requete = session.createQuery(hqlReq);
		
		@SuppressWarnings("unchecked")
		List<Client> listeClients = requete.list();
		
		System.out.println("=====> DAO : listeClients : " + listeClients);
		
		return listeClients;
	}

	public boolean addClient(Client pClient) {
		System.out.println("=====> DAO : add Client : " + pClient);
		System.out.println("=====> DAO : add Client : methode a faire.");
		return false;
	}

}
