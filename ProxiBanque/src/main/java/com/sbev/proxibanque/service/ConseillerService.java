package com.sbev.proxibanque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.sbev.proxibanque.dao.IConseillerDao;
import com.sbev.proxibanque.domaine.Conseiller;

/**
 * Classe permettant d'effectuer le traitement metier relatif a la classe Conseiller
 * @author Sylvain Chauvet
 */
@Service("conseillerService")
public class ConseillerService {
	
	@Autowired
	private IConseillerDao conseillerDao;

	public IConseillerDao getConseillerDao() {
		return conseillerDao;
	}
	public void setConseillerDao(IConseillerDao conseillerDao) {
		this.conseillerDao = conseillerDao;
	}
	
	public ConseillerService() {
		super();
	}
	
	/**
	 * Permet de creer ou modifier un Conseiller en base de donnees.
	 * @param conseiller Le Conseiller a creer ou modifier
	 * @return Le Conseiller cree ou modifie
	 */
	public Conseiller sauverConseiller(Conseiller conseiller) {
		return conseillerDao.saveAndFlush(conseiller);
	}
	
	/**
	 * Permet d'obtenir un Conseiller avec son ID
	 * @param id ID du Conseiller a obtenir
	 * @return Le Conseiller
	 */
	public Conseiller lireConseiller(int id){
		return conseillerDao.findByIdEmploye(id);
	}
	
	/**
	 * Permet d'obtenir la liste de tous les Conseillers
	 * @return La liste de tous les Conseillers
	 */
	public List<Conseiller> lireToutConseiller(){
		return conseillerDao.findAll();
	}
	
	/**
	 * Permet de supprimer un Conseiller de la base de donnees
	 * @param conseiller Le Conseiller a supprimer
	 */
	public void supprimerConseiller(Conseiller conseiller){
		conseillerDao.delete(conseiller);
	}

}
