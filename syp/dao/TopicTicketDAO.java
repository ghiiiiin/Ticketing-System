package com.example.syp.dao;

import java.util.List;

import com.example.syp.model.TopicTicket;

public interface TopicTicketDAO {
	public void insert(TopicTicket topicticket);
    public void update(TopicTicket topicticket);
    public void delete(TopicTicket topicticket);
    public void SaveOrUpdate(TopicTicket topicticket);
    public void deleteTopic(long id);
	public TopicTicket getById(long id);
    public List<TopicTicket> getAll();
}
