/**
 * 
 */
package com.dineshonjava.webapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.dineshonjava.webapplication.service.WebAccountsService;

/**
 * @author Dinesh.Rajput
 *
 */
@Controller
public class WebController {
	
	@Autowired
	WebAccountsService accountsService;
	
	@GetMapping("/")
	String home(){
		return "home";
	}
	
	@GetMapping("/accounts")
	String all(ModelMap model){
		model.put("accounts", accountsService.getAllAccounts());
		return "accounts";
	}
}
