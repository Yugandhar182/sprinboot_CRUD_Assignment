package com.springboot.crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Studentdata {
	
	@Id
	private int  id ;
	private String firstname;
	private  String lastname;
	private String email;
	private String mobile ;
	
	
	public Studentdata() {
		
	}


	public Studentdata(int id, String firstname, String lastname, String email, String mobile) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.mobile = mobile;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	@Override
	public String toString() {
		return "Studentdata [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", mobile=" + mobile + "]";
	}
	
	

}
