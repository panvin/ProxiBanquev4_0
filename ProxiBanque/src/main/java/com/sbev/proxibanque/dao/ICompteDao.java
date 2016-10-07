package com.sbev.proxibanque.dao;

import com.sbev.proxibanque.domaine.Compte;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Classe permettant d'interagir avec la table compte de la base de donnees grace au type Compte et une clé de type Integer.
 * Elle herite de l'interface JpaRepository de Spring Data.
 * @author Sylvain Chauvet
 */
@Repository("compteDao")
public interface ICompteDao extends JpaRepository<Compte, Integer>{
	
	/**
	 * Permet de retrouver un Compte par son idCompte
	 * @param id ID du Compte a  retrouver
	 * @return un Compte
	 */
	public Compte findByIdCompte (int id);

}
