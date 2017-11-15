package br.inatel.dm110.clients.beans;

import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import br.inatel.dm110.client.converter.ClientConverter;
import br.inatel.dm110.clients.dao.ClientDAO;
import br.inatel.dm110.clients.interfaces.ClientsLocal;
import br.inatel.dm110.clients.interfaces.ClientsRemote;
import db.inatel.dm110.clients.model.Client;

@Stateless
@Remote(ClientsRemote.class)
@Local(ClientsLocal.class)
public class ClientBean implements ClientsRemote, ClientsLocal {

	@EJB
	private ClientDAO clientDAO;
	
	private ClientConverter clientConverter = new ClientConverter();
	
	@Override
	public void addClient(Client client) {
		br.inatel.dm110.clients.entities.Client clientEntity = clientConverter.convertToEntity().apply(client);
		
		clientDAO.insert(clientEntity);
		
	}

	@Override
	public List<Client> getClients() {
		return clientDAO.listAll().stream()
				.map(clientConverter.convertToClient())
				.collect(Collectors.toList());
	}

}
