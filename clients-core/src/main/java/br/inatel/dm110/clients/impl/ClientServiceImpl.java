package br.inatel.dm110.clients.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import br.inatel.dm110.clients.interfaces.ClientsRemote;
import db.inatel.dm110.clients.api.ClientService;
import db.inatel.dm110.clients.model.Client;

@RequestScoped
public class ClientServiceImpl implements ClientService {

	@EJB(lookup = "java:app/clients-ejb-0.1-SNAPSHOT/ClientBean!br.inatel.dm110.clients.interfaces.ClientsRemote")
	private ClientsRemote clients;
	
	@Override
	public List<Client> getClients() {
		return clients.getClients();
	}

	@Override
	public void addClient(Client client) {
		clients.addClient(client);		
	}

}
