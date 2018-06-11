package com.example.syp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.syp.dao.TopicTicketDAO;
import com.example.syp.model.TopicTicket;
import com.example.syp.repository.TopicTicketRepository;

@Service
public class TopicTicketService implements TopicTicketDAO {

	@Autowired
	TopicTicketRepository topicTicketRepository;
	
	@Override
	public void insert(TopicTicket topicticket) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(TopicTicket topicticket) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(TopicTicket topicticket) {
		topicTicketRepository.delete(topicticket);
		
	}

	@Override
	public TopicTicket getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TopicTicket> getAll() {
		List<TopicTicket> ltt = new ArrayList<>();
		topicTicketRepository.findAll().forEach(ltt::add);
		return ltt;
	}

	@Override
	public void SaveOrUpdate(TopicTicket topicticket) {
		topicTicketRepository.save(topicticket);
		
	}

	@Override
	public void deleteTopic(long id) {
		topicTicketRepository.deleteById(id);
		
	}

}
