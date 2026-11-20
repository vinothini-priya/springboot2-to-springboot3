/**
 * 
 */
package com.dineshonjava.sbsecurity.service;

import jakarta.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.dineshonjava.sbsecurity.bean.CurrentUser;
import com.dineshonjava.sbsecurity.model.User;

/**
 * @author Dinesh.Rajput
 *
 */
@Service
public class CurrentUserDetailsService implements UserDetailsService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CurrentUserDetailsService.class);
	
	@Inject
	UserService userService;
	
	@Override
	public UserDetails loadUserByUsername(String email)
			throws UsernameNotFoundException {
		LOGGER.debug("Authenticating user with email={}", email.replaceFirst("@.*", "@***"));
		User user = userService.getUserByEmail(email);
		return new CurrentUser(user);
	}

}
