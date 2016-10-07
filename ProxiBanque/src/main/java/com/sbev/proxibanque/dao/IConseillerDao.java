package com.sbev.proxibanque.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbev.proxibanque.domaine.Conseiller;

@Repository("conseillerDao")
public interface IConseillerDao extends JpaRepository<Conseiller, Integer>{

}
