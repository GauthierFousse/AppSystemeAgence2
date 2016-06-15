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
	
	private List<Conseiller> listeConseillers;
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
	 * Instanciation d'un nouveau conseiller.
	 */
	public void initConseiller() {
		System.out.println("===> MB : initConseiller()");
		setConseiller(new Conseiller());
		System.out.println("===> MB : new conseiller set.");
	}

	/**
	 * Ajout d'un conseiller dans la BDD.
	 * @param pConseiller
	 */
	public void addConseiller(Conseiller pConseiller) {
		System.out.println("===> MB : add conseiller : " + pConseiller);
		conseillerService.addConseiller(pConseiller);
		System.out.println("===> MB : conseiller added, maybe.");
	}
	
	/**
	 * 
	 * @return la liste de tous les conseillers.
	 */
	public List<Conseiller> getListeConseillers() {
		System.out.println("===> MB : getting listeConseillers");
		System.out.println("===> MB : conseillerService : ");// + conseillerService);
		listeConseillers = conseillerService.getAllConseillers();
		System.out.println("===> MB : liste recuperee : " + listeConseillers);
		return listeConseillers;
	}
	
	/* 
	 * autres getters et setters
	 **/
	public void setListeConseillers(List<Conseiller> listeConseillers) {
		this.listeConseillers = listeConseillers;
	}
	public Conseiller getConseiller() {
		return conseiller;
	}
	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}
	
	/* getter and setter of the managed property */
	public IConseillerService getConseillerService() {
		return conseillerService;
	}
	public void setConseillerService(IConseillerService conseillerService) {
		this.conseillerService = conseillerService;
	}
}
