package com.example.syp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.syp.model.UrgencyTicket;

@Repository
public interface UrgencyTicketRepository extends CrudRepository<UrgencyTicket, Long>{
	UrgencyTicket findByUrgencyName (String urgencyName);
}
