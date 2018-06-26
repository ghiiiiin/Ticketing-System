package com.example.syp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.syp.dao.UrgencyTicketDAO;
import com.example.syp.model.UrgencyTicket;
import com.example.syp.repository.UrgencyTicketRepository;

@Service
public class UrgencyTicketService implements UrgencyTicketDAO{
	
	@Autowired
	UrgencyTicketRepository urgencyTicketRepository;

	@Override
	public void insert(UrgencyTicket urgencyticket) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(UrgencyTicket urgencyticket) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UrgencyTicket urgencyticket) {
		urgencyTicketRepository.delete(urgencyticket);
		
	}

	@Override
	public UrgencyTicket getById(long id) {
		UrgencyTicket u = urgencyTicketRepository.findById(id).get();
		return u;
	}

	@Override
	public List<UrgencyTicket> getAll() {
		List<UrgencyTicket> lu = new ArrayList<>();
		urgencyTicketRepository.findAll().forEach(lu::add);
		return lu;
	}
	
	

	@Override
	public void deleteUrgency(long id) {
		urgencyTicketRepository.deleteById(id);
		
	}

	@Override
	public void SaveOrUpdate(UrgencyTicket urgencyticket) {
		urgencyTicketRepository.save(urgencyticket);
		
	}

}
