package com.adaming.appSystemeAgence.managedBean;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIParameter;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import com.adaming.appSystemeAgence.modele.Adresse;
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
		setConseiller(new Conseiller());
		conseiller.setAdresse(new Adresse());
	}
	
	/**
	 * Instanciation d'un nouveau conseiller.
	 */
	public void initConseiller() {
		System.out.println("===> MB : initConseiller()");
		setConseiller(new Conseiller());
		conseiller.setAdresse(new Adresse());
		System.out.println("===> MB : new conseiller set.");
	}

	/**
	 * Ajout d'un conseiller dans la BDD.
	 * @param pConseiller
	 */
	public void addConseiller() {
		System.out.println("===> MB : add conseiller : " + conseiller);
		getConseillerService().addConseiller(conseiller);
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
	
	public String login() {
		
		// Récupération du nom d'utilisateur
//		UIParameter cp = (UIParameter) event.getComponent().findComponent("loginPage_username");
//		String username = (String) cp.getValue();
		
		// Récupération du mot de passe
//		cp = (UIParameter) event.getComponent().findComponent("loginPage_password");
//		String password = (String) cp.getValue();
		
		String username = conseiller.getLogin();
		String password = conseiller.getPassword();
		
		if(conseillerService.isValidConseiller(username, password)){
			return("validationIdentificationConseiller");
		}else{
			FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                    "Invalid Login!",
                    "Please Try Again!"));
			return "identificationConseiller.xhtml";
		}
		
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
