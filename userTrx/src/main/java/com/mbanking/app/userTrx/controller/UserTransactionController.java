package com.mbanking.app.userTrx.controller;

import java.net.URISyntaxException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mbanking.app.userTrx.models.RestResponse;
import com.mbanking.app.userTrx.models.Transactions;
import com.mbanking.app.userTrx.models.UserTrxRestRequest;
import com.mbanking.app.userTrx.services.TransactionsServices;

@RestController
@RequestMapping("/transactions")
@CrossOrigin(origins="http://localhost:7777")  
public class UserTransactionController {
	@Autowired
	private TransactionsServices transactionsServices;	
	
	@RequestMapping(value = "/getrx", method=RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> getTrxLists(@RequestBody UserTrxRestRequest req) {
		List<Transactions> trxz = transactionsServices.findTrxByAccNumber(req.getAccountNumber());
		listBeautify(trxz);
		String msg = "No data provided.";
		
		if(trxz.size() > 0) {
			msg = "Success";
		}
		
		RestResponse resp = new RestResponse(msg, trxz);
		
		return new ResponseEntity<>(
				trxz, HttpStatus.OK);
	}
	
	private List<Transactions> listBeautify(List<Transactions> trxList){
		List<Transactions> newTrx = new ArrayList<>();
		Stream<Transactions> listtrx = trxList.stream().sorted(Comparator.comparing(Transactions::getTrxTimestamp));
		listtrx.forEach(listtrxy -> newTrx.add(listtrxy));

		return newTrx;
	}
			
	@Transactional
	@RequestMapping(value = "/addTrx", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> addNewTrx(@RequestBody Transactions trx) throws URISyntaxException {
		String msg = "No data provided.";
		try {
			Timestamp timestamp = new Timestamp((System.currentTimeMillis()));
			trx.setTrxTimestamp(timestamp);
			transactionsServices.addTrxByAccNumber(trx);
			msg = "Success";
			return new ResponseEntity<>(
				new RestResponse(msg, null), HttpStatus.OK);
		} catch (HibernateException e) {
			System.out.println(e);
			return new ResponseEntity<>(
					new RestResponse(msg, null), HttpStatus.CONFLICT);
		}
	}
	
	
	
}
