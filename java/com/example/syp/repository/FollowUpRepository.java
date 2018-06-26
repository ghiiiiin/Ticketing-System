package com.example.syp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.syp.model.FollowUp;

@Repository
public interface FollowUpRepository extends CrudRepository<FollowUp, Long>{

}
