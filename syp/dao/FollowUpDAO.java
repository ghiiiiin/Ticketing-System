package com.example.syp.dao;

import java.util.List;
import com.example.syp.model.FollowUp;

public interface FollowUpDAO {
	public void insert(FollowUp followup);
    public void update(FollowUp followup);
    public void delete(FollowUp followup);
	public FollowUp getById(long id);
	public List<FollowUp> getAll();
}
