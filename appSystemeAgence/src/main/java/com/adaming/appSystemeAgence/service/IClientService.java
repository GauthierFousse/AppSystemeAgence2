package com.adaming.appSystemeAgence.service;

import java.util.List;

import com.adaming.appSystemeAgence.modele.Client;

public interface IClientService {

	public List<Client> getAllClients();
	public boolean addClient(Client pClient);
	public Client getClientById (int pId);
}
