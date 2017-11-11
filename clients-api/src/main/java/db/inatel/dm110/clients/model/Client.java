package db.inatel.dm110.clients.model;

import java.io.Serializable;

public class Client implements Serializable {
	
	private static final long serialVersionUID = -3591848272220325936L;
	
	private String nome;
	private String email;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

}
