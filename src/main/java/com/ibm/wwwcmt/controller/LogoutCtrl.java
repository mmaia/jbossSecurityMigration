package com.ibm.wwwcmt.controller;

import java.io.IOException;

import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named("logoutCtrl")
public class LogoutCtrl {
	
	public void logout(){
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		//redirect to initial default context of this app..
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("/jbossSecurity");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
