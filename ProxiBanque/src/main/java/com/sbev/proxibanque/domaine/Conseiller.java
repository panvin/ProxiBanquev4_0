package com.sbev.proxibanque.domaine;

import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="ROLE")
@DiscriminatorValue("CONSEILLER")
public class Conseiller extends Personne {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idEmploye;
	private String login;
	private String password;
	@OneToMany(targetEntity=Client.class, mappedBy="conseiller")
	private List<Client> clients;
	
	
	public Conseiller(int idEmploye, String prenom, String nom, String login, String password, List<Client> clients) {
		super(prenom, nom);
		this.idEmploye = idEmploye;
		this.login = login;
		this.password = password;
		this.clients = clients;
	}
	public Conseiller(String prenom, String nom, String login, String password, List<Client> clients) {
		super(prenom, nom);
		this.login = login;
		this.password = password;
		this.clients = clients;
	}
	public Conseiller(String prenom, String nom, String login, String password) {
		super(prenom, nom);
		this.login = login;
		this.password = password;
	}
	public Conseiller() {
		super();
	}
	
	
	public int getIdEmploye() {
		return idEmploye;
	}
	public void setIdEmploye(int idEmploye) {
		this.idEmploye = idEmploye;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Client> getClients() {
		return clients;
	}
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
	
	
	
}