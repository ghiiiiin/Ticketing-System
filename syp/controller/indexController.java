package com.example.syp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

	@RequestMapping("index.html")
	public String home() {
		return("index");
	}

	@RequestMapping("admin-view.html")
	public String adminView() {
		return("admin-view");
	}
	
	@RequestMapping("admin-add-user.html")
	public String addUser() {
		return("admin-add-user");
	}
	
	@RequestMapping("admin-add-agent.html")
	public String addAgent() {
		return("admin-add-agent");
	}
	
	@RequestMapping("admin-list-user.html")
	public String user() {
		return("admin-list-user");
	}
	
	@RequestMapping("admin-list-agent.html")
	public String agent() {
		return("admin-list-agent");
	}
	
	@RequestMapping("admin-ticket.html")
	public String ticket() {
		return("admin-ticket");
	}
	
	@RequestMapping("admin-schedule.html")
	public String schedule() {
		return("admin-schedule");
	}
	
	@RequestMapping("login.html")
	public String login() {
		return("login");
	}
	
	@RequestMapping("user-home.html")
	public String userHome() {
		return("user-home");
	}
	
	@RequestMapping("user-create-ticket.html")
	public String createTicket() {
		return("user-create-ticket");
	}
}
