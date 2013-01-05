/**
 * 
 */
package info.colleoni.basketstats.web.controller;

import info.colleoni.basketstats.domain.Tenant;
import info.colleoni.basketstats.service.TenantService;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The Class TenantController.
 *
 * @author acolleoni
 */
@Controller
@RequestMapping("/tenant")
public class TenantController {

	/** The message source. */
	@Autowired
	private MessageSource messageSource;

	/** The tenant service. */
	@Autowired
	private TenantService tenantService;

	/**
	 * Populate tenants.
	 *
	 * @return the list
	 */
	@ModelAttribute("allTenants")
	public List<Tenant> populateTenants() {
		return this.tenantService.all();
	}
	
	/** The tenant. */
	private Tenant tenant;
	
	/**
	 * Gets the tenant.
	 *
	 * @return the tenant
	 */
	@ModelAttribute("tenant")
	public Tenant getTenant() {
		return this.tenant;
	}	

	/**
	 * List.
	 *
	 * @return the string
	 */
	@RequestMapping({ "/", "/list" })
	public String list() {
		return "/tenant/list";
	}

	/**
	 * Creates the.
	 *
	 * @param model the model
	 * @return the string
	 */
	@RequestMapping({ "/", "/create" })
	public String create(Model model) {
		this.tenant = new Tenant();
		return "/tenant/form";
	}

	/**
	 * Form.
	 *
	 * @param tenant the tenant
	 * @param errors the errors
	 * @param model the model
	 * @return the string
	 */
	@RequestMapping({ "/", "/process" })
	public String form(@Valid Tenant tenant, BindingResult errors,
			Map<String, Object> model) {
		tenantService.insert(tenant);
		this.tenant = tenant;
		return "/tenant/form";
	}

}
