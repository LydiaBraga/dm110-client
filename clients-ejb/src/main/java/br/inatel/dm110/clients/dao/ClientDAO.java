package br.inatel.dm110.clients.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import db.inatel.dm110.clients.model.Client;

@Stateless
public class ClientDAO {
	
	@PersistenceContext(unitName = "agenda")
	private EntityManager em;
	
	public List<Client> listAll() {
		return em.createQuery("from Client c", Client.class).getResultList();
	}
	
	public void insert(Client client) {
		em.persist(client);
	}

}
