package com.mbanking.app.userInfo.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "balance_tbl")
public class Balance {
	@Id
    @Column(name = "id", unique = true)
	private long Id;
	
	@Column(name = "account_number", nullable = false)
	private String accountNumber;
	
	@Column(name = "balance", nullable = false)
	private long balanceAmount;

	@Column(name = "updated_date", nullable = false)
	private Date updatedDate;
	
	public Balance() {
			
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

	public long getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(long balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	
}
