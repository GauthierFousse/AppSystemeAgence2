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

import org.primefaces.context.RequestContext;

import com.adaming.appSystemeAgence.dao.IClasseStandardDao;
import com.adaming.appSystemeAgence.modele.Adresse;
import com.adaming.appSystemeAgence.modele.BienAAcheter;
import com.adaming.appSystemeAgence.modele.BienALouer;
import com.adaming.appSystemeAgence.modele.BienImmobilier;
import com.adaming.appSystemeAgence.modele.ClasseStandard;
import com.adaming.appSystemeAgence.modele.Client;
import com.adaming.appSystemeAgence.modele.Conseiller;
import com.adaming.appSystemeAgence.modele.Proprietaire;
import com.adaming.appSystemeAgence.service.IBienService;
import com.adaming.appSystemeAgence.service.IClasseStandardService;
import com.adaming.appSystemeAgence.service.IClientService;
import com.adaming.appSystemeAgence.service.IConseillerService;
import com.adaming.appSystemeAgence.service.IProprietaireService;

@ManagedBean(name = "agenceMB")
@SessionScoped
public class AgenceBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Conseiller utilisateur;

	private Conseiller conseiller;
	private List<Conseiller> listeConseillers;

	private Proprietaire proprietaire;
	private List<Proprietaire> listeProprietaires;

	private Client client;
	private List<Client> listeClients;

	private BienALouer bienALouer;
	private List<BienALouer> listeBiensALouer;

	private BienAAcheter bienAAcheter;
	private List<BienAAcheter> listeBiensAAcheter;

	private ClasseStandard classeStandard;
	private List<ClasseStandard> listeClasseStandard;
	/*
	 * Injection des services dans le managedbean.
	 */
	@ManagedProperty(value = "#{conseillerServiceBean}")
	private IConseillerService conseillerService;

	@ManagedProperty(value = "#{proprietaireServiceBean}")
	private IProprietaireService proprietaireService;

	@ManagedProperty(value = "#{clientServiceBean}")
	private IClientService clientService;

	@ManagedProperty(value = "#{bienServiceBean}")
	private IBienService bienService;

	@ManagedProperty(value = "#{classeStandardServiceBean}")
	private IClasseStandardService classeStandardService;

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

		setBienALouer(new BienALouer());
		bienALouer.setAdresse(new Adresse());

		setBienAAcheter(new BienAAcheter());
		bienAAcheter.setAdresse(new Adresse());

		classeStandard = new ClasseStandard();
		classeStandard.setTypeBien(" ");
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
	 * Instanciation d'un nouveau Bien a louer.
	 */
	public void initBienALouer() {
		System.out.println("===> MB : initBienALouer()");
		setBienALouer(new BienALouer());
		bienALouer.setAdresse(new Adresse());
		System.out.println("===> MB : new Bien a louer set.");
	}

	/**
	 * Instanciation d'un nouveau Bien a acheter.
	 */
	public void initBienAAcheter() {
		System.out.println("===> MB : initBienALouer()");
		setBienAAcheter(new BienAAcheter());
		bienAAcheter.setAdresse(new Adresse());
		System.out.println("===> MB : new Bien a acheter set.");
	}

	/**
	 * Instanciation d'une nouvelle classeStandard.
	 */
	public void initClasseStandard() {
		System.out.println("===> MB : initClasseStandard()");
		classeStandard = new ClasseStandard();
		classeStandard.setTypeBien(" ");
		System.out.println("===> MB : new classeStandard set.");
	}

	/**
	 * Ajout d'un conseiller dans la BDD.
	 */
	public void addConseiller() {
		System.out.println("===> MB : add conseiller : " + conseiller);
		if (getConseillerService().addConseiller(conseiller)) {
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
		if (getProprietaireService().addProprietaire(proprietaire)) {
			System.out.println("===> MB : Proprietaire added with success");
		} else {
			System.out.println("===> MB : Proprietaire FAILED to add.");
		}
	}

	/**
	 * Ajout d'une classe standard dans la BDD.
	 */
	public void addClasseStandard(ActionEvent event) {
		RequestContext context = RequestContext.getCurrentInstance();
		FacesMessage message = null;
		boolean validForm = false;

		if (true) {
			validForm = true;
			System.out.println("===> MB : add classeStandard : "
					+ classeStandard);
			if (getClasseStandardService().addClasseStandard(classeStandard)) {
				System.out
						.println("===> MB : classeStandard added with success to DB");
				message = new FacesMessage(FacesMessage.SEVERITY_INFO,
						"SuccÃ¨s", "classeStandard added with success to DB");
			} else {
				System.out
						.println("===> MB : classeStandard FAILED to add to DB");
				message = new FacesMessage(FacesMessage.SEVERITY_WARN,
						"Erreur", "classeStandard FAILED to add to DB");
			}

		} else {
			validForm = false;
			message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Erreur",
					"Veuillez vÃ©rifier les champs");
		}

		FacesContext.getCurrentInstance().addMessage(null, message);
		context.addCallbackParam("validForm", validForm);
	}

	/**
	 * Suppression d'une classe standard dans la BDD.
	 */
	public void removeClasseStandard(ActionEvent e) {
		System.out.println("!!!!!!!!!!! removeClasseStandard !!!!!!!!!!!!!!!");
		// recup du parametre id de <f:param>
		Map<String, String> params = FacesContext.getCurrentInstance()
				.getExternalContext().getRequestParameterMap();
		int idClasseStandard = Integer.parseInt(params.get("classeStdId"));
		System.out.println("===> MB : PARAM ID : " + idClasseStandard);

		// on va supprimer la classeStandard de la Bdd

		classeStandardService.deleteClasseStandardById(idClasseStandard);
		System.out.println("===> MB : PROPRIETAIRE SUPPRIME : "
				+ idClasseStandard);

	}

	/**
	 * 
	 */
	public void selectProprietaire() {
		// recup du parametre id de <f:param>
		Map<String, String> params = FacesContext.getCurrentInstance()
				.getExternalContext().getRequestParameterMap();
		int idProp = Integer.parseInt(params.get("id"));
		System.out.println("===> MB : PARAM ID : " + idProp);

		// on va chercher le proprio ï¿½ update avec son id
		Proprietaire proprietaire1 = getProprietaireService()
				.getProprietaireById(idProp);
		System.out.println("===> MB : PROPRIETAIRE RECUPERERE : "
				+ proprietaire1);
		setProprietaire(proprietaire1);
	}

	/**
	 * Rï¿½cupï¿½ration de l'identifiant du client choisi dans la page et
	 * recherche du client correspondant dans la base de donnï¿½es.
	 */
	public void selectClient() {
		/* Rï¿½cupï¿½ration du paramï¿½tre id de <f:param>. */
		Map<String, String> params = FacesContext.getCurrentInstance()
				.getExternalContext().getRequestParameterMap();
		int idClient = Integer.parseInt(params.get("id"));
		System.out
				.println("===== AgenceBean.java, mï¿½thode selectClient - idClient : "
						+ idClient + ". =====");

		/* Recherche du client ï¿½ afficher par son identifiant. */
		Client client = getClientService().getClientById(idClient);
		System.out
				.println("===== AgenceBean.java, mï¿½thode selectClient - Client rï¿½cupï¿½rï¿½ : "
						+ client + ". =====");
		setClient(client);
	}

	/**
	 * Récupération de l'identifiant du conseiller choisi dans la page et
	 * recherche du conseiller correspondant dans la base de données.
	 */
	public void selectConseiller() {
		System.out
				.println("===== AgenceBean.java - Entrée dans la méthode selectConseiller. =====");

		/* Récupération du paramètre id de <f:param>. */
		Map<String, String> params = FacesContext.getCurrentInstance()
				.getExternalContext().getRequestParameterMap();
		int idConseiller = Integer.parseInt(params.get("id"));
		System.out
				.println("===== AgenceBean.java, méthode selectConseiller - idConseiller = "
						+ idConseiller + ". =====");

		/* Recherche du client à afficher par son identifiant. */
		Conseiller conseiller = getConseillerService().getConseillerByID(
				idConseiller);
		System.out
				.println("===== AgenceBean.java, méthode selectConseiller - Conseiller récupéré : "
						+ (conseiller != null) + ". =====");
		setClient(client);

		System.out
				.println("===== AgenceBean.java - Sortie de la méthode selectConseiller. =====");
	}

	/**
	 * 
	 */
	public void updateProprietaire() {
		getProprietaireService().updateProprietaire(proprietaire);
		System.out.println("===> MB : UPDATE Proprietaire : " + proprietaire);
	}

	public void deleteProprietaire() {
		Map<String, String> params = FacesContext.getCurrentInstance()
				.getExternalContext().getRequestParameterMap();
		int idProp = Integer.parseInt(params.get("id"));
		System.out.println("===> MB DELETE PROPRIO : PARAM ID : " + idProp);
		getProprietaireService().deleteProprietaire(idProp);
		// System.out.println("===> dans DELETE get ALL :");
		// getListeProprietaires();
	}

	/**
	 * Login session
	 * 
	 * @return
	 */
	public String login() {
		// RÃ©cupÃ©ration du nom d'utilisateur
		// UIParameter cp = (UIParameter)
		// event.getComponent().findComponent("loginPage_username");
		// String username = (String) cp.getValue();

		// RÃ©cupÃ©ration du mot de passe
		// cp = (UIParameter)
		// event.getComponent().findComponent("loginPage_password");
		// String password = (String) cp.getValue();

		String username = conseiller.getLogin();
		String password = conseiller.getPassword();
		System.out.println("===> MB : login : " + username + " ; " + password);

		Conseiller conseillerTmp = conseillerService.getConseillerByLogin(
				username, password);

		if (conseillerTmp != null) {
			conseiller = utilisateur = conseillerTmp;
			return ("validationIdentificationConseiller");
		} else {
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_WARN,
							"Invalid Login!", "Please Try Again!"));
			return "identificationConseiller.xhtml";
		}
	}

	/**
	 * Logout session
	 */
	public String logout() {
		System.out
				.println("===> MB : deconnexion de " + utilisateur.getLogin());
		FacesContext.getCurrentInstance().getExternalContext()
				.invalidateSession();
		return "deconnexion";
	}

	/**
	 * 
	 * @return la liste de tous les conseillers.
	 */
	public List<Conseiller> getListeConseillers() {
		System.out.println("===> MB : getting listeConseillers");
		System.out.println("===> MB : managed property conseillerService : "
				+ conseillerService);
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
		System.out.println("===> MB : managed property proprietaireService : "
				+ proprietaireService);
		listeProprietaires = getProprietaireService().getAllProprietaires();
		System.out.println("===> MB : liste recuperee : " + listeProprietaires);
		return listeProprietaires;
	}

	/**
	 * Rï¿½cupï¿½ration de la liste de tous les clients.
	 * 
	 * @return
	 */
	public List<Client> getListeClients() {
		System.out.println("===> MB : getting listeClients");
		System.out.println("===> MB : managed property clientService : "
				+ clientService);
		listeClients = getClientService().getAllClients();
		System.out.println("===> MB : liste recuperee : " + listeClients);
		return listeClients;
	}

	/**
	 * 
	 * @return la liste de tous les biens
	 */
	public List<BienALouer> getListeBiensALouer() {
		System.out.println("===> MB : getting listeBiensALouer");
		System.out.println("===> MB : managed property bienService : "
				+ bienService);
		listeBiensALouer = getBienService().getAllBiensALouer();
		System.out.println("===> MB : liste recuperee : " + listeBiensALouer);
		return listeBiensALouer;
	}

	/**
	 * 
	 * @return la liste de tous les biens
	 */
	public List<BienAAcheter> getListeBiensAAcheter() {
		System.out.println("===> MB : getting listeBiensAAcheter");
		System.out.println("===> MB : managed property bienService : "
				+ bienService);
		listeBiensAAcheter = getBienService().getAllBiensAAcheter();
		System.out.println("===> MB : liste recuperee : " + listeBiensAAcheter);
		return listeBiensAAcheter;
	}

	/**
	 * 
	 * @return la liste de toutes les classes standard
	 */
	public List<ClasseStandard> getListeClasseStandard() {
		System.out.println("===> MB : getting listeClasseStandard");
		System.out
				.println("===> MB : managed property ClasseStandardService : "
						+ classeStandardService);
		listeClasseStandard = getClasseStandardService().getAllClasseStandard();
		System.out
				.println("===> MB : liste recuperee : " + listeClasseStandard);
		return listeClasseStandard;
	}

	/*
	 * autres getters et setters
	 */
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

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void setListeClients(List<Client> listeClients) {
		this.listeClients = listeClients;
	}

	public BienALouer getBienALouer() {
		return bienALouer;
	}

	public void setBienALouer(BienALouer bienALouer) {
		this.bienALouer = bienALouer;
	}

	public void setListeBiensALouer(List<BienALouer> listeBiensALouer) {
		this.listeBiensALouer = listeBiensALouer;
	}

	public BienAAcheter getBienAAcheter() {
		return bienAAcheter;
	}

	public void setBienAAcheter(BienAAcheter bienAAcheter) {
		this.bienAAcheter = bienAAcheter;
	}

	public void setListeBiensAAcheter(List<BienAAcheter> listeBiensAAcheter) {
		this.listeBiensAAcheter = listeBiensAAcheter;
	}

	public void setListeClasseStandard(List<ClasseStandard> listeClasseStandard) {
		this.listeClasseStandard = listeClasseStandard;
	}

	public ClasseStandard getClasseStandard() {
		return classeStandard;
	}

	public void setClasseStandard(ClasseStandard classeStandard) {
		this.classeStandard = classeStandard;
	}

	/*
	 * getter and SETTER of the managed properties
	 */
	public IConseillerService getConseillerService() {
		return conseillerService;
	}

	public void setConseillerService(IConseillerService conseillerService) {
		System.out.println("===> MB : setting conseiller service to "
				+ conseillerService);
		this.conseillerService = conseillerService;
	}

	public IProprietaireService getProprietaireService() {
		return proprietaireService;
	}

	public void setProprietaireService(IProprietaireService proprietaireService) {
		this.proprietaireService = proprietaireService;
	}

	public IClientService getClientService() {
		return clientService;
	}

	public void setClientService(IClientService clientService) {
		this.clientService = clientService;
	}

	public IBienService getBienService() {
		return bienService;
	}

	public void setBienService(IBienService bienService) {
		this.bienService = bienService;
	}

	public IClasseStandardService getClasseStandardService() {
		return classeStandardService;
	}

	public void setClasseStandardService(
			IClasseStandardService classeStandardService) {
		this.classeStandardService = classeStandardService;
	}

	public String acquisition(int a) {
		if (a == 1)
			return "oui";
		return "non";
	}

}
