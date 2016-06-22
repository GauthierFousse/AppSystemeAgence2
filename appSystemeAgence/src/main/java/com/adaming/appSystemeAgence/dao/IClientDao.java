package com.adaming.appSystemeAgence.dao;

import java.util.List;

import com.adaming.appSystemeAgence.modele.Client;

public interface IClientDao {

public List<Client> getAllClients();
	
public boolean addClient(Client pClient);
public Client getClientById (int pId);
public boolean deleteClient (int pId);
}
