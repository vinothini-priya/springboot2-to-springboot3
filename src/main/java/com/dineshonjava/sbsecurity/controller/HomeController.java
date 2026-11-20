/**
 * 
 */
package com.dineshonjava.sbsecurity.controller;

import jakarta.ws.rs.Path;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

/**
 * @author Dinesh.Rajput
 *
 */
@Controller
public class HomeController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);
	
	@Path("/")
    public String getHomePage() {
		LOGGER.debug("Getting home page");
        return "home";
    }
}
