package com.sbev.proxibanque.presentation;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.projet.proxibanquev3.domaine.Compte;
import com.projet.proxibanquev3.service.CompteService;

@ManagedBean(name="comptebean")
@SessionScoped
public class CompteBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	CompteService compteservice = new CompteService();
	
	
	private Compte compte;
	
	
	public CompteBean() {
		super();
	}
	
	private double soldeCourant = (double) compteservice.read(iDCourant).getSolde();
	
	public Compte getCompte() {
		return compte;
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
}
