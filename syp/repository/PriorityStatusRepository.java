package com.example.syp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.syp.model.PriorityStatus;


@Repository
public interface PriorityStatusRepository extends CrudRepository<PriorityStatus, Long> {

}
