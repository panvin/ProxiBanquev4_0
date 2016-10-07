package com.sbev.proxibanque.dao;

import com.sbev.proxibanque.domaine.Virement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("virementDao")
public interface IVirementDao extends JpaRepository<Virement, Integer> {

}
