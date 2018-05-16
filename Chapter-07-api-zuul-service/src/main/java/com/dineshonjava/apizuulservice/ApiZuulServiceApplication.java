package com.dineshonjava.apizuulservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.dineshonjava.apizuulservice.filters.ErrorFilter;
import com.dineshonjava.apizuulservice.filters.PostFilter;
import com.dineshonjava.apizuulservice.filters.PreFilter;
import com.dineshonjava.apizuulservice.filters.RouteFilter;


@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class ApiZuulServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiZuulServiceApplication.class, args);
	}
	
	@Bean
	public PreFilter preFilter() {
	    return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
	    return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
	    return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
	    return new RouteFilter();
	}
}
