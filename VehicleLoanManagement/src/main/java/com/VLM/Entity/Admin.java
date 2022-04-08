package com.VLM.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin {
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Integer adminid;
	
	public String username;
	public String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [username=" + username + ", password=" + password + "]";
	}

}
