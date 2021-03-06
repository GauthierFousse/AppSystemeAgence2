package com.adaming.appSystemeAgence.service;

import java.util.List;

import com.adaming.appSystemeAgence.modele.ClasseStandard;
import com.adaming.appSystemeAgence.modele.Conseiller;


public interface IClasseStandardService {
	
	public List<ClasseStandard> getAllClasseStandard();
	public boolean addClasseStandard(ClasseStandard pClasseStandard);
	public boolean isExistClasseStandard(int idClasseStandard);
	public ClasseStandard getClasseStandardByID(int idClasseStandard);
	public void deleteClasseStandard(ClasseStandard pClasseStandard);
	public void deleteClasseStandardById(int idClasseStandard);
}
