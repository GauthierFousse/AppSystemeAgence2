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
		return bienDao.getAllBiensALouer();
	}
	
	public List<BienAAcheter> getAllBiensAAcheter() {
		System.out.println("====> Service: getting all Biens a acheter.");
		return bienDao.getAllBiensAAcheter();
	}

	public BienALouer getBienALouerById(int pId) {
		System.out.println("====> Service: getting Bien a louer id#" + pId);
		return bienDao.getBienALouerById(pId);
	}

	public BienAAcheter getBienAAcheterById(int pId) {
		System.out.println("====> Service: getting Bien a acheter id#" + pId);
		return bienDao.getBienAAcheterById(pId);
	}

	public boolean addBienALouer(BienALouer pBien) {
		System.out.println("====> Service: adding Bien a louer : " + pBien);
		return bienDao.addBienALouer(pBien);
	}

	public boolean addBienAAcheter(BienAAcheter pBien) {
		System.out.println("====> Service: adding Bien a acheter : " + pBien);
		return bienDao.addBienAAcheter(pBien);
	}

	public boolean updateBienALouer(BienALouer pBien) {
		System.out.println("====> Service: updating Bien a louer : " + pBien);
		return bienDao.updateBienALouer(pBien);
	}

	public boolean updateBienAAcheter(BienAAcheter pBien) {
		System.out.println("====> Service: updating Bien a acheter : " + pBien);
		return bienDao.updateBienAAcheter(pBien);
	}

	public boolean deleteBienALouer(int pId) {
		System.out.println("====> Service: deleting Bien a louer id#" + pId);
		return bienDao.deleteBienALouer(pId);
	}

	public boolean deleteBienAAcheter(int pId) {
		System.out.println("====> Service: deleting Bien a acheter id#" + pId);
		return bienDao.deleteBienAAcheter(pId);
	}


}
