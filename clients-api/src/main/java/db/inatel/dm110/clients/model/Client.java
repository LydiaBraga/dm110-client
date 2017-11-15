package db.inatel.dm110.clients.model;

import java.io.Serializable;

public class Client implements Serializable {
	
	private static final long serialVersionUID = 5742057814662872542L;
	
	private Integer id;
	private String name;
	private String email;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

}
