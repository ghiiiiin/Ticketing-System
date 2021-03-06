package com.example.syp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.syp.model.Ticket;

@Repository
public interface TicketRepository extends CrudRepository<Ticket, Long> {
	List<Ticket> findTicketByTicketStatus(String statusName);
	List<Ticket> findTicketByAgent(String agentName);
	List<Ticket> findTicketByUrgencyTicket(String urgencyName);
	
	@Query("select t from Ticket t where t.ticketStatus.id=:id")
	List<Ticket> findAllByTicketStatus(@Param("id") long id);
	
	@Query("select t from Ticket t where t.ticketStatus.id!=:id")
	List<Ticket> findAllByTS(@Param("id") long id);
	
}
