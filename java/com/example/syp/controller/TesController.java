package com.example.syp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.syp.model.Account;
import com.example.syp.model.Employee;
import com.example.syp.model.UrgencyTicket;
import com.example.syp.service.AccountService;
import com.example.syp.service.EmployeeService;
import com.example.syp.service.UrgencyTicketService;

@RestController
public class TesController {
	
	
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	UrgencyTicketService us;

	
	@RequestMapping("/ya")
	public List<Employee> tampil1(){
		return employeeService.getAll();
	}
	
	
	@RequestMapping("/la")
	public List<UrgencyTicket> la(){
		return us.getAll();
	}
	
	
}
