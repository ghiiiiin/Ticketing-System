package com.example.syp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.syp.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
