package com.sbev.proxibanque.dao;

import com.sbev.proxibanque.domaine.Gerant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Classe permettant d'interagir avec les tables gerant et conseiller de la base de donnees grace au type Gerant et une clé de type Integer.
 * Elle herite de l'interface JpaRepository de Spring Data.
 * @author Sylvain Chauvet
 */
@Repository("gerantDao")
public interface IGerantDao extends JpaRepository<Gerant, Integer>{

	/**
	 * Permet de retrouver un Gerant par son idEmploye
	 * @param id ID du Gerant a  retrouver
	 * @return un Gerant
	 */
	public Gerant findByIdEmploye (int id);
}
