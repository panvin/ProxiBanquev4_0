package com.sbev.proxibanque.presentation;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

import com.projet.proxibanquev3.domaine.Client;
import com.projet.proxibanquev3.domaine.Conseiller;
import com.projet.proxibanquev3.service.ClientService;
import com.projet.proxibanquev3.service.ConseillerService;

@ManagedBean(name="conseillerbean")
@SessionScoped
public class ConseillerBean implements Serializable
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	ClientService clientservice = new ClientService();
	ConseillerService conseillerservice = new ConseillerService();
    

    /**
     * 
     */
    private String login;
    private String password;
//    private String searchUser;
    private List<Client> clientList;
    private Conseiller conseiller;
    private Client client;
    
    
    public ConseillerBean() {
		super();
	}
    
    
    
    public List<Client> getClientList() {
		return clientList;
	}
	public void setClientList(List<Client> clientList) {
		this.clientList = clientList;
	}
	public String getLogin()
    {
        return login;
    }

	public void setLogin(String username)
    {
        this.login = username;
    }
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public Client getClient()
    {
        if(client == null){
            client = new Client();
        }
        return client;
    }
    
    public void setClient(Client client)
    {
        this.client = client;
    }
    
    
//    public Collection<Client> getSearchUsersResults()
//    {
//        return searchUsersResults;
//    }
//    public void setSearchUsersResults(Collection<Client> searchUsersResults)
//    {
//        this.searchUsersResults = searchUsersResults;
//    }
//    public String getSearchUser()
//    {
//        return searchUser;
//    }
//    public void setSearchUser(String searchUser)
//    {
//        this.searchUser = searchUser;
//    }
    
    public Conseiller getConseiller() {
		return conseiller;
	}



	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}



	/**
     * @return the page login.xhtml or home.xhtml if the condition is true or false
     */
    public String login1()
    {
    	boolean a = conseillerservice.estValide(login, password);
        if(a == true)
        {
        	conseiller = conseillerservice.read(login);
        	setClientList(clientservice.getTargetedClients(conseiller));
            return "clients";
        }
        else
        {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage("login", new FacesMessage("L'identifiant ou le mot de passe saisi est invalide"));
            return "login";
        }
    }
    
    /**
     * @return the page home.xhtml
     */
//    public String searchUser()
//    {
//        String login = (this.searchUser == null)? "":this.searchUser.trim();        
//        this.searchUsersResults = clientService.searchUser(login);
//        System.out.println("Notre liste contient: "+searchUsersResults.size());
//       return "home";
//    }
    
    public List<Client> clientList1(){
    	return clientservice.getTargetedClients(conseillerservice.read(login));
    }
    
    public void rowSelect(SelectEvent event){
    	client =  (Client)event.getObject();
    	System.out.println("selectedUser = "+client.getNom());	
    }
   
    
    
    
    
    
    public void onUserSelect(SelectEvent event){ 
    	this.client =  (Client)event.getObject();
    	System.out.println("selectedUser = "+client.getNom());
    }
    
    public void onUserUnselect(UnselectEvent event)
    {
    	client =  null;
    }
    
//	public String createUser()
//	{
//		clientservice.create(nom, prenom, adresse, email, soldeCourant, soldeEpargne, conseillerservice.read(login));
//		return "home";
//	}
}
