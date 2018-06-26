package com.example.syp.dao;

import java.util.List;

import com.example.syp.model.UrgencyTicket;

public interface UrgencyTicketDAO {
	public void insert(UrgencyTicket urgencyticket);
    public void update(UrgencyTicket urgencyticket);
    public void delete(UrgencyTicket urgencyticket);
    public void SaveOrUpdate(UrgencyTicket urgencyticket);
    public void deleteUrgency(long id);
	public UrgencyTicket getById(long id);
    public List<UrgencyTicket> getAll();

}
