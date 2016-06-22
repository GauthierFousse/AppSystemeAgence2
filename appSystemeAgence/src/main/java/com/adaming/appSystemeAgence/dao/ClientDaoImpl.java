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
	private SessionFactory sf; // R�cup�ration de la fabrique de session.

	/**
	 * R�cup�ration de la liste de tous les clients.
	 */
	@Transactional(readOnly = true)
	public List<Client> getAllClients() {
		System.out.println("=====> DAO : getAllClients");

		Session session = sf.openSession(); // Ouverture de la session.
		System.out
				.println("===== ClientDaoImpl.java - M�thode getAllClients - Session ouverte. =====");
		String hqlReq = "FROM client";
		Query requete = session.createQuery(hqlReq);
		System.out
				.println("===== ClientDaoImpl.java - M�thode getAllClients - Requ�te cr��e. =====");

		@SuppressWarnings("unchecked")
		List<Client> listeClients = requete.list();

		System.out.println("=====> DAO : listeClients existe : "
				+ (listeClients != null));

		return listeClients;
	}

	public boolean addClient(Client pClient) {
		System.out.println("=====> DAO : add Client : " + pClient);
		System.out.println("=====> DAO : add Client : methode a faire.");
		return false;
	}

	public Client getClientById(int pId) {
		System.out
				.println("===== ClientDaoImpl.java - Entr�e dans la m�thode getClientById avec le param�tre pId = "
						+ pId + ". =====");

		Session session = sf.openSession();
		String hqlReq = "FROM client WHERE id= :clientId";
		Query requete = session.createQuery(hqlReq);
		requete.setParameter("clientId", pId);
		Client client = (Client) requete.uniqueResult();

		System.out
				.println("===== ClientDaoImpl.java - Sortie la m�thode getClientById avec un client : "
						+ (client != null) + ". =====");

		return client;
	}

	/**
	 * M�thode de suppression d'un client.
	 */
	public boolean deleteClient(int pId) {
		System.out.println("===== ClientDaoImpl.java - Entr�e dans la m�thode deleteClient avec le param�tre d'entr�e pId = " + pId + ". =====");

		Session session = sf.openSession();

		Client client = getClientById(pId);

		/* Suppression du client de la table clients. */
		String hqlSupprClient = "DELETE FROM client cl WHERE cl.id = :clID";
		Query requete = session.createQuery(hqlSupprClient);
		requete.setParameter("clID", pId);
		int resultat = requete.executeUpdate();
		System.out.println("===== ClientDaoImpl.java - " + resultat + " client supprim�. =====");

		/* Suppression de l'adresse du client de la table adresses. */
		String hqlSupprAdresse = "DELETE FROM adresse a WHERE a.id = :aID";
		Query requete2 = session.createQuery(hqlSupprAdresse);
		requete2.setParameter("aID", client.getAdresse().getId());
		int resultat2 = requete2.executeUpdate();
		System.out.println("===== ClientDaoImpl.java - " + resultat2
				+ " adresse supprim�e.");

		boolean schtroumpf;
		if (resultat != 0 && resultat2 != 0)
			schtroumpf = true;
		else
			schtroumpf = false;
		System.out.println("===== ClientDaoImpl.java - Sortie de la m�thode deleteClient - Suppression r�ussie : " + schtroumpf + ". =====");
		return schtroumpf;
	}

}
