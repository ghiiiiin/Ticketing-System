package com.example.syp.dao;

import java.util.List;
import com.example.syp.model.Ticket;

public interface TicketDAO {
	public void insert(Ticket ticket);
    public void update(Ticket ticket);
    public void delete(Ticket ticket);
    public void SaveOrUpdate(Ticket ticket);
    public void deleteTicket(long id);
	public Ticket getById(long id);
    public List<Ticket> getAll();
    public List<Ticket> getAllByTS();
    public List<Ticket> getByAgent(String agentName);
    public List<Ticket> getByUrgency(String urgencyName);
    public List<Ticket> getByTicketStatus(String statusName);
    public Ticket testTicket(String summary);
    
}
