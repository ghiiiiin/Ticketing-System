package com.example.syp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.syp.model.Agent;
import com.example.syp.model.Employee;
import com.example.syp.model.Ticket;
import com.example.syp.model.TicketStatus;
import com.example.syp.model.TopicTicket;
import com.example.syp.model.UrgencyTicket;
import com.example.syp.service.AgentService;
import com.example.syp.service.EmployeeService;
import com.example.syp.service.TicketService;
import com.example.syp.service.TicketStatusService;
import com.example.syp.service.TopicTicketService;
import com.example.syp.service.UrgencyTicketService;

@Controller
public class TicketController {

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
	
	@Autowired
	TicketService ticketService;
	
//  Perintah Update Ticket  
    @RequestMapping(value="admin-ticket.html",method=RequestMethod.POST)
	public ModelAndView goPerson(@ModelAttribute("ticket")Ticket ticket) {
		ticketService.SaveOrUpdate(ticket);
		return new ModelAndView("admin-ticket","listticket",ticketService.getAll());
	}
	@RequestMapping(value="admin-ticket.html",method=RequestMethod.GET)
	public ModelAndView goPersonafterUpdate(@ModelAttribute("ticket")Ticket ticket) {
		return new ModelAndView("admin-ticket","listticket",ticketService.getAll());
	}
	@RequestMapping(value="admin-view", method = RequestMethod.GET)
	public ModelAndView formUpdateTicket(@RequestParam("id") long id, @ModelAttribute("urgency") UrgencyTicket u,
			@ModelAttribute("topic") TopicTicket tt, @ModelAttribute("status") TicketStatus ts,
			@ModelAttribute("agent") Agent a,@ModelAttribute("employee") Employee e,Model model) {
		List<UrgencyTicket> urgency = urgencyTicketService.getAll();
		List<TopicTicket> topic = topicTicketService.getAll();
		List<TicketStatus> status = ticketStatusTicket.getAll();
		List<Employee> employee = employeeService.getAll();
		List<Agent> agent = agentService.getAll();
		model.addAttribute("listurgency", urgency);
		model.addAttribute("listtopic", topic);
		model.addAttribute("liststatus", status);
		model.addAttribute("listagent", agent);
		model.addAttribute("listemployee", employee);
		return new ModelAndView("admin-view","ticket",ticketService.getById(id));
	}
	
	@RequestMapping(value ="admin-view",method=RequestMethod.POST)
    public String insertUpdatePerson(@ModelAttribute("ticket")Ticket ticket){
        ticketService.SaveOrUpdate(ticket);
        return "redirect:admin-ticket.html";
    }
	

}
