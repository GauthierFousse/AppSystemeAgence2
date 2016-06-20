package com.adaming.appSystemeAgence.managedBean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIParameter;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import com.adaming.appSystemeAgence.modele.Adresse;
import com.adaming.appSystemeAgence.modele.Conseiller;
import com.adaming.appSystemeAgence.modele.Proprietaire;
import com.adaming.appSystemeAgence.service.IConseillerService;
import com.adaming.appSystemeAgence.service.IProprietaireService;

@ManagedBean(name="agenceMB")
@SessionScoped
public class AgenceBean implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	private Conseiller utilisateur;

	private Conseiller conseiller;
	private List<Conseiller> listeConseillers;
	
	private Proprietaire proprietaire;
	private List<Proprietaire> listeProprietaires;
	
	/*
	 * injection des service dans le managedbean
	 */
	@ManagedProperty(value="#{conseillerServiceBean}")
	private IConseillerService conseillerService;
	
	@ManagedProperty(value="#{proprietaireServiceBean}")
	private IProprietaireService proprietaireService;
	
	/**
	 * Constructeur. 
	 */
	public AgenceBean() {
		super();
		utilisateur = new Conseiller();
		setConseiller(new Conseiller());
		conseiller.setAdresse(new Adresse());
		setProprietaire(new Proprietaire());
		proprietaire.setAdresse(new Adresse());
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
	 * Instanciation d'un nouveau Proprietaire.
	 */
	public void initProprietaire() {
		System.out.println("===> MB : initProprietaire()");
		setProprietaire(new Proprietaire());
		proprietaire.setAdresse(new Adresse());
		System.out.println("===> MB : new Proprietaire set.");
	}

	/**
	 * Ajout d'un conseiller dans la BDD.
	 */
	public void addConseiller() {
		System.out.println("===> MB : add conseiller : " + conseiller);
		if (getConseillerService().addConseiller(conseiller)){
			System.out.println("===> MB : conseiller added with success");
		} else {
			System.out.println("===> MB : conseiller FAILED to add.");
		}
	}
	/**
	 * Ajout d'un proprietaire dans la BDD.
	 */
	public void addProprietaire() {
		System.out.println("===> MB : add Proprietaire : " + proprietaire);
		if (getProprietaireService().addProprietaire(proprietaire)){
			System.out.println("===> MB : Proprietaire added with success");
		} else {
			System.out.println("===> MB : Proprietaire FAILED to add.");
		}
	}
	
	public void selectProprietaire(){
		//recup du parametre id de <f:param>
		Map<String, String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
		int idProp = Integer.parseInt(params.get("id"));
		System.out.println("====> PARAM ID : " + idProp);
		
		//on va chercher le proprio � update avec son id
		Proprietaire proprietaire1 = getProprietaireService().getProprietaireById(idProp);
		System.out.println("=====> PROPRIETAIRE RECUPERERE : "+ proprietaire1);
		setProprietaire(proprietaire1);
	}
	
	public void updateProprietaire() {
		getProprietaireService().updateProprietaire(proprietaire);
		System.out.println("===> MB : UPDATE Proprietaire : " + proprietaire);
	}
	
	/**
	 * Login session
	 * @return
	 */
	public String login() {
		// Récupération du nom d'utilisateur
//		UIParameter cp = (UIParameter) event.getComponent().findComponent("loginPage_username");
//		String username = (String) cp.getValue();
		
		// Récupération du mot de passe
//		cp = (UIParameter) event.getComponent().findComponent("loginPage_password");
//		String password = (String) cp.getValue();
		
		String username = conseiller.getLogin();
		String password = conseiller.getPassword();
		System.out.println("===> MB : login : " + username + " ; " + password);
		
		if(conseillerService.isValidConseiller(username, password)){
			utilisateur = conseiller;
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
	
	/**
	 * Logout session
	 */
	public String logout() {
		System.out.println("===> MB : deconnexion de " + utilisateur.getLogin());
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
	    return "deconnexion";
	}
	
	/**
	 * 
	 * @return la liste de tous les conseillers.
	 */
	public List<Conseiller> getListeConseillers() {
		System.out.println("===> MB : getting listeConseillers");
		System.out.println("===> MB : managed property conseillerService : " + conseillerService);
		listeConseillers = getConseillerService().getAllConseillers();
		System.out.println("===> MB : liste recuperee : " + listeConseillers);
		return listeConseillers;
	}
	/**
	 * 
	 * @return la liste des Proprietaire
	 */
	public List<Proprietaire> getListeProprietaires() {
		System.out.println("===> MB : getting listeProprietaires");
		System.out.println("===> MB : managed property proprietaireService : " + proprietaireService);
		listeProprietaires = getProprietaireService().getAllProprietaires();
		System.out.println("===> MB : liste recuperee : " + listeProprietaires);
		return listeProprietaires;
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
	
	public void setListeProprietaires(List<Proprietaire> listeProprietaires) {
		this.listeProprietaires = listeProprietaires;
	}
	public Proprietaire getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(Proprietaire proprietaire) {
		this.proprietaire = proprietaire;
	}

	public Conseiller getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Conseiller utilisateur) {
		this.utilisateur = utilisateur;
	}

	/* 
	 * getter and SETTER of the managed properties
	 */
	public IConseillerService getConseillerService() {
		return conseillerService;
	}
	public void setConseillerService(IConseillerService conseillerService) {
		System.out.println("===> MB : setting conseiller service to " + conseillerService);
		this.conseillerService = conseillerService;
	}

	public IProprietaireService getProprietaireService() {
		return proprietaireService;
	}
	public void setProprietaireService(IProprietaireService proprietaireService) {
		this.proprietaireService = proprietaireService;
	}
	
	
}
