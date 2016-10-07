package com.sbev.proxibanque.domaine;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
//@Entity
@DiscriminatorValue("PERSONNE")
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Personne {
	
	private String prenom;
	private String nom;
	
	public Personne(String prenom, String nom) {
		super();
		this.prenom = prenom;
		this.nom = nom;
	}
	public Personne() {
		super();
	}


	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
//	public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
}
