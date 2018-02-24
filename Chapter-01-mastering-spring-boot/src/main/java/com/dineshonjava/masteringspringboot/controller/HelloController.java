/**
 * 
 */
package com.dineshonjava.masteringspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dinesh.Rajput
 *
 */
@RestController
public class HelloController {
	
	@GetMapping("/hello")
	String sayHello(){
		return "Hello World!!!";
	}

}
