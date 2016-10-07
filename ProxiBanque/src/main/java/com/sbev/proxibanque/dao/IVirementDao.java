package com.sbev.proxibanque.dao;

import com.sbev.proxibanque.domaine.Virement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Classe permettant d'interagir avec la table virement de la base de donnees grace au type Virement et une clé de type Integer.
 * Elle herite de l'interface JpaRepository de Spring Data.
 * @author Sylvain Chauvet
 */
@Repository("virementDao")
public interface IVirementDao extends JpaRepository<Virement, Integer> {

}
