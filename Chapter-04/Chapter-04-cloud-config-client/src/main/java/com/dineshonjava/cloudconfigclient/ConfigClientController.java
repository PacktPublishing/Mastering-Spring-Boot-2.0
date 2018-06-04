/**
 * 
 */
package com.dineshonjava.cloudconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dinesh.Rajput
 *
 */
@RestController
public class ConfigClientController {
	
	@Value("${user.role}")
    private String role;
	
	@GetMapping("/profile/{name}")
	public String getActiveProfile(@PathVariable String name){
		return "Hello "+name+"! active profile name is "+role;
	}
}
