package com.example.syp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.syp.model.TicketStatus;

@Repository
public interface TicketStatusRepository extends CrudRepository<TicketStatus, Long>{

}
