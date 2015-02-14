package com.ibm.wwwcmt.security;

import java.security.acl.Group;

import javax.security.auth.login.LoginException;

import org.jboss.security.auth.spi.UsernamePasswordLoginModule;

public class CustomLogin extends UsernamePasswordLoginModule{

	@Override
	protected String getUsersPassword() throws LoginException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Group[] getRoleSets() throws LoginException {
		// TODO Auto-generated method stub
		return null;
	}

}
