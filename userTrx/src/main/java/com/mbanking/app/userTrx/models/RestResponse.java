package com.mbanking.app.userTrx.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RestResponse {
//	private long balance;
	private String message;
	List<Transactions> trxs;
	
	public RestResponse(String message, List<Transactions> trxs) {
		super();
		this.message = message;
		this.trxs = trxs;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Transactions> getTrxs() {
		return trxs;
	}

	public void setTrxs(List<Transactions> trxs) {
		this.trxs = trxs;
	}
	
}
