package com.example.syp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.syp.model.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long>{

	@Query("select a.email from Account a where a.email=:email")
	public String findByEmail(@Param("email")String email);	
	
	public Account findByEmailAndPassword(String email, String password);
	
	@Query("select a from Account a where a.status=:status ")
	List<Account> findByStatus(@Param("status") String status);
}
