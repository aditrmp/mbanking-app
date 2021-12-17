package com.mbanking.app.userInfo.models;

public class UserBalanceRestRequest {
	private String accountNumber;
	private boolean isAuth;
	
	public UserBalanceRestRequest () {
		
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public boolean getIsAuth() {
		return isAuth;
	}

	public void setIsAuth(boolean isAuth) {
		this.isAuth = isAuth;
	}
	
	
}
