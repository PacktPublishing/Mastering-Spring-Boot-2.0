package com.dineshonjava.masteringspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MasteringSpringBootApplication {

	public static void main(String[] args) {
		//System.setProperty("spring.config.name", "myapp");
		SpringApplication.run(MasteringSpringBootApplication.class, args);
	}
}
