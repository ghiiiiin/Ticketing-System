package com.example.syp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.syp.model.TopicTicket;

@Repository
public interface TopicTicketRepository extends CrudRepository<TopicTicket, Long>{

}
