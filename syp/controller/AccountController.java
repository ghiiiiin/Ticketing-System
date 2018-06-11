package com.example.syp.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.validator.constraints.SafeHtml.Attribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.example.syp.component.EmailServiceImpl;
import com.example.syp.model.Account;
import com.example.syp.model.Agent;
import com.example.syp.model.Employee;
import com.example.syp.model.PriorityStatus;
import com.example.syp.service.AccountService;
import com.example.syp.service.AgentService;
import com.example.syp.service.EmployeeService;
import com.example.syp.service.PriorityStatusService;

@Controller
@SessionAttributes("penggunaaktif")
public class AccountController {
	
	public List<Account> la = new ArrayList<>();
	public List<Agent> lag = new ArrayList<>();
	
	@Autowired
	EmailServiceImpl emailServiceImpl;
	
	@Autowired
	private AccountService accountService;
	
	@Autowired
	private AgentService agentService;
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private PriorityStatusService priorityStatusService;
	
	@RequestMapping("/halamanlogin")
	public String bukaLogin() {
		return "login";
	}
	
	@RequestMapping(value="login", method= RequestMethod.POST)
	public ModelAndView loginAja(@ModelAttribute("Account") Account a) {
		ModelAndView mav = new ModelAndView();
		Account penggunaaktif = accountService.getLogin(a.getEmail(), a.getPassword());
		mav.addObject("penggunaaktif", penggunaaktif);
		mav.setViewName("index");
		emailServiceImpl.sendMessage("gh.assyifa@gmail.com", "test", "wadaw");
//		if(ac.getId()==1) {
//			mav.setViewName("index");
//		}
//		else {
//			mav.setViewName("user-home");
//		}
		return mav;
		
	}
	

	@RequestMapping(value="/adduser",method=RequestMethod.POST)
	public ModelAndView goPerson(@ModelAttribute("account")Account account) {
		accountService.SaveOrUpdate(account);
		return new ModelAndView("account","listaccount",accountService.getAll());
	}
	@RequestMapping(value="/adduser",method=RequestMethod.GET)
	public ModelAndView goPersonafterUpdate(@ModelAttribute("account")Account account) {
		return new ModelAndView("account","listaccount",accountService.getAll());
	}
	
//	@RequestMapping(value="/admin-list-user.html",method=RequestMethod.POST)
//	public ModelAndView addUser(@RequestParam("employeeid")long id, @ModelAttribute("account")Account a){
//		List<Employee> le = employeeService.getAll();
//    	a.setEmployee(le.get((int) (id-1)));
//    	la.add(a);
//		accountService.SaveOrUpdate(a);
//		return new ModelAndView("admin-list-user","listaccount",accountService.getAll());
//	}
	
	@RequestMapping(value="/admin-list-agent.html",method=RequestMethod.POST)
	public ModelAndView addAgent(@RequestParam("accountid")long id, @ModelAttribute("agent")Agent a){
		List<Account> lacc = accountService.getAll();
    	a.setAccount(lacc.get((int) (id-1)));
    	lag.add(a);
		agentService.SaveOrUpdate(a);
		return new ModelAndView("admin-list-agent","listagent",agentService.getAll());
	}
	


	@RequestMapping(value="admin-add-user.html",method=RequestMethod.GET)
	public ModelAndView adminFormAdd(){
		ModelAndView mav = new ModelAndView();
		List<PriorityStatus> lp = priorityStatusService.getAll();
		mav.setViewName("admin-add-user");
		mav.addObject("Employee", new Employee());
		mav.addObject("Account", new Account());
		mav.addObject("listPriority", lp);
		return mav;
	}
	
	@RequestMapping(value="admin-add-user.html",method=RequestMethod.POST)
	public String adminAdd(@RequestParam("employeeName")String employeeName, @RequestParam("position")String position,
			@RequestParam("email")String email,@RequestParam("password")String password, 
			@RequestParam("priorityStatus") Long priorityStatus){
		Employee e = new Employee();
		Account a = new Account();
		PriorityStatus p = priorityStatusService.getById(priorityStatus);
		e.setEmployeeName(employeeName);
		e.setPosition(position);
		a.setEmail(email);
		a.setPassword(password);
		a.setPriorityStatus(p);
		accountService.Save(e, a);
		return "redirect: admin-list-user.html";
	}

	
	
//	@RequestMapping(value="/admin-list-agent.html",method=RequestMethod.GET)
//	public ModelAndView formAddAgent(){
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("admin-list-agent");
//		List<Employee> le = employeeService.getAll();
//		List<PriorityStatus> lp = priorityStatusService.getAll();
//		mav.addObject("Agent", new Agent());
//		mav.addObject("Account", new Account());
//		mav.addObject("Employee", le);
//		mav.addObject("Priority", lp);
//		return mav;
//	}
//	
//	
//	@RequestMapping(value="/admin-list-agent.html",method=RequestMethod.POST)
//	public ModelAndView addAgent(@RequestParam("employeeid") long employeeid,@RequestParam("agentName") String agentName,
//			@RequestParam("email")String email, @RequestParam("password") String password,@RequestParam("priorityStatus") long priorityStatus
//			, @ModelAttribute("Account") Account acc){
//		List<Employee> le = employeeService.getAll();
//    	acc.setEmployee(le.get((int) (employeeid-1)));
//    	la.add(acc);
//		Agent a = new Agent();
//		a.setAgentName(agentName);
//		Account ac = new Account();
//		ac.setEmail(email);
//		ac.setPassword(password);
//		PriorityStatus p = priorityStatusService.getId(priorityStatus);
//		p.getId();
//		agentService.SaveOrUpdate(a, ac);
//		accountService.SaveOrUpdate(acc);
//		
//		return new ModelAndView("admin-list-agent","listagent", agentService.getAll());
//	}
	
//	@RequestMapping(value="/adda",method=RequestMethod.POST)
//	public ModelAndView goTicket1(@RequestParam("employeeid")long id, @ModelAttribute("agent")Agent a
//			, @ModelAttribute("account")Account ac){
//		List<Account> lac = accountService.getAll();
//    	a.setAccount(lac.get((int) (id-1)));
//    	List<Employee> le = employeeService.getAll();
//    	ac.setEmployee(le.get((int) (id-1)));
//    	la.add(ac);
//    	lag.add(a);
//		agentService.SaveOrUpdate(a);
//		accountService.SaveOrUpdate(ac);
//		return new ModelAndView("admin-list-agent","listagent",accountService.getAll());
//	}

	
}
