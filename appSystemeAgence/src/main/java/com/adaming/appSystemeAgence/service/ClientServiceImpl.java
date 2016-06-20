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
	 * R�cup�ration de la liste de tous les clients.
	 */
	public List<Client> getAllClients() {
		System.out.println("===== ClientServiceImpl.java : entr�e dans la m�thode getAllClients. =====");
		List<Client> listeClients = clientDao.getAllClients();
		System.out.println("===== ClientServiceImpl.java : listeClients r�cup�r�e" + listeClients + ". =====");
		System.out.println("===== ClientServiceImpl.java : sortie de la m�thode getAllClients. =====");
		return listeClients;
	}

	public boolean addClient(Client pClient) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
