package com.example.app.ws.ui.to;


import javax.validation.constraints.Email;
import javax.validation.constraints.Size;



public class UserTO {

	
	@Size(min = 3 , message = "Minimum 3 characters")
	private String firstName;
	
	private String lastName;
	
	@Email
	private String email;
	
	private String password;
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public UserTO(String firstName, String lastName, String email, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}
	
	public UserTO() {
		
	}
	@Override
	public String toString() {
		return "UserTO [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password="
				+ password + "]";
	}
	
	
	
}
