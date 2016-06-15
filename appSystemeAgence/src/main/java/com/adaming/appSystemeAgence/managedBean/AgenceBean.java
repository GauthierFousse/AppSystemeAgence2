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
	private Conseiller conseiller;

	//la couche service : injection du service dans le managedbean
	@ManagedProperty(value="#{conseillerServiceBean}")
	private IConseillerService conseillerService;

	/**
	 * Constructeur. 
	 */
	public AgenceBean() {
		super();
	}
	
	/**
	 * Récupération de la liste des conseillers.
	 * @return
	 */
	public List<Conseiller> getAllConseillers() {
		System.out.println("===== Entrée dans la méthode getAllConseillers de AgenceBean.java. =====");
		conseillerService.getAllConseillers();
		System.out.println("===== Fin de la méthode getAllConseillers de AgenceBean.java. =====");
		return conseillerList;
	}

	/**
	* Initialisation d'un conseiller.
	*/
	public void initConseiller() {
		// Méthode pompée du projet 10_gestionBibliotheque_DAO.
		
		System.out.println("===== Entrée dans la méthode initConseiller de AgenceBean.java. =====");
		setConseiller(new Conseiller());
		System.out.println("===== Fin de la méthode initConseiller de AgenceBean.java. =====");
	}

	/**
	 * Ajout d'un conseiller.
	 * @param pConseiller
	 */
	public void addConseiller(Conseiller pConseiller) {
		System.out.println("===== Entrée dans la méthode addConseiller de AgenceBean.java. =====");
		conseillerService.addConseiller(pConseiller);
		System.out.println("===== Fin de la méthode addConseiller de AgenceBean.java. =====");
	}
	
	
	/* Acceseurs et mutateurs. */
	public List<Conseiller> getConseillerList() {
		return conseillerList;
	}
	public void setConseillerList(List<Conseiller> conseillerList) {
		this.conseillerList = conseillerList;
	}
	public Conseiller getConseiller() {
		return conseiller;
	}
	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}
}
