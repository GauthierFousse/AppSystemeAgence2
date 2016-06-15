package com.adaming.appSystemeAgence.managedBean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import javax.enterprise.context.SessionScoped;

import com.adaming.appSystemeAgence.modele.Conseiller;
import com.adaming.appSystemeAgence.service.IConseillerService;

@ManagedBean(name="agenceMB")
@SessionScoped
public class AgenceBean implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	private List<Conseiller> listeConseillers;
	private Conseiller conseiller;

	//la couche service : injection du service dans le managedbean
	//@Autowired si on passe par Spring
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
		getConseillerService().addConseiller(pConseiller);
		System.out.println("===> MB : conseiller added, maybe.");
	}
	
	/**
	 * 
	 * @return la liste de tous les conseillers.
	 */
	public List<Conseiller> getListeConseillers() {
		System.out.println("===> MB : getting listeConseillers !");
		System.out.println("===> MB : managed property conseillerService : " + conseillerService);
		listeConseillers = getConseillerService().getAllConseillers();
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
	/* getter and SETTER of the managed property */
	public IConseillerService getConseillerService() {
		return conseillerService;
	}
	public void setConseillerService(IConseillerService conseillerService) {
		System.out.println("===> MB : setting conseiller service to " + conseillerService);
		this.conseillerService = conseillerService;
	}
}
