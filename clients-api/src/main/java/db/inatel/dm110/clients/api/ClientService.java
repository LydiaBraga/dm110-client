package db.inatel.dm110.clients.api;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import db.inatel.dm110.clients.model.Client;

@Path("/client")
public interface ClientService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	List<Client> getClients();

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	void addClient(Client client);
	
}
