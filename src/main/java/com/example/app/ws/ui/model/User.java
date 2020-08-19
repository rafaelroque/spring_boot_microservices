package com.example.app.ws.ui.model;

public class User {

	 private String firstName;
	 private String lastName;
	 private String email;
	 private String id;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public User(String firstName, String lastName, String email, String id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.id = id;
	}
	 
	 public static User generateDefault() {
		 return new User("Rafael", "Viana","rafa834@gmail.com","1");
	 }
	
}
