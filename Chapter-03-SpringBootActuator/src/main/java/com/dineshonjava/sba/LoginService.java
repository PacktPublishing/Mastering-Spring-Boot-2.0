/**
 * 
 */
package com.dineshonjava.sba;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.stereotype.Service;

/**
 * @author Dinesh.Rajput
 *
 */
@Service
public class LoginService {
	
	
	CounterService counterService;
	
	@Autowired
	public LoginService(CounterService counterService) {
        this.counterService = counterService;
        doLogin();
    }
	
	public boolean login(String userName, String password) {
		boolean success;
		if (userName.equals("admin") && "secret".equals(password)) {
			counterService.increment("counter.login.success");
			success = true;
		}
		else {
			counterService.increment("counter.login.failure");
			success = false;
		}
		return success;
	}
	
	private void doLogin() {
		for(int i=0;i<10;i++){
			login("admin", "secret");
		}
		login("admin", "scret");
		login("admin", "scret");
	}
}
