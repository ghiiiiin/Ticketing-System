package com.example.syp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.syp.model.TicketStatus;

@Repository
public interface TicketStatusRepository extends CrudRepository<TicketStatus, Long>{

//	@Query("select ts from TicketStatus ts where ts.id>=:id")
//	List<TicketStatus> findAllById(@Param("id") long id);
}
