package com.mbanking.app.userInfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mbanking.app.userInfo.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	@Query(value = "SELECT * from user_tbl WHERE account_number = :accountNumber and is_active = true",
			nativeQuery = true)
	User findUserByAccNumber(
			  @Param("accountNumber") String accountNumber
	);
	
	@Query(value = "SELECT * from user_tbl WHERE account_number = :accountNumber and password = :password and is_active=true LIMIT 1",
		nativeQuery = true)
	User findUser(
			@Param("accountNumber") String accountNumber,
			@Param("password") String string
			) ;
		
	@Query(value = "SELECT * from user_tbl WHERE account_number = :accountNumber and is_active=true LIMIT 1",
			nativeQuery = true)
		User findUserInfo(
				@Param("accountNumber") String accountNumber
				) ;
//		repo.addTrxByAccNumber(trx.getAccountNumber(), trx.getTrxType(), trx.getTrxText(), trx.getTrxAmmount(), trx.getBalancePerTrx());
	
}
