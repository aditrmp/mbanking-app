package com.mbanking.app.userInfo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_tbl")
public class User {
	@Id
    @Column(name = "id", unique = true)
	private long Id;
	
	@Column(name = "account_number", nullable = false)
	private String accountNumber;
	
	@Column(name = "user_first_name", nullable = false)
	private String firstName;

	@Column(name = "user_last_name", nullable = false)
	private String lastName;
	 
	@Column(name = "password", nullable = false)
	private String password;

	@Column(name = "is_active", nullable = false)
	private Boolean isActive;
	
	public User () {
		
	}

	public User(long id, String accountNumber, String firstName, String lastName, String password, Boolean isActive) {
		super();
		Id = id;
		this.accountNumber = accountNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.isActive = isActive;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
	
}
