package com.mbanking.app.userTrx.models;

import java.util.Date;

public class TransactionsRestResp {
	
	private String accountNumber;
	private char trxType;
	private String trxText;
	private String trxAmmount;
	private String balancePerTrx;
	private Date trxTimestamp;
	
	public TransactionsRestResp() {
		
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public char getTrxType() {
		return trxType;
	}

	public void setTrxType(char trxType) {
		this.trxType = trxType;
	}

	public String getTrxText() {
		return trxText;
	}

	public void setTrxText(String trxText) {
		this.trxText = trxText;
	}

	public String getTrxAmmount() {
		return trxAmmount;
	}

	public void setTrxAmmount(String trxAmmount) {
		this.trxAmmount = trxAmmount;
	}

	public String getBalancePerTrx() {
		return balancePerTrx;
	}

	public void setBalancePerTrx(String balancePerTrx) {
		this.balancePerTrx = balancePerTrx;
	}

	public Date getTrxTimestamp() {
		return trxTimestamp;
	}

	public void setTrxTimestamp(Date trxTimestamp) {
		this.trxTimestamp = trxTimestamp;
	}
	
		
}
