package com.example.syp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.syp.dao.EmployeeDAO;
import com.example.syp.model.Employee;
import com.example.syp.repository.AccountRepository;
import com.example.syp.repository.EmployeeRepository;

@Service
public class EmployeeService implements EmployeeDAO{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	AccountRepository accountRepository;
	
	@Override
	public void insert(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Employee employee) {
		employeeRepository.delete(employee);
		
	}

	@Override
	public Employee getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAll() {
		List<Employee> le = new ArrayList<>();
		employeeRepository.findAll().forEach(le::add);
		return le;
	}

	@Override
	public void SaveOrUpdate(Employee employee) {
		employeeRepository.save(employee);
		
	}

	@Override
	public void deleteEmployee(long id) {
		employeeRepository.deleteById(id);
		
	}

}
