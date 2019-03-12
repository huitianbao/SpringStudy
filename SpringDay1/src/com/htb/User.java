package com.htb;

public class User {
	private String username;
	
	public User () {
		
	}
	public User(String username) {
		
		this.username = username;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public void add() {
		System.out.print("add.............");
	}

	
	public static void main(String[] args) {
		User user=new User();
		user.add();
	
	}
}
