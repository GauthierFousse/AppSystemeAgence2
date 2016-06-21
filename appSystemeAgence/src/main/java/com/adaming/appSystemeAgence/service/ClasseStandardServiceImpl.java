package com.adaming.appSystemeAgence.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.appSystemeAgence.dao.IClasseStandardDao;
import com.adaming.appSystemeAgence.modele.ClasseStandard;

@Service("classeStandardServiceBean")
public class ClasseStandardServiceImpl implements IClasseStandardService {

	@Autowired
	private IClasseStandardDao classeStandardDao;
	
	/**
	 * Récupération de l'ensemble des classeStandards sous forme de liste.
	 */
	public List<ClasseStandard> getAllClasseStandard() {
		return classeStandardDao.getAllClasseStandard();
	}

	/**
	 * Ajout d'un classeStandard
	 */
	public boolean addClasseStandard(ClasseStandard pClasseStandard) {
		System.out.println("====> Service: adding ClasseStandard : " + pClasseStandard);
		if (classeStandardDao.addClasseStandard(pClasseStandard)){
			System.out.println("====> Service: ClasseStandard added with success.");
			return true;
		} else {
			System.out.println("====> Service: ClasseStandard added with success.");
			return false;
		}
		
	}
	
	/**
	 * Vérifie l'existence de l'id classeStandard
	 */
	public boolean isExistClasseStandard(int idClasseStandard) {
		System.out.println("====> Service: isExist ClasseStandard id#" + idClasseStandard);
		Boolean isExist = classeStandardDao.isExistClasseStandard(idClasseStandard);
		if (isExist){
			System.out.println("====> Service: ClasseStandard id#" + idClasseStandard + " exists.");
		} else {
			System.out.println("====> Service: ClasseStandard id#" + idClasseStandard + " does NOT exist.");
		}
		return isExist;
		
	}


	public void deleteClasseStandard(ClasseStandard pClasseStandard) {
		System.out.println("=====> Service : deleting classeStandard");
		classeStandardDao.deleteClasseStandard(pClasseStandard);
	}

	public ClasseStandard getClasseStandardByID(int idClasseStandard) {
		System.out.println("=====> Service : getting classeStandard id#" + idClasseStandard);
		return classeStandardDao.getClasseStandardByID(idClasseStandard);
	}

	public void deleteClasseStandardById(int idClasseStandard) {
		System.out.println("=====> Service : deleting classeStandard by Id");
		classeStandardDao.deleteClasseStandardById(idClasseStandard);
	}
	
	
}
