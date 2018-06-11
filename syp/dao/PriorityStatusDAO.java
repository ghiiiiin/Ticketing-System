package com.example.syp.dao;

import java.util.List;

import com.example.syp.model.PriorityStatus;

public interface PriorityStatusDAO {
	public void insert(PriorityStatus prioritystatus);
    public void update(PriorityStatus prioritystatus);
    public void delete(PriorityStatus prioritystatus);
    public void SaveOrUpdate(PriorityStatus prioritystatus);
    public void deletePriority(long id);
    public PriorityStatus getById(long id);
    public List<PriorityStatus> getAll();
}
