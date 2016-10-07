package com.sbev.proxibanque.domaine;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@DiscriminatorValue("GERANT")
public class Gerant extends Conseiller {

	public Gerant() {
		super();
	}

	public Gerant(int idEmploye, String prenom, String nom, String login, String password, List<Client> clients) {
		super(idEmploye, prenom, nom, login, password, clients);
	}

	public Gerant(String prenom, String nom, String login, String password, List<Client> clients) {
		super(prenom, nom, login, password, clients);
	}

	public Gerant(String prenom, String nom, String login, String password) {
		super(prenom, nom, login, password);
	}
	
	

}
