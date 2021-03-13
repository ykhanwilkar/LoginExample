package com.loginlogout.example.model;

public class User {
	String username;
	String password;
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
	public boolean equals(Object obj) {
		User checkUser = (User)obj;
		return this.username.equals(checkUser.getUsername()) && this.password.equals(checkUser.getPassword());
		
	}
}
