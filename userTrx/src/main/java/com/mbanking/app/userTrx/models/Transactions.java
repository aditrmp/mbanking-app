package com.mbanking.app.userTrx.models;

import java.util.Date;

//import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "trx_tbl")
//@SequenceGenerator(name="seq", initialValue=1, allocationSize=99999999)
public class Transactions {
	@Id
    @Column(name = "id", unique = true)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name = "account_number", nullable = false)
	private String accountNumber;

	@Column(name = "trx_type", nullable = false)
	private char trxType;

	@Column(name = "trx_text", nullable = false)
	private String trxText;

	@Column(name = "trx_ammount", nullable = false)
	private long trxAmmount;

	@Column(name = "balance_per_trx", nullable = false)
	private long balancePerTrx;

	@Column(name = "trx_timestamp", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date trxTimestamp;
	
	public Transactions() {
		
	}

	public Transactions(long id, String accountNumber, char trxType, String trxText, long trxAmmount,
			long balancePerTrx, Date trxTimestamp) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.trxType = trxType;
		this.trxText = trxText;
		this.trxAmmount = trxAmmount;
		this.balancePerTrx = balancePerTrx;
		this.trxTimestamp = trxTimestamp;
	}

	public long getid() {
		return id;
	}

	public void setid(long id) {
		this.id = id;
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

	public long getTrxAmmount() {
		return trxAmmount;
	}

	public void setTrxAmmount(long trxAmmount) {
		this.trxAmmount = trxAmmount;
	}

	public long getBalancePerTrx() {
		return balancePerTrx;
	}

	public void setBalancePerTrx(long balancePerTrx) {
		this.balancePerTrx = balancePerTrx;
	}

	public Date getTrxTimestamp() {
		return trxTimestamp;
	}

	public void setTrxTimestamp(Date trxTimestamp) {
		this.trxTimestamp = trxTimestamp;
	}

	
	
	
}
