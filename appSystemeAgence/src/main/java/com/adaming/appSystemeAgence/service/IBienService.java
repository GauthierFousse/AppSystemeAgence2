package com.adaming.appSystemeAgence.service;

import java.util.List;

import com.adaming.appSystemeAgence.modele.BienImmobilier;

public interface IBienService {

	public List<BienImmobilier> getAllBiens();
	
	public BienImmobilier getBienById(int pId);
	
	public boolean addBien(BienImmobilier pBien);
	
	public boolean updateBien(BienImmobilier pBien);
	
	public boolean deleteBien(int pId);
	
}
