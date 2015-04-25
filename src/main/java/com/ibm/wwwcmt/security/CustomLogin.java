package com.ibm.wwwcmt.security;

import java.security.acl.Group;
import java.util.Map;

import javax.security.auth.Subject;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.login.LoginException;

import org.jboss.logging.Logger;
import org.jboss.security.SimpleGroup;
import org.jboss.security.SimplePrincipal;
import org.jboss.security.auth.spi.UsernamePasswordLoginModule;

public class CustomLogin extends UsernamePasswordLoginModule {
	
	Logger logger = Logger.getLogger(CustomLogin.class);

	@SuppressWarnings("rawtypes")
	public void initialize(Subject subject, CallbackHandler callbackHandler,
			Map sharedState, Map options) {
		log.info("WWWCMT: Executing CustomLogin.initialize");
		super.initialize(subject, callbackHandler, sharedState, options);
	}

	@Override
	protected String getUsersPassword() throws LoginException {
		log.info("WWWCMT: Executing CustomLogin.getUserPassword");
		String password = super.getUsername();
		//TODO - Does nothing so far. need to implement this in future.
        return password;
	}

	@Override
	protected Group[] getRoleSets() throws LoginException {
		log.info("WWWCMT: Executing CustomLogin.getRoleSets");
		SimpleGroup group = new SimpleGroup("Roles");
        try {
            group.addMember(new SimplePrincipal("user_role"));
        } catch (Exception e) {
            throw new LoginException("Failed to create group member for " + group);
        }
        return new Group[] { group };
	}

}
