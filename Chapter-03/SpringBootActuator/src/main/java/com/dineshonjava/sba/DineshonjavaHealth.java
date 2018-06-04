/**
 * 
 */
package com.dineshonjava.sba;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author Dinesh.Rajput
 *
 */
@Component
public class DineshonjavaHealth implements HealthIndicator{

	@Override
	public Health health() {
		try {
			RestTemplate rest = new RestTemplate();
			rest.getForObject("https://www.dineshonjavaa.com", String.class);
			return Health.up().build();
		} catch (Exception e) {
			return Health.down().withDetail("reason", e.getMessage()).build();
		}
	}

}
