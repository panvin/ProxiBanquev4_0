package com.sbev.proxibanque.dao;

import com.sbev.proxibanque.domaine.Gerant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("gerantDao")
public interface IGerantDao extends JpaRepository<Gerant, Integer>{

	/**
	 * Permet de retrouver un Gerant par son idEmploye
	 * @param id ID du Gerant a  retrouver
	 * @return un Gerant
	 */
	public Gerant findByIdEmploye (int id);
}
