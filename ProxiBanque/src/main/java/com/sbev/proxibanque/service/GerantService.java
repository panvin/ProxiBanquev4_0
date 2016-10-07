package com.sbev.proxibanque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.sbev.proxibanque.dao.IGerantDao;
import com.sbev.proxibanque.dao.IVirementDao;
import com.sbev.proxibanque.domaine.Gerant;
import com.sbev.proxibanque.domaine.Virement;

/**
 * Classe permettant d'effectuer le traitement metier relatif a la classe Gerant
 * @author Sylvain Chauvet
 */
@Service("gerantService")
public class GerantService {
	
	@Autowired
	private IGerantDao gerantDao;
	
	@Autowired
	private IVirementDao virementDao;

	public IGerantDao getGerantDao() {
		return gerantDao;
	}
	public void setGerantDao(IGerantDao gerantDao) {
		this.gerantDao = gerantDao;
	}

	public IVirementDao getVirementDao() {
		return virementDao;
	}
	public void setVirementDao(IVirementDao virementDao) {
		this.virementDao = virementDao;
	}
	
	public GerantService() {
		super();
	}
	
	/**
	 * Permet de creer ou modifier un Gerant en base de donnees.
	 * @param gerant Le Gerant a creer ou modifier
	 * @return Le Gerant cree ou modifie
	 */
	public Gerant sauverGerant(Gerant gerant) {
		return gerantDao.saveAndFlush(gerant);
	}
	
	/**
	 * Permet d'obtenir un Gerant avec son ID
	 * @param id ID du Gerant à obtenir
	 * @return Le Gerant
	 */
	public Gerant lireGerant(int id){
		return gerantDao.findByIdEmploye(id);
	}
	
	/**
	 * Permet d'obtenir la liste de tous les Gerants
	 * @return La liste de tous les Gerants
	 */
	public List<Gerant> lireToutGerant(){
		return gerantDao.findAll();
	}
	
	/**
	 * Permet de supprimer un Gerant de la base de donnees
	 * @param gerant Le Gerant a supprimer
	 */
	public void supprimerGerant(Gerant gerant){
		gerantDao.delete(gerant);
	}
	
	/**
	 * Permet d'obtenir la liste de tous les Virements
	 * @return La liste de tous les Virements
	 */
	public List<Virement> lireToutVirement(){
		return virementDao.findAll();
	}

}
