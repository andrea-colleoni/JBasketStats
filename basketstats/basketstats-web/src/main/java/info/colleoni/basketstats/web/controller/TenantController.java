/**
 * 
 */
package info.colleoni.basketstats.web.controller;

import info.colleoni.basketstats.domain.Tenant;
import info.colleoni.basketstats.service.TenantService;
import info.colleoni.basketstats.web.session.ContextData;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The Class TenantController.
 * 
 * @author acolleoni
 */
@Controller
@RequestMapping({"/tenant", "{tenantKey}/tenant"})
public class TenantController {

	/** The message source. */
	@Autowired
	private ContextData contextData;

	/** The tenant service. */
	@Autowired
	private TenantService tenantService;

	/**
	 * List.
	 * 
	 * @return the string
	 */
	@RequestMapping({ "/", "/list" })
	public void list(@ModelAttribute("model") ModelMap model) {
		model.addAttribute("contentFTL", "../tenant/list.ftl");
		model.addAttribute("allTenants", tenantService.all());
	}

	/**
	 * Creates the.
	 * 
	 * @param model
	 *            the model
	 * @return the string
	 */
	@RequestMapping({ "/create" })
	public void create(@ModelAttribute("model") ModelMap model) {
		model.addAttribute("tenant", new Tenant());
		model.addAttribute("contentFTL", "../tenant/form.ftl");
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
	@RequestMapping({ "/delete/{id}" })
	public void delete(@PathVariable("id") int id,
			@ModelAttribute("model") ModelMap model) {
		Tenant tenant = tenantService.get(id);
		if (tenant != null) {
			tenantService.delete(tenant);
		}
		list(model);
	}

	@RequestMapping({ "/get/{id}" })
	public void get(@PathVariable("id") int id,
			@ModelAttribute("model") ModelMap model) {
		Tenant tenant = tenantService.get(id);
		model.addAttribute("tenant", tenant);
		model.addAttribute("contentFTL", "../tenant/form.ftl");
	}
	
	@RequestMapping({ "/set" })
	public void set(@ModelAttribute("model") ModelMap model) {
		model.addAttribute("allTenants", tenantService.all());
		model.addAttribute("contentFTL", "../tenant/choose.ftl");
	}		
	
	@RequestMapping({ "/set/{id}" })
	public void set(@PathVariable("id") int id,
			@ModelAttribute("model") ModelMap model) {
		contextData.setTenant(tenantService.get(id));
		contextData.setLogOnTime(new Date());
		model.addAttribute("contentFTL", "home.ftl");
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
	public void form(@Valid Tenant tenant, BindingResult errors,
			@ModelAttribute("model") ModelMap model) {
		if (tenant.getId() <= 0) {
			tenantService.insert(tenant);
		} else {
			tenantService.update(tenant);
		}
		model.addAttribute("tenant", tenant);
		model.addAttribute("contentFTL", "../tenant/form.ftl");
	}

}
