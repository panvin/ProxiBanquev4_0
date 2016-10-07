package com.sbev.proxibanque.domaine;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Virement {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idVirement;
	//changer UML
	private Timestamp date;
	//id ou compte ?
	private int idCompteDebiteur;
	private int idCompteCrediteur;
	private double montant;
	
	public Virement(int idVirement, Timestamp date, int idCompteDebiteur, int idCompteCrediteur, double montant) {
		super();
		this.idVirement = idVirement;
		this.date = date;
		this.idCompteDebiteur = idCompteDebiteur;
		this.idCompteCrediteur = idCompteCrediteur;
		this.montant = montant;
	}
	
	public Virement(Timestamp date, int idCompteDebiteur, int idCompteCrediteur, double montant) {
		super();
		this.date = date;
		this.idCompteDebiteur = idCompteDebiteur;
		this.idCompteCrediteur = idCompteCrediteur;
		this.montant = montant;
	}

	public Virement() {
		super();
	}

	public int getIdVirement() {
		return idVirement;
	}
	public void setIdVirement(int idVirement) {
		this.idVirement = idVirement;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	public int getIdCompteDebiteur() {
		return idCompteDebiteur;
	}
	public void setIdCompteDebiteur(int idCompteDebiteur) {
		this.idCompteDebiteur = idCompteDebiteur;
	}
	public int getIdCompteCrediteur() {
		return idCompteCrediteur;
	}
	public void setIdCompteCrediteur(int idCompteCrediteur) {
		this.idCompteCrediteur = idCompteCrediteur;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	
	
	
	
}
