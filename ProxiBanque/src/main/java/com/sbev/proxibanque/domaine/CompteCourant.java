package com.sbev.proxibanque.domaine;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="COMPTE_ID")
public class CompteCourant extends Compte {

	public CompteCourant(int idCompte, String type, double solde) {
		super(idCompte, "Courant", solde);
	}
	public CompteCourant(String type, double solde) {
		super("Courant", solde);
	}
	public CompteCourant() {
		super();
	}

}
