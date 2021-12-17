package com.mbanking.app.userInfo.models;

//@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserAuthRestRequest {

	private String accountNumber;
	private String password;
	
	public UserAuthRestRequest () {
		
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
