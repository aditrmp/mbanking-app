package com.mbanking.app.userTrx.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mbanking.app.userTrx.models.Transactions;

@Repository
public interface TransactionsRepository extends JpaRepository<Transactions, Integer>{
	@Query(value = "SELECT * from trx_tbl WHERE account_number = :accountNumber ORDER BY trx_timestamp DESC ", 
			nativeQuery = true)
	List<Transactions> findTrxByAccNumber(
			@Param("accountNumber") String acountNumber
	);
	
	@Modifying
	@Query(value = "INSERT INTO  trx_tbl(account_number, trx_type, trx_text, trx_ammount, balance_per_trx, trx_timestamp) "
			+ "values(:acountNumber, :trxType, :trxText, :trxAmmount, :balancePerTrx, :trxTimestamp)", 
			nativeQuery = true)
	void addTrxByAccNumber(
//			@Param("id") long id,
			@Param("acountNumber") String acountNumber,
			@Param("trxType") char trxType,
			@Param("trxText") String string,
			@Param("trxAmmount") long trxAmmount,
			@Param("balancePerTrx") long balancePerTrx,
			@Param("trxTimestamp") Date trxTimestamp
	);
}
