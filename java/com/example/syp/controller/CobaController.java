package com.example.syp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
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

@Controller
@SessionAttributes("penggunaaktif")
public class CobaController {
	
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
	
	@Autowired
	AccountService accountService;
	
	@RequestMapping("/tes")
	public String ada() {
		return "i";
	}
	
	@RequestMapping("/masuk")
	public String masuk() {
		return "tes";
	}
	
	public List<UrgencyTicket> lu = new ArrayList<>();
	public List<Ticket> lt = new ArrayList<>();

    @RequestMapping("/urgencyticket")
    public ModelAndView masterUrgency(){
    	 return new ModelAndView("urgencyTicket","listurgencyticket",lu);
    }
    
    @RequestMapping(value="/inserturgency", method = RequestMethod.GET)
    public String formInsertUrgency(){
        return "data";
    }
    @RequestMapping(value = "/inserturgency", method = RequestMethod.POST)
    public String prosesInsertUrgency(@ModelAttribute("UrgencyTicket") UrgencyTicket u){
        lu.add(u);
        return "redirect:/urgencyticket";
    }
	
	@RequestMapping("/ticket")
    public ModelAndView masterKaryawan(){
        return new ModelAndView("ticket","listticket", lt);
    }
    

	@RequestMapping(value="/insertticket", method = RequestMethod.GET)
    public ModelAndView formInsertTicket(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("insertticket");
        mav.addObject("listurgencyticket", lu);
        mav.addObject("ticket", new Ticket());
        return mav;
    }
    
    @RequestMapping(value = "/insertticket", method = RequestMethod.POST)
    public String prosesInsertTicket(@RequestParam ("urgencyticketid") long id, @ModelAttribute("Ticket") Ticket t){
        t.setUrgencyTicket(lu.get((int) (id-1)));
        lt.add(t);
        return "redirect:/urgencyTicket";
    }
  

    // perintah update ticket juga
//    @RequestMapping(value="ticket",method=RequestMethod.POST)
//	public ModelAndView goPerson(@ModelAttribute("ticket")Ticket ticket) {
//		ticketService.SaveOrUpdate(ticket);
//		return new ModelAndView("ticket","listticket",ticketService.getAll());
//	}
//	@RequestMapping(value="ticket",method=RequestMethod.GET)
//	public ModelAndView goPersonafterUpdate(@ModelAttribute("ticket")Ticket ticket) {
//		return new ModelAndView("ticket","listticket",ticketService.getAll());
//	}
//	
//	@RequestMapping(value ="update-ticket",method=RequestMethod.GET)
//    public ModelAndView formUpdatePerson(@RequestParam("id") int id){
//        return new ModelAndView("update-ticket","ticket",ticketService.getById(id));
//    }
	
    
	
//	@RequestMapping(value="update-ticket", method = RequestMethod.GET)
//	public ModelAndView formUpdateTicket(@RequestParam("id") long id, @ModelAttribute("urgency") UrgencyTicket u,
//			@ModelAttribute("topic") TopicTicket tt, @ModelAttribute("status") TicketStatus ts,
//			@ModelAttribute("agent") Agent a,@ModelAttribute("employee") Employee e,Model model) {
//		List<UrgencyTicket> urgency = urgencyTicketService.getAll();
//		List<TopicTicket> topic = topicTicketService.getAll();
//		List<TicketStatus> status = ticketStatusTicket.getAll();
//		List<Employee> employee = employeeService.getAll();
//		List<Agent> agent = agentService.getAll();
//		model.addAttribute("listurgency", urgency);
//		model.addAttribute("listtopic", topic);
//		model.addAttribute("liststatus", status);
//		model.addAttribute("listagent", agent);
//		model.addAttribute("listemployee", employee);
//		return new ModelAndView("update-ticket","ticket",ticketService.getById(id));
//	}
//	
//	@RequestMapping(value ="update-ticket",method=RequestMethod.POST)
//    public String insertUpdatePerson(@ModelAttribute("ticket")Ticket ticket){
//        ticketService.SaveOrUpdate(ticket);
//        return "redirect:ticket";
//    }
    
    
    
//  Perintah Update Ticket  
//    @RequestMapping(value="admin-ticket.html",method=RequestMethod.POST)
//	public ModelAndView goPerson(@ModelAttribute("ticket")Ticket ticket) {
//		ticketService.SaveOrUpdate(ticket);
//		return new ModelAndView("admin-ticket","listticket",ticketService.getAll());
//	}
//	@RequestMapping(value="admin-ticket.html",method=RequestMethod.GET)
//	public ModelAndView goPersonafterUpdate(@ModelAttribute("ticket")Ticket ticket) {
//		return new ModelAndView("admin-ticket","listticket",ticketService.getAll());
//	}
//	@RequestMapping(value="admin-view", method = RequestMethod.GET)
//	public ModelAndView formUpdateTicket(@RequestParam("id") long id, @ModelAttribute("urgency") UrgencyTicket u,
//			@ModelAttribute("topic") TopicTicket tt, @ModelAttribute("status") TicketStatus ts,
//			@ModelAttribute("agent") Agent a,@ModelAttribute("employee") Employee e,Model model) {
//		List<UrgencyTicket> urgency = urgencyTicketService.getAll();
//		List<TopicTicket> topic = topicTicketService.getAll();
//		List<TicketStatus> status = ticketStatusTicket.getAll();
//		List<Employee> employee = employeeService.getAll();
//		List<Agent> agent = agentService.getAll();
//		model.addAttribute("listurgency", urgency);
//		model.addAttribute("listtopic", topic);
//		model.addAttribute("liststatus", status);
//		model.addAttribute("listagent", agent);
//		model.addAttribute("listemployee", employee);
//		return new ModelAndView("admin-view","ticket",ticketService.getById(id));
//	}
//	
//	@RequestMapping(value ="admin-view",method=RequestMethod.POST)
//    public String insertUpdatePerson(@ModelAttribute("ticket")Ticket ticket){
//        ticketService.SaveOrUpdate(ticket);
//        return "redirect:admin-ticket.html";
//    }
	
    
//     perintah delete
//	@RequestMapping(value="deleteperson")
//	public String deleteKary(@RequestParam("id") int id){
//        personServices.deletePerson(id);
//		return "redirect:person";
//    }

 
}
