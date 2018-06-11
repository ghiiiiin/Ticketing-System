package com.example.syp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.syp.model.Account;
import com.example.syp.model.Agent;
import com.example.syp.model.Employee;
import com.example.syp.model.Ticket;
import com.example.syp.model.TicketStatus;
import com.example.syp.model.TopicTicket;
import com.example.syp.model.UrgencyTicket;
import com.example.syp.service.AccountService;
import com.example.syp.service.AgentService;
import com.example.syp.service.EmployeeService;
import com.example.syp.service.TicketService;
import com.example.syp.service.TicketStatusService;
import com.example.syp.service.TopicTicketService;
import com.example.syp.service.UrgencyTicketService;


@RestController
public class TicketController {

	
	@Autowired
	TicketService ticketService;
	
	@Autowired
	AgentService agentservice;
	
	@Autowired
	AccountService accountService;
	
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	UrgencyTicketService urgencyTicketService;
	
	@Autowired
	AgentService agentService;
	
	@Autowired 
	TicketStatusService ticketStatusTicket;
	
	@Autowired
	TopicTicketService topicTicketService;
	
	
	@RequestMapping("/listuser")
	public List<Account> tampil2(){
		return accountService.getAll();
	}
	
	@RequestMapping("/listagent")
	public List<Agent> tampil(){
		return agentservice.getAll();
	}	
	
	@RequestMapping("/listticket")
	public List<Ticket> tampilTicket(){
		return ticketService.getAll();
	}
		
	@RequestMapping("/")
	public String goIndex() {
		return "index";
	}
	@RequestMapping("/ada")
	public String ticket() {
		return "admin-ticket";
	}
	
	   
    @RequestMapping(value = "/admin-view.html", method = RequestMethod.GET)
    public ModelAndView detailTicket() {
    	List<UrgencyTicket> lu = urgencyTicketService.getAll();
    	List<TicketStatus> lts = ticketStatusTicket.getAll();
    	List<Agent> las = agentService.getAll();
    	List<Ticket> lt = ticketService.getAll();
    	ModelAndView mav = new ModelAndView();
    	mav.setViewName("admin-view");
    	mav.addObject("Urgency", lu);
    	mav.addObject("Status",lts);
    	mav.addObject("Agent", las);
    	mav.addObject("Ticket", lt);
    	return mav;
    }
	

	
}
