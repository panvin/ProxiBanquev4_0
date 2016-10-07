package com.sbev.proxibanque.domaine;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="COMPTE_ID")
public class CompteEpargne extends Compte {

	public CompteEpargne(int idCompte, String type, double solde) {
		super(idCompte, "Epargne", solde);
	}
	public CompteEpargne(String type, double solde) {
		super("Epargne", solde);
	}
	public CompteEpargne() {
		super();
	}

}
