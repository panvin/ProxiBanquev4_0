package com.sbev.proxibanque.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.sbev.proxibanque.dao.ICompteDao;
import com.sbev.proxibanque.dao.IVirementDao;
import com.sbev.proxibanque.domaine.Compte;
import com.sbev.proxibanque.domaine.Virement;

/**
 * Classe permettant d'effectuer le traitement metier relatif a la classe Compte
 * @author Sylvain Chauvet
 */
@Service("compteService")
public class CompteService {
	
	@Autowired
	private ICompteDao compteDao;
	
	@Autowired
	private IVirementDao virementDao;

	public ICompteDao getCompteDao() {
		return compteDao;
	}
	public void setCompteDao(ICompteDao compteDao) {
		this.compteDao = compteDao;
	}
	public IVirementDao getVirementDao() {
		return virementDao;
	}
	public void setVirementDao(IVirementDao virementDao) {
		this.virementDao = virementDao;
	}

	public CompteService() {
		super();
	}
	
	/**
	 * Permet de creer ou modifier un Compte en base de donnees.
	 * @param compte Le Compte a creer ou modifier
	 * @return Le Compte cree ou modifie
	 */
	public Compte sauverCompte(Compte compte) {
		return compteDao.saveAndFlush(compte);
	}
	
	/**
	 * Permet d'obtenir un Compte avec son ID
	 * @param id ID du Compte a obtenir
	 * @return Le Compte
	 */
	public Compte lireCompte(int id){
		return compteDao.findByIdCompte(id);
	}
	
	/**
	 * Permet d'obtenir la liste de tous les Comptes
	 * @return La liste de tous les Comptes
	 */
	public List<Compte> lireToutCompte(){
		return compteDao.findAll();
	}
	
	/**
	 * Permet de supprimer un Compte de la base de donnees
	 * @param compte Le Compte a supprimer
	 */
	public void supprimerCompte(Compte compte){
		compteDao.delete(compte);
	}
	
	/**
	 * Permet d'effectuer un Virement de Compte a Compte et de sauvegarder ce Virement en base de donnees
	 * @param idCompteD ID du Compte debiteur
	 * @param idCompteC ID du Compte crediteur
	 * @param montant Montant de la transaction
	 */
	@Transactional
	public void virement(int idCompteD, int idCompteC, double montant){
		Compte compteD = this.lireCompte(idCompteD);
		double soldeD = compteD.getSolde();
		Compte compteC = this.lireCompte(idCompteC);
		double soldeC = compteC.getSolde();
		compteD.setSolde(soldeD - montant);
		compteC.setSolde(soldeC + montant);
		this.sauverCompte(compteD);
		this.sauverCompte(compteC);
		
		Virement virement = new Virement(idCompteD, idCompteC, montant);
		virementDao.saveAndFlush(virement);
	}

}
