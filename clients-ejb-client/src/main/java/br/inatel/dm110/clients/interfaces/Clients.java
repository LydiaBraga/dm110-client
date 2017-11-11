package br.inatel.dm110.clients.interfaces;

import java.util.List;

import db.inatel.dm110.clients.model.Client;

public interface Clients {
	
	void addClient(Client client);
	
	public List<Client> getClients();

}
