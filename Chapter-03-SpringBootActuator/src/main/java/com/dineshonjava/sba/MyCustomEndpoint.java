/**
 * 
 */
package com.dineshonjava.sba;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.actuate.endpoint.Endpoint;
import org.springframework.stereotype.Component;

/**
 * @author Dinesh.Rajput
 *
 */
@Component
public class MyCustomEndpoint implements Endpoint<List<String>>{

	@Override
	public String getId() {
		return "myCustomEndpoint";
	}

	@Override
	public List<String> invoke() {
		// Custom logic to build the output
        List<String> list = new ArrayList<>();
        list.add("App message 1");
        list.add("App message 2");
        list.add("App message 3");
        list.add("App message 4");
        return list;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean isSensitive() {
		return true;
	}

}
