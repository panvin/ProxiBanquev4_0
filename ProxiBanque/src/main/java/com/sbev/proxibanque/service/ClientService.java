package com.sbev.proxibanque.service;

import com.sbev.proxibanque.domaine.Client;
import com.sbev.proxibanque.domaine.Conseiller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sbev.proxibanque.dao.IClientDao;

/**
 * Classe Client service
 * Permet de gerer l'ensemble des operations liees aux clients en base.
 * Cette classe a pour parametre la Dao client.
 * @author Vincent PANOUILLERES
 */
@Service("clientService")
public class ClientService {

	@Autowired
	private IClientDao clientDao;
	
	public IClientDao getClientDao() {
		return clientDao;
	}

	public void setClientDao(IClientDao clientDao) {
		this.clientDao = clientDao;
	}

	/**
	 * Constructeur du service client
	 */
	public ClientService() {
	}
	
	/**
	 * Methode permettant de creer ou de modifier un client en base de donnees
	 * @param client Le client que l'on souhaite stocker ou modifier en base de donnees (objet de type Client)
	 * @return Le client qui a ete sauvegarde ou modifie en base de donnees (objet de type Client)
	 */
	public Client sauverClient(Client client){
		return clientDao.saveAndFlush(client);
	}
	
	/**
	 * Methode permettant de lire en client en conaissant son identifiant unique
	 * @param id L'identifiant du Cient (int)
	 * @return Le client correspondant a l'identifiant donne en parametre
	 */
	public Client lireClient(int id){
		return clientDao.findByIdClient(id);
	}
	
	/**
	 * Methode permettant de lire l'ensemble des clients en base
	 * @return La liste de tous les clients de ProxiBanque (objet de type List Client)
	 */
	public List<Client> lireToutClient(){
		return clientDao.findAll();
	}
	
	/**
	 * Methode permettant de supprimer un client
	 * @param client Le client qu'on souhaite supprimer
	 */
	public void supprimerClient(Client client){
		clientDao.delete(client);
	}
	
	/** 
	 * Methode pour recuperer les clients par conseiller
	 * @param conseiller Le conseiller auquel sont rattaches les clients recherches (objet de type Conseiller)
	 * @return Une liste de client (objet de type List Client) 
	 */
	public List<Client> lireClientParConseiller(Conseiller conseiller){
		return clientDao.findByConseiller(conseiller);
	}
	

}
