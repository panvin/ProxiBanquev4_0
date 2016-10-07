package com.sbev.proxibanque.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbev.proxibanque.domaine.Conseiller;

/**
 * Classe permettant d'interagir avec la table conseiller de la base de donnees grace au type Conseiller et une clé de type Integer.
 * Elle herite de l'interface JpaRepository de Spring Data.
 * @author Sylvain Chauvet
 */
@Repository("conseillerDao")
public interface IConseillerDao extends JpaRepository<Conseiller, Integer>{
	
	/**
	 * Permet de retrouver un Conseiller par son idEmploye
	 * @param id ID du Conseiller a  retrouver
	 * @return un Conseiller
	 */
	public Conseiller findByIdEmploye (int id);

}
