package com.example.syp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.syp.model.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long>{

	public Account findByEmailAndPassword(String email, String password);
}
