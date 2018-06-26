package com.example.syp.dao;

import java.util.List;
import com.example.syp.model.Account;
import com.example.syp.model.Agent;
import com.example.syp.model.Employee;



public interface AccountDAO {
    public void insert(Account account);
    public void update(Account account);
    public void delete(Account account);
    public void SaveOrUpdate(Account account);
    public void SaveUser(Employee employee, Account account );
    public void SaveAgent(Employee employee, Account account, Agent agent);
    public void deleteAccount(long id);
    public Account getById(long id);
    public List<Account> getAll();
    public Account getLogin(String email, String password);
    public boolean getExistEmail(String email);
}

