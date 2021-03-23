package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	
	@EmbeddedId
	private EmployeeIdentity identity;
	
	private String name;
	private String email;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	
	public Employee() {
		
	}

	public Employee(EmployeeIdentity identity, String name, String email, String phoneNumber) {
		super();
		this.identity = identity;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public EmployeeIdentity getIdentity() {
		return identity;
	}

	public void setIdentity(EmployeeIdentity identity) {
		this.identity = identity;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	

}
