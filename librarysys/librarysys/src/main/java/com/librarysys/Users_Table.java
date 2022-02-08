package com.librarysys;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users_Table{
	private int user_id;
	private String name;
	private String username;
	private String password;
	private String email;
	
	@Id
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Users_Table [user_id=" + user_id + ", name=" + name + ", username=" + username + ", password="
				+ password + ", email=" + email + "]";
	}
	
}
