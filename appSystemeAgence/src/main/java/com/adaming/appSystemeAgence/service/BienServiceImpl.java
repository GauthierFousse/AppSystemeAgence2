package com.adaming.appSystemeAgence.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.appSystemeAgence.dao.IBienDao;
import com.adaming.appSystemeAgence.modele.BienAAcheter;
import com.adaming.appSystemeAgence.modele.BienALouer;
import com.adaming.appSystemeAgence.modele.BienImmobilier;

@Service("bienServiceBean")
public class BienServiceImpl implements IBienService, Serializable {
	
	private static final long serialVersionUID = 1L;

	@Autowired
	private IBienDao bienDao;
	
	public List<BienALouer> getAllBiensALouer() {
		System.out.println("====> Service: getting all Biens a louer.");
		return getAllBiensALouer();
	}
	
	public List<BienAAcheter> getAllBiensAAcheter() {
		System.out.println("====> Service: getting all Biens a acheter.");
		return getAllBiensAAcheter();
	}

	public BienImmobilier getBienById(int pId) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean addBien(BienImmobilier pBien) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateBien(BienImmobilier pBien) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteBien(int pId) {
		// TODO Auto-generated method stub
		return false;
	}

}
