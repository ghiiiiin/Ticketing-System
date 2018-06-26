package com.example.syp.dao;

import java.util.List;

import com.example.syp.model.Agent;


public interface AgentDAO {
	public void insert(Agent agent);
    public void update(Agent agent);
    public void delete(Agent agent);
    public void SaveOrUpdate(Agent agent);
    public void deleteAgent(long id);
    public Agent getById(long id);
    public List<Agent> getAll();
    public List<Agent> getByStatus();
}