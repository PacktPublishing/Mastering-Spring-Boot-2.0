package com.dineshonjava.customerservice.domain;

import java.io.Serializable;

/**
 * 
 * @author Dinesh.Rajput
 *
 */
public class Notification implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
    private String message;
    private String email;
    private String mobile;
    
    public Notification() {
		super();
	}
    
	public Notification(String message, String email, String mobile) {
		super();
		this.message = message;
		this.email = email;
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Notification [message=" + message + ", email=" + email + ", mobile="
				+ mobile + "]";
	}
}
