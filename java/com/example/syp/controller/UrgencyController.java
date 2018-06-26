package com.example.syp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.example.syp.model.UrgencyTicket;
import com.example.syp.service.UrgencyTicketService;

@Controller
@SessionAttributes("penggunaaktif")
public class UrgencyController {
	
	@Autowired
	private UrgencyTicketService urgencyTicketService;

	@RequestMapping(value="urgencyticket",method=RequestMethod.POST)
	public ModelAndView goPerson(@ModelAttribute("urgencyTicket")UrgencyTicket urgencyTicket) {
		urgencyTicketService.SaveOrUpdate(urgencyTicket);
		return new ModelAndView("urgencyTicket","listurgencyticket",urgencyTicketService.getAll());
	}
	@RequestMapping(value="urgencyticket",method=RequestMethod.GET)
	public ModelAndView goPersonafterUpdate(@ModelAttribute("urgencyTicket")UrgencyTicket urgencyTicket) {
		return new ModelAndView("urgencyTicket","listurgencyticket",urgencyTicketService.getAll());
	}

}
