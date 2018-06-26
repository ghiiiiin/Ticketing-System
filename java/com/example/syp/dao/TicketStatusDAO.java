package com.example.syp.dao;


import java.util.List;
import com.example.syp.model.TicketStatus;

public interface TicketStatusDAO {
	public void insert(TicketStatus ticketstatus);
    public void update(TicketStatus ticketstatus);
    public void delete(TicketStatus ticketstatus);
    public void SaveOrUpdate(TicketStatus ticketstatus);
    public void deleteStatus(long id);
    public TicketStatus getById(long id);
    public List<TicketStatus> getAll();
}
