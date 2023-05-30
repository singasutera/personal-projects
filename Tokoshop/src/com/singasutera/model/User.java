package com.singasutera.model;

public class User {
	
	private int user_id;
	private String username;
	private String password;
	private String name;
	
	public User() {
	}
	
	public User(int user_id, String username, String password, String name) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.name = name;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
