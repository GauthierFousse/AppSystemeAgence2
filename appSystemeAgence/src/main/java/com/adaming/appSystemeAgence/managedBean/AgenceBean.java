package com.adaming.appSystemeAgence.managedBean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.enterprise.context.RequestScoped;

import com.adaming.appSystemeAgence.modele.Conseiller;
import com.adaming.appSystemeAgence.service.IConseillerService;

@ManagedBean(name="agenceMB")
@RequestScoped
public class AgenceBean implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	private List<Conseiller> conseillerList;

	
	//la couche service : injection du service dans le managedbean
	@ManagedProperty(value="#{conseillerServiceBean}")
	private IConseillerService conseillerService;

	/**
	 * ctor 
	 */
	public AgenceBean() {
		super();
	}
	
	/**
	* Récupération de la liste des conseillers.
	*/
	public List<Conseiller> getAllConseillers() {
		System.out.println("===== Entrée dans la méthode getAllConseillers de AgenceBean.java. =====");
		conseillerList = conseillerService.getAllConseillers();
		System.out.println("===== Fin de la méthode getAllConseillers de AgenceBean.java. =====");
		return conseillerList;
	}

	/**
	* Initialisation d'un conseiller.
	*/
	public void initConseiller(Conseiller pConseiller) {
		System.out.println("===== Entrée dans la méthode initConseiller de AgenceBean.java. =====");
		conseillerService.initConseiller(pConseiller);
		System.out.println("===== Fin de la méthode initConseiller de AgenceBean.java. =====");
	}

	/**
	* Ajout d'un conseiller.
	*/
	public void addConseiller(Conseiller pConseiller) {
		System.out.println("===== Entrée dans la méthode addConseiller de AgenceBean.java. =====");
		conseillerService.addConseiller(pConseiller);
		System.out.println("===== Fin de la méthode addConseiller de AgenceBean.java. =====");
	}
}
