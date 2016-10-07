package com.sbev.proxibanque.lanceur;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sbev.proxibanque.dao.IClientDao;
import com.sbev.proxibanque.domaine.Client;
//import com.sbev.proxibanque.service.ClientService;

public class Lanceur {
	
	public static void main(String[] args) {
	
	// 1. Chargement du conteneur en 4.0.0
	//ApplicationContext appContext = (ApplicationContext) new ClassPathXmlApplicationContext("servlet.xml");
	
	// 2. Récupération des beans
	//ClientService clientService = (ClientService) appContext.getBean("clientService");
	ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("data.xml");
	
	IClientDao dao = (IClientDao) appContext.getBean("clientDao");
	
	Client client1 = new Client ("Bob", "Dylan", "2 rue des champignons", "bdylan@gmail.com", null);
	
	dao.saveAndFlush(client1);

	}
}
