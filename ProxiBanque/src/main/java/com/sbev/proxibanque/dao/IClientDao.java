package com.sbev.proxibanque.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbev.proxibanque.domaine.Client;
import com.sbev.proxibanque.domaine.Conseiller;

@Repository("clientDao")
public interface IClientDao extends JpaRepository <Client, Integer> {
	
	/**
	 * Permet de retrouver un Client par son idClient
	 * @param id ID du client à retrouver
	 * @return un Client
	 */
	public Client findByIdClient (int id);
	
	
	/**
	 * Permet de retrouver des Clients par leur conseiller
	 * @param conseiller Conseiller des clients à retrouver
	 * @return une liste de Clients
	 */
	public List<Client> findByConseiller (Conseiller conseiller);

}
