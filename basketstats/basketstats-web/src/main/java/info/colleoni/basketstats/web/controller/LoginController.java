package info.colleoni.basketstats.web.controller;

import info.colleoni.basketstats.domain.User;
import info.colleoni.basketstats.service.TenantService;
import info.colleoni.basketstats.service.UserService;
import info.colleoni.basketstats.web.session.ContextData;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * The Class LoginController.
 */
@Controller
@RequestMapping("/")
public class LoginController {
	
	Logger logger = LoggerFactory.getLogger(LoginController.class);

	/** The context data. */
	@Autowired
	private ContextData contextData;

	/** The user service. */
	@Autowired
	private UserService userService;

	/** The tenant service. */
	@Autowired
	private TenantService tenantService;
	
	/**
	 * Do Login.
	 *
	 * @param tenantKey the tenant key
	 * @param username the username
	 * @param password the password
	 * @param model the model
	 * @return the string
	 */
	@RequestMapping({ "doLogin", "{tenantKey}/doLogin" })
	public void doLogin(@RequestParam("username") String username,
			@RequestParam("password") String password,
			@ModelAttribute("model") ModelMap model,
			HttpServletResponse response) {
		logger.debug("Logging in...");
		List<User> users = userService.byUsername(username, contextData.getTenantKey());
		if ("".equals(contextData.getTenantKey()) && users.size() == 1) {
			// try to guess tenant
			contextData.setTenant(tenantService.get(users.get(0).getTenantId()));
			logger.info("Autodiscovered tenant => " + contextData.getTenantKey());	
		} else if ("".equals(contextData.getTenantKey())) {
			logger.info("Unable to autodiscover tenant for user => " + username);
		} else {
			logger.info("Tenant already set => " + contextData.getTenantKey());
		}
		// verify user
		if (userService.verify(username, password, contextData.getTenantKey())) {
			contextData.setTenant(tenantService.byKey(contextData.getTenantKey()));
			contextData.setUser(users.get(0));
			logger.info(contextData.getUser().getUsername() + " logged in");	
			if (contextData.getLastRequestUrl() != null && !"".equals(contextData.getLastRequestUrl())) {
				try {
					response.sendRedirect(contextData.getLastRequestUrl());
				} catch (IOException e) {
					logger.error("Exception while redirecting", e);
				}
			}
		} else {
			logger.info(username + " failed to login");	
			model.addAttribute("ERROR", "Invalid UserName and Password");
		}
		logger.debug("Done.");
	}	
	
	@RequestMapping({ "doLogout", "{tenantKey}/doLogout" })
	public void doLogout(@ModelAttribute("model") ModelMap model,
			HttpServletResponse response) {
		String username = contextData.getUser().getUsername();
		contextData.setUser(null);
		logger.info(username + " logged out");		
		model.addAttribute("contentFTL", "home.ftl");
	}

	/**
	 * Login.
	 *
	 * @param tenantKey the tenant key
	 * @param model the model
	 * @return the string
	 */
	@RequestMapping({ "login", "{tenantKey}/login" })
	public void login(@ModelAttribute("model") ModelMap model) {
		logger.debug("Setting login view");
		model.addAttribute("contentFTL", "login.ftl");
	}
}
