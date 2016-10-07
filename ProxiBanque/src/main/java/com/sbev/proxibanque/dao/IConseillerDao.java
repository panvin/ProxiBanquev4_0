package com.sbev.proxibanque.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbev.proxibanque.domaine.Conseiller;
import com.sbev.proxibanque.domaine.Gerant;

@Repository("conseillerDao")
public interface IConseillerDao extends JpaRepository<Conseiller, Integer>{
	
	/**
	 * Permet de retrouver un Conseiller par son idEmploye
	 * @param id ID du Conseiller a  retrouver
	 * @return un Conseiller
	 */
	public Conseiller findByIdEmploye (int id);

}
