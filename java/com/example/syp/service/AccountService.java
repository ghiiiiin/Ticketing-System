package com.example.syp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.syp.dao.AccountDAO;
import com.example.syp.model.Account;
import com.example.syp.model.Agent;
import com.example.syp.model.Employee;
import com.example.syp.repository.AccountRepository;
import com.example.syp.repository.AgentRepository;
import com.example.syp.repository.EmployeeRepository;
import com.example.syp.repository.PriorityStatusRepository;

@Service
public class AccountService implements AccountDAO{

	@Autowired
	AccountRepository accountRepository;
	
	@Autowired
	PriorityStatusRepository priorityStatusRepository;
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	AgentRepository agentRepository;
	
	@Override
	public void insert(Account account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Account account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Account account) {
		accountRepository.delete(account);
		
	}

	@Override
	public Account getById(long id) {
		Account a = accountRepository.findById(id).get();
		return a;
	}
	

	@Override
	public List<Account> getAll() {
		List<Account> lac = new ArrayList<>();
		accountRepository.findAll().forEach(lac::add);
		return lac;
	}


	@Override
	public Account getLogin(String email, String password) {
		return accountRepository.findByEmailAndPassword(email , password);
	}

	@Override
	public boolean getExistEmail(String email) {
		return (accountRepository.findByEmail(email)!=null);
	}
	
	
	@Override
	public void deleteAccount(long id) {
		accountRepository.deleteById(id);
		
	}

	@Override
	public void SaveOrUpdate(Account account) {
		accountRepository.save(account);
		
	}
	
	@Override
	public void SaveUser(Employee employee, Account account ) {
		try {
			employee = employeeRepository.save(employee);
			account.setEmployee(employee);
			accountRepository.save(account);
			
		}
		catch(Exception e){
			System.out.println("error : "+e);
		}
	}
	
	@Override
	public void SaveAgent(Employee employee, Account account, Agent agent ) {
		try {
			employee = employeeRepository.save(employee);
			account.setEmployee(employee);
			accountRepository.save(account);
			agent.setAccount(account);
			agentRepository.save(agent);
			
		}
		catch(Exception e){
			System.out.println("error : "+e);
		}
	}
			
	public List<Account> getAlll() {
		List<Account> lac = new ArrayList<>();
		accountRepository.findByStatus("Active").forEach(lac::add);
		return lac;
	}
}
