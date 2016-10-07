package com.sbev.proxibanque.domaine;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("CLIENT")
public class Client extends Personne {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idClient;
	private String adresse;
	private String email;
	@OneToOne
	@JoinColumn(name="idClient")
	private CompteCourant courant;
	@OneToOne
	@JoinColumn(name="idClient")
	private CompteEpargne epargne;
	@ManyToOne(targetEntity=Conseiller.class)
	private Conseiller conseiller;
	
	
	public Client(int idClient, String prenom, String nom, String adresse, String email, CompteCourant courant,
			CompteEpargne epargne, Conseiller conseiller) {
		super(prenom, nom);
		this.idClient = idClient;
		this.adresse = adresse;
		this.email = email;
		this.courant = courant;
		this.epargne = epargne;
		this.conseiller = conseiller;
	}
	public Client(String prenom, String nom, String adresse, String email, CompteCourant courant, CompteEpargne epargne,
			Conseiller conseiller) {
		super(prenom, nom);
		this.adresse = adresse;
		this.email = email;
		this.courant = courant;
		this.epargne = epargne;
		this.conseiller = conseiller;
	}
	public Client(String prenom, String nom, String adresse, String email, CompteCourant courant,
			Conseiller conseiller) {
		super(prenom, nom);
		this.adresse = adresse;
		this.email = email;
		this.courant = courant;
		this.conseiller = conseiller;
	}
	public Client(String prenom, String nom, String adresse, String email, CompteEpargne epargne,
			Conseiller conseiller) {
		super(prenom, nom);
		this.adresse = adresse;
		this.email = email;
		this.epargne = epargne;
		this.conseiller = conseiller;
	}
	public Client(String prenom, String nom, String adresse, String email, Conseiller conseiller) {
		super(prenom, nom);
		this.adresse = adresse;
		this.email = email;
		this.conseiller = conseiller;
	}
	public Client() {
		super();
	}
	
	
	public int getIdClient() {
		return idClient;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public CompteCourant getCourant() {
		return courant;
	}
	public void setCourant(CompteCourant courant) {
		this.courant = courant;
	}
	public CompteEpargne getEpargne() {
		return epargne;
	}
	public void setEpargne(CompteEpargne epargne) {
		this.epargne = epargne;
	}
	public Conseiller getConseiller() {
		return conseiller;
	}
	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}
	

}
