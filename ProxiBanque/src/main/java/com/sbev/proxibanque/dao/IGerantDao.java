package com.sbev.proxibanque.dao;

import com.sbev.proxibanque.domaine.Gerant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("gerantDao")
public interface IGerantDao extends JpaRepository<Gerant, Integer>{

}
