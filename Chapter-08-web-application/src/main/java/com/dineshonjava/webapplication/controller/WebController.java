/**
 * 
 */
package com.dineshonjava.webapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.dineshonjava.webapplication.service.AccountService;

/**
 * @author Dinesh.Rajput
 *
 */
@Controller
public class WebController {
	
	@Autowired
	AccountService accountService;
	
	@GetMapping("/")
	String home(){
		return "home";
	}
	
	@GetMapping("/accounts")
	String all(ModelMap model){
		model.put("accounts", accountService.findByCutomer(null));
		return "accounts";
	}
}
