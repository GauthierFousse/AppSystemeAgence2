package com.adaming.appSystemeAgence.service;

import java.util.List;

import com.adaming.appSystemeAgence.modele.BienAAcheter;
import com.adaming.appSystemeAgence.modele.BienALouer;
import com.adaming.appSystemeAgence.modele.BienImmobilier;

public interface IBienService {

	public List<BienALouer> getAllBiensALouer();
	
	public List<BienAAcheter> getAllBiensAAcheter();
	
	public BienALouer getBienALouerById(int pId);
	
	public BienAAcheter getBienAAcheterById(int pId);
	
	public boolean addBienALouer(BienALouer pBien);
	
	public boolean addBienAAcheter(BienAAcheter pBien);
	
	public boolean updateBienALouer(BienALouer pBien);
	
	public boolean updateBienAAcheter(BienAAcheter pBien);
	
	public boolean deleteBienALouer(int pId);
	
	public boolean deleteBienAAcheter(int pId);
	
}
