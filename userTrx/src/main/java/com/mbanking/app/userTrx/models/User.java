package com.mbanking.app.userTrx.models;

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
}
