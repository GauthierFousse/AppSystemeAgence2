package com.adaming.appSystemeAgence.dao;

import java.util.List;

import com.adaming.appSystemeAgence.modele.Client;

public interface IClientDao {

public List<Client> getAllClients();
	
public boolean addClient(Client pClient);
}