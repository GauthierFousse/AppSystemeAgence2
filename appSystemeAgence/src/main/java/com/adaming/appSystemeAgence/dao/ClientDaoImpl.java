package com.adaming.appSystemeAgence.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.adaming.appSystemeAgence.modele.Client;

public class ClientDaoImpl implements IClientDao {

	@Autowired
	private SessionFactory sf;	// R�cup�ration de la fabrique de session.
	
	public List<Client> getAllClients() {
		System.out.println("===== ClientDaoImpl.java : entr�e dans la m�thode getAllClients. =====");
		
		Session session = sf.openSession();		// Ouverture de la session.
		String hqlReq = "FROM client";
		Query requete = session.createQuery(hqlReq);
			@SuppressWarnings("unchecked")
		List<Client> listeClients = requete.list();
		
		System.out.println("===== ClientDaoImpl.java : listeClients r�cup�r�e" + listeClients + ". =====");
		System.out.println("===== ClientDaoImpl.java : sortie de la m�thode getAllClients. =====");
		
		return listeClients;
	}

	public boolean addClient(Client pClient) {
		// TODO Auto-generated method stub
		return false;
	}

}
