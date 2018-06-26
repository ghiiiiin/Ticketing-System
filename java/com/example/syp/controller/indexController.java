package com.example.syp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("penggunaaktif")
public class indexController implements ErrorController  {

	@RequestMapping("index-admin.html")
	public String home() {
		return("index-admin");
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
	
	@RequestMapping("admin-ticket-closed.html")
	public String ticketClosed() {
		return("admin-ticket-closed");
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
	
	@RequestMapping("/error")
    public String handleError() {
        //do something like logging
        return "error";
    }

	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return "/error";
	}
	
	@RequestMapping("logout")
	public String logout(HttpSession session, SessionStatus status) {
		status.setComplete();
		session.removeAttribute("penggunaaktif");
		return "login";
	}
}
