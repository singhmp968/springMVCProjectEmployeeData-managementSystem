package com.mvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	private int empNumber;
	private String name;
	private String email;
	private String password;
	public int getEmpNumber() {
		return empNumber;
	}
	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int empNumber, String name, String email, String password) {
		super();
		this.empNumber = empNumber;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [empNumber=" + empNumber + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}

	
}
