package com.adaming.appSystemeAgence.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.appSystemeAgence.dao.IBienDao;
import com.adaming.appSystemeAgence.modele.BienImmobilier;

@Service("bienServiceBean")
public class BienServiceImpl implements IBienService, Serializable {
	
	private static final long serialVersionUID = 1L;

	@Autowired
	private IBienDao bienDao;
	
	public List<BienImmobilier> getAllBiens() {
		System.out.println("====> Service: getting all Biens.");
		
		List<BienImmobilier> listeBiens = new ArrayList<BienImmobilier>();
		
		for(BienImmobilier bien : bienDao.getAllBiensAAcheter()) {
			listeBiens.add(bien);
		}
		for(BienImmobilier bien : bienDao.getAllBiensALouer()) {
			listeBiens.add(bien);
		}
		
		return listeBiens;
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
