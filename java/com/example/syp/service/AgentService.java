package com.example.syp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.syp.dao.AgentDAO;
import com.example.syp.model.Agent;
import com.example.syp.repository.AccountRepository;
import com.example.syp.repository.AgentRepository;
import com.example.syp.repository.EmployeeRepository;

@Service
public class AgentService implements AgentDAO{

	@Autowired
	AgentRepository agentRepository;
	
	@Autowired
	AccountRepository accountRepository;
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public void insert(Agent agent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Agent agent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Agent agent) {
		agentRepository.delete(agent);
		
	}

	@Override
	public Agent getById(long id) {
		Agent a = agentRepository.findById(id).get();
		return a;
	}

	@Override
	public List<Agent> getAll() {
		List<Agent> lag = new ArrayList<>();
		agentRepository.findAll().forEach(lag::add);
		return lag;
	}
	
	

	@Override
	public List<Agent> getByStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAgent(long id) {
		agentRepository.deleteById(id);
		
	}

	@Override
	public void SaveOrUpdate(Agent agent) {
		agentRepository.save(agent);
		
	}

}
