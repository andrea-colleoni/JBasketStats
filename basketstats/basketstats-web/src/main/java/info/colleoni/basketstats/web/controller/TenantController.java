/**
 * 
 */
package info.colleoni.basketstats.web.controller;

import info.colleoni.basketstats.domain.Tenant;
import info.colleoni.basketstats.service.TenantService;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

	/**
	 * List.
	 * 
	 * @return the string
	 */
	@RequestMapping({ "/", "/list" })
	public String list(@ModelAttribute("model") ModelMap model) {
		model.addAttribute("contentFTL", "../tenant/list.ftl");
		model.addAttribute("allTenants", this.tenantService.all());
		return "shared/layout";
	}

	/**
	 * Creates the.
	 * 
	 * @param model
	 *            the model
	 * @return the string
	 */
	@RequestMapping({ "/create" })
	public String create(@ModelAttribute("model") ModelMap model) {
		model.addAttribute("tenant", new Tenant());
		model.addAttribute("contentFTL", "../tenant/form.ftl");
		return "shared/layout";
	}

	/**
	 * Delete.
	 * 
	 * @param id
	 *            the id
	 * @param model
	 *            the model
	 * @return the string
	 */
	@RequestMapping({ "/delete" })
	public String delete(@RequestParam("id") int id,
			@ModelAttribute("model") ModelMap model) {
		Tenant tenant = tenantService.get(id);
		if (tenant != null) {
			tenantService.delete(tenant);
		}
		return list(model);
	}

	@RequestMapping({ "/get" })
	public String get(@RequestParam("id") int id,
			@ModelAttribute("model") ModelMap model) {
		Tenant tenant = tenantService.get(id);
		model.addAttribute("tenant", tenant);
		model.addAttribute("contentFTL", "../tenant/form.ftl");
		return "shared/layout";
	}

	/**
	 * Form.
	 * 
	 * @param tenant
	 *            the tenant
	 * @param errors
	 *            the errors
	 * @param model
	 *            the model
	 * @return the string
	 */
	@RequestMapping({ "/process" })
	public String form(@Valid Tenant tenant, BindingResult errors,
			@ModelAttribute("model") ModelMap model) {
		if (tenant.getId() <= 0) {
			tenantService.insert(tenant);
		} else {
			tenantService.update(tenant);
		}
		model.addAttribute("tenant", tenant);
		model.addAttribute("contentFTL", "../tenant/form.ftl");
		return "shared/layout";
	}

}
