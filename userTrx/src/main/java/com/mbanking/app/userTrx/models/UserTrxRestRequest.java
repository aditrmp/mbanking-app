package com.mbanking.app.userTrx.models;

public class UserTrxRestRequest {
	private String accountNumber;
	private boolean isAuth;
	
	public UserTrxRestRequest () {
		
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public boolean isAuth() {
		return isAuth;
	}

	public void setAuth(boolean isAuth) {
		this.isAuth = isAuth;
	}
	 
	
}
