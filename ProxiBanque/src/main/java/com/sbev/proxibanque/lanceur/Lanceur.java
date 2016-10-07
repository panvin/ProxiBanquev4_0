package com.sbev.proxibanque.lanceur;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sbev.proxibanque.dao.IClientDao;
import com.sbev.proxibanque.dao.IConseillerDao;
import com.sbev.proxibanque.dao.IGerantDao;
import com.sbev.proxibanque.domaine.Client;
import com.sbev.proxibanque.domaine.Conseiller;
import com.sbev.proxibanque.domaine.Gerant;
//import com.sbev.proxibanque.service.ClientService;

public class Lanceur {
	
	public static void main(String[] args) {
	
	// 1. Chargement du conteneur en 4.0.0
	//ApplicationContext appContext = (ApplicationContext) new ClassPathXmlApplicationContext("servlet.xml");
	
	// 2. Récupération des beans
	//ClientService clientService = (ClientService) appContext.getBean("clientService");
	ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("data.xml");
	
	IClientDao dao = (IClientDao) appContext.getBean("clientDao");
	IGerantDao gDao = (IGerantDao) appContext.getBean("gerantDao");
	IConseillerDao cDao = (IConseillerDao) appContext.getBean("conseillerDao");
	
	Client client1 = new Client ("Bob", "Dylan", "2 rue des champignons", "bdylan@gmail.com", null);
	
	Conseiller bolos = new Conseiller("bob", "toto", "bolosstyle", "1234");
	Gerant bolosMaster = new Gerant("aaaa", "jedeviensfou", "springcdelamerde", "fucklintegration");
	
	dao.saveAndFlush(client1);
	gDao.saveAndFlush(bolosMaster);
	cDao.saveAndFlush(bolos);

	}
}
