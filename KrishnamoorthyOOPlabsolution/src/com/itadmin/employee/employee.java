package com.itadmin.employee;

public class employee {
	//instance variables
	String firstname;
	String lastname;
	
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public employee(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}
	

}
