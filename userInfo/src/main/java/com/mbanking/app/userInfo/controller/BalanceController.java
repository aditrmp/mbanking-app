package com.mbanking.app.userInfo.controller;

import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mbanking.app.userInfo.models.Balance;
import com.mbanking.app.userInfo.models.RestResponse;
import com.mbanking.app.userInfo.models.UserBalanceRestRequest;
import com.mbanking.app.userInfo.services.BalanceService;

@RestController
@RequestMapping("/balance")
public class BalanceController {
	@Autowired
	private BalanceService balanceService;
	
	@RequestMapping(value = "/getbalance", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> checkUserBalance(@RequestBody UserBalanceRestRequest req)  throws URISyntaxException {
		List<Balance> balanceList = balanceService.findBalanceByAccNumber(req.getAccountNumber());
		long currBalance = -1;
		String msg = "OK";
		if(balanceList.size() > 0) {
			currBalance = balanceList.get(balanceList.size()-1).getBalanceAmount(); 
			msg = "OK";
			
			return new ResponseEntity<>(
				new RestResponse(currBalance, msg), HttpStatus.OK);
		}
		
		return new ResponseEntity<>(
				new RestResponse(currBalance, "Data not Found"), HttpStatus.OK);

	}
	
	public RestResponse getCurrentBalance(String accNumber) {
		List<Balance> balance = balanceService.findBalanceByAccNumber(accNumber);
		String msg = "No data provided.";
		long balanceAmount = 0;
		
		System.out.println(balance.size());
		if(balance.size() > 0) {
			balanceAmount = balance.get(0).getBalanceAmount();
			msg = "Success";
		}

		return new RestResponse(balanceAmount,msg);
	}
}
