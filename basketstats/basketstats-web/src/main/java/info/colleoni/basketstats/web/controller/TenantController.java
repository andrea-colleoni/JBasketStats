/**
 * 
 */
package info.colleoni.basketstats.web.controller;

import info.colleoni.basketstats.domain.Tenant;
import info.colleoni.basketstats.service.TenantService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author acolleoni
 * 
 */
@Controller
public class TenantController {

	@Autowired
	private MessageSource messageSource;

	@Autowired
	private TenantService tenantService;

	@ModelAttribute("allTenants")
	public List<Tenant> populateTenants() {
		return this.tenantService.all();
	}

	@RequestMapping({ "/", "/tenant/list" })
	public String home() {
		return "/tenant/list";
	}

}