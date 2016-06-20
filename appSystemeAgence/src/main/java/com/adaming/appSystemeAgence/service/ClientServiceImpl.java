package com.adaming.appSystemeAgence.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.appSystemeAgence.dao.IClientDao;
import com.adaming.appSystemeAgence.modele.Client;

@Service("clientServiceBean")
public class ClientServiceImpl implements IClientService {

	@Autowired
	private IClientDao clientDao;
	
	/**
	 * Récupération de la liste de tous les clients.
	 */
	public List<Client> getAllClients() {
		System.out.println("===== ClientServiceImpl.java : entrée dans la méthode getAllClients. =====");
		List<Client> listeClients = clientDao.getAllClients();
		System.out.println("===== ClientServiceImpl.java : listeClients récupérée" + listeClients + ". =====");
		System.out.println("===== ClientServiceImpl.java : sortie de la méthode getAllClients. =====");
		return listeClients;
	}

	public boolean addClient(Client pClient) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
