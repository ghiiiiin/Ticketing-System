package com.example.syp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.syp.dao.TicketDAO;
import com.example.syp.model.Ticket;
import com.example.syp.model.UrgencyTicket;
import com.example.syp.repository.AgentRepository;
import com.example.syp.repository.EmployeeRepository;
import com.example.syp.repository.FollowUpRepository;
import com.example.syp.repository.PriorityStatusRepository;
import com.example.syp.repository.TicketRepository;
import com.example.syp.repository.TicketStatusRepository;
import com.example.syp.repository.UrgencyTicketRepository;

@Service
public class TicketService implements TicketDAO {
	
	@Autowired
	TicketRepository ticketRepository;
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	AgentRepository agentRepository;
	
	@Autowired
	FollowUpRepository followUpRepository;
	
	@Autowired
	PriorityStatusRepository prioirtyStatusRepository;
	
	@Autowired
	TicketStatusRepository ticketStatusRepository;
	
	@Autowired
	UrgencyTicketRepository urgentcyTicketRepository;


	@Override
	public void insert(Ticket ticket) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Ticket ticket) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Ticket ticket) {
		ticketRepository.delete(ticket);
		
	}

	@Override
	public Ticket getById(long id) {
		Ticket t = ticketRepository.findById(id).get();
		return t;
	}

	@Override
	public List<Ticket> getAll() {
		List<Ticket> lt = new ArrayList<>();
		ticketRepository.findAll().forEach(lt::add);
		return lt;
	}

	@Override
	public List<Ticket> getByAgent(String agentName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ticket> getByUrgency(String urgencyName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ticket> getByTicketStatus(String statusName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ticket testTicket(String summary) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void SaveOrUpdate(Ticket ticket) {
//		UrgencyTicket ut = urgentcyTicketRepository.findByUrgencyName("-");
//		ticket.setUrgencyTicket(ut);
		ticketRepository.save(ticket);
		
	}

	@Override
	public void deleteTicket(long id) {
		ticketRepository.deleteById(id);
		
	}

	
	
	
}
