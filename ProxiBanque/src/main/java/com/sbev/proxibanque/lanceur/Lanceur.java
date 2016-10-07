package com.sbev.proxibanque.lanceur;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sbev.proxibanque.dao.IClientDao;
import com.sbev.proxibanque.dao.IConseillerDao;
import com.sbev.proxibanque.dao.IGerantDao;
import com.sbev.proxibanque.domaine.Client;
import com.sbev.proxibanque.domaine.CompteEpargne;
import com.sbev.proxibanque.domaine.Conseiller;
import com.sbev.proxibanque.domaine.Gerant;
import com.sbev.proxibanque.service.ClientService;
import com.sbev.proxibanque.service.ConseillerService;
//import com.sbev.proxibanque.service.ClientService;

public class Lanceur {
	
	public static void main(String[] args) {
	
	// 1. Chargement du conteneur en 4.0.0
	//ApplicationContext appContext = (ApplicationContext) new ClassPathXmlApplicationContext("servlet.xml");
	
	// 2. Récupération des beans
	//ClientService clientService = (ClientService) appContext.getBean("clientService");
	ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("data.xml");
	
//	IClientDao dao = (IClientDao) appContext.getBean("clientDao");
//	IGerantDao gDao = (IGerantDao) appContext.getBean("gerantDao");
//	IConseillerDao cDao = (IConseillerDao) appContext.getBean("conseillerDao");
	ClientService clientService = (ClientService) appContext.getBean("clientService");
	ConseillerService conseillerService = (ConseillerService) appContext.getBean("conseillerService");

	
	CompteEpargne compteE = new CompteEpargne("jij", 2158.4);

	Client client1 = new Client ("Francis", "Dylan", "2 rue des champignons", "bdylan@gmail.com", null);
	client1.setEpargne(compteE);
	
	Conseiller bolos = new Conseiller("bob", "toto", "bolosstyle", "1234");
	Gerant bolosMaster = new Gerant("aaaa", "jedeviensfou", "springcdelamerde", "fucklintegration");
	
	//dao.saveAndFlush(client1);
	//gDao.saveAndFlush(bolosMaster);
	//cDao.saveAndFlush(bolos);
	
	clientService.sauverClient(client1);
	Client client2 = clientService.lireClient(1);
	System.out.println(client2.getPrenom());
	conseillerService.sauverConseiller(bolos); 

	}
}
