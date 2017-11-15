package br.inatel.dm110.client.converter;

import java.util.function.Function;

import db.inatel.dm110.clients.model.Client;

public class ClientConverter {
	
	public Function<Client, br.inatel.dm110.clients.entities.Client> convertToEntity() {
		return new Function<Client, br.inatel.dm110.clients.entities.Client>() {

			@Override
			public br.inatel.dm110.clients.entities.Client apply(Client client) {
				br.inatel.dm110.clients.entities.Client clientEntity = new br.inatel.dm110.clients.entities.Client();
				clientEntity.setName(client.getName());
				clientEntity.setEmail(client.getEmail());
				
				return clientEntity;
			}
		};
	}

	public Function<br.inatel.dm110.clients.entities.Client, Client> convertToClient() {
		return new Function<br.inatel.dm110.clients.entities.Client, Client>() {

			@Override
			public Client apply(br.inatel.dm110.clients.entities.Client clientEntity) {				
				Client client = new Client();
				client.setId(clientEntity.getId());
				client.setName(clientEntity.getName());
				client.setEmail(clientEntity.getEmail());
				
				return client;
			}
		};
	}

}
