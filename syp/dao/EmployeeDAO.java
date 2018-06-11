package com.example.syp.dao;

import java.util.List;

import com.example.syp.model.Employee;


public interface EmployeeDAO {
	public void insert(Employee employee);
    public void update(Employee employee);
    public void delete(Employee employee);
    public void SaveOrUpdate(Employee employee);
    public void deleteEmployee(long id);
    public Employee getById(long id);
    public List<Employee> getAll();
}
