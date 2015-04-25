package com.ibm.wwwcmt.service;

import javax.inject.Named;

@Named
public class LoginService {
	private String username;
	private String password;
	
	public String login(){
//		FacesContext context = FacesContext.getCurrentInstance();
//	    HttpServetRequest request = (HttpServletRequest) 
//	        context.getExternalContext().getRequest();
//	    try {
//	      request.login(this.username, this.password);
//	    } catch (ServletException e) {
//	      context.addMessage(null, new FacesMessage("Login failed."));
//	      return "error";
//	    }
	    return "home";
	}
	
	public void logout(){
//		FacesContext context = FacesContext.getCurrentInstance();
//	    HttpServetRequest request = (HttpServletRequest) 
//	        context.getExternalContext().getRequest();
//	    try {
//	      request.logout();
//	    } catch (ServletException e) {
//	      context.addMessage(null, new FacesMessage("Logout failed."));
//	    }
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
