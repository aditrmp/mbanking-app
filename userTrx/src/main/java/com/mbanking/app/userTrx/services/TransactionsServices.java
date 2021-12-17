package com.mbanking.app.userTrx.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mbanking.app.userTrx.models.Transactions;
import com.mbanking.app.userTrx.repository.TransactionsRepository;

@Service
public class TransactionsServices {
	private TransactionsRepository repo;
	
	@Autowired
	public TransactionsServices(TransactionsRepository transactionsRepository) {
		this.repo = transactionsRepository;
	}
	
	public List<Transactions> findTrxByAccNumber(String accountNumber) {
		return repo.findTrxByAccNumber(accountNumber);
	}
	
	public void addTrxByAccNumber(Transactions trx) {
		
		repo.addTrxByAccNumber(trx.getAccountNumber(), trx.getTrxType(), trx.getTrxText(), trx.getTrxAmmount(), trx.getBalancePerTrx(), trx.getTrxTimestamp());
	}

}
