package com.example.syp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.syp.model.Account;
import com.example.syp.model.Agent;
import com.example.syp.service.AccountService;
import com.example.syp.service.AgentService;

@RestController
public class AccountRestController {

	@Autowired
	AccountService accountService;
	
	@Autowired
	AgentService agentService;
	
	@RequestMapping("/API/isEmailExist")
	public boolean isEmailExist(@RequestParam("email") String email) {
		return accountService.getExistEmail(email);
	}
	
	@RequestMapping("/listuser")
	public List<Account> tampil2(){
		return accountService.getAlll();
	}
	
	@RequestMapping("/listagent")
	public List<Agent> tampil(){
		return agentService.getAll();
	}
}
