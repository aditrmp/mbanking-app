package com.mbanking.app.userInfo.models;

import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class RestResponse {
	private long balance;
	private String message;
	
	public RestResponse(long balance, String message) {
		super();
		this.balance = balance;
		this.message = message;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
