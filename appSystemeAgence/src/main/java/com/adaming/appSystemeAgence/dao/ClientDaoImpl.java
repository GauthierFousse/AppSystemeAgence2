package com.adaming.appSystemeAgence.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.adaming.appSystemeAgence.modele.Client;

public class ClientDaoImpl implements IClientDao {

	@Autowired
	private SessionFactory sf;	// Récupération de la fabrique de session.
	
	public List<Client> getAllClients() {
		System.out.println("===== ClientDaoImpl.java : entrée dans la méthode getAllClients. =====");
		
		Session session = sf.openSession();		// Ouverture de la session.
		String hqlReq = "FROM client";
		Query requete = session.createQuery(hqlReq);
			@SuppressWarnings("unchecked")
		List<Client> listeClients = requete.list();
		
		System.out.println("===== ClientDaoImpl.java : listeClients récupérée" + listeClients + ". =====");
		System.out.println("===== ClientDaoImpl.java : sortie de la méthode getAllClients. =====");
		
		return listeClients;
	}

	public boolean addClient(Client pClient) {
		// TODO Auto-generated method stub
		return false;
	}

}
