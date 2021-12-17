package com.mbanking.app.userInfo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mbanking.app.userInfo.models.Balance;

@Repository	
public interface BalanceRepository extends JpaRepository<Balance, Integer>{
	@Query(value = "SELECT * from balance_tbl WHERE account_number = :acountNumber ORDER BY updated_date DESC LIMIT 1", 
			nativeQuery = true)
	List<Balance> findBalanceByAccNumber(
			@Param("acountNumber") String acountNumber
	);
}
