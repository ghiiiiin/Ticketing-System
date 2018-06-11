package com.example.syp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.syp.model.Agent;

@Repository
public interface AgentRepository extends CrudRepository<Agent, Long> {
	
}
