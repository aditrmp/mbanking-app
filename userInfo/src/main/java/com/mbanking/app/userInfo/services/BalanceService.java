package com.mbanking.app.userInfo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mbanking.app.userInfo.models.Balance;
import com.mbanking.app.userInfo.repository.BalanceRepository;

@Service
public class BalanceService {
	private BalanceRepository balanceRepository;
	
	@Autowired
	public BalanceService(BalanceRepository balanceRepository) {
		this.balanceRepository = balanceRepository;
	}
	
	public List<Balance> findBalanceByAccNumber(String accountNumber) {
		return balanceRepository.findBalanceByAccNumber(accountNumber);
	}
	
}
