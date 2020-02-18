package com.capgemini.Movie.entity;

import java.time.LocalDate;

public class Customer {
	private String customerId;
	private String CustomerName;
	private String Password;
	private LocalDate dateOfBirth;
	public Customer(String customerId, String customerName, String password, LocalDate dateOfBirth) {
		super();
		this.customerId = customerId;
		CustomerName = customerName;
		Password = password;
		this.dateOfBirth = dateOfBirth;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	}
