package com.sbev.proxibanque.dao;

import com.sbev.proxibanque.domaine.Compte;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("compteDao")
public interface ICompteDao extends JpaRepository<Compte, Integer>{

}
