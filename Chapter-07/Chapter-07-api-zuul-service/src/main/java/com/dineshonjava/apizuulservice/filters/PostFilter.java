/**
 * 
 */
package com.dineshonjava.apizuulservice.filters;

import com.netflix.zuul.ZuulFilter;

/**
 * @author Dinesh.Rajput
 *
 */
public class PostFilter extends ZuulFilter {
	 
	@Override
	public String filterType() {
		return "post";	
	}
	 
	@Override
	public int filterOrder() {
		return 1;
	}
	 
	@Override
	public boolean shouldFilter() {
		return true;
	}
	 
	@Override
	public Object run() {
		System.out.println("Inside Post Filter");
		return null;
	}

}
