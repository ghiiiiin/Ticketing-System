package com.example.syp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.syp.dao.TicketStatusDAO;
import com.example.syp.model.TicketStatus;
import com.example.syp.repository.TicketStatusRepository;

@Service
public class TicketStatusService implements TicketStatusDAO{

	@Autowired
	TicketStatusRepository ticketStatusRepository;
	
	@Override
	public void insert(TicketStatus ticketstatus) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(TicketStatus ticketstatus) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(TicketStatus ticketstatus) {
		ticketStatusRepository.delete(ticketstatus);
		
	}

	@Override
	public TicketStatus getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TicketStatus> getAll() {
		List<TicketStatus> lts = new ArrayList<>();
		ticketStatusRepository.findAll().forEach(lts::add);
		return lts;
	}

	@Override
	public void SaveOrUpdate(TicketStatus ticketstatus) {
		ticketStatusRepository.save(ticketstatus);
		
	}

	@Override
	public void deleteStatus(long id) {
		ticketStatusRepository.deleteById(id);
		
	}

}
