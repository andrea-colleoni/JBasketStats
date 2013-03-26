/**
 * 
 */
package info.colleoni.basketstats.web.controller;

import info.colleoni.basketstats.domain.Person;
import info.colleoni.basketstats.service.PersonService;
import info.colleoni.basketstats.web.session.ContextData;

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
@RequestMapping("{tenantKey}/people")
public class PeopleController {


	@Autowired
	private ContextData contextData;

	@Autowired
	private PersonService personService;

	/**
	 * List.
	 * 
	 * @return the string
	 */
	@RequestMapping({ "/", "/list" })
	public void list(@ModelAttribute("model") ModelMap model) {
		model.addAttribute("contentFTL", "../people/personList.ftl");
		model.addAttribute("allPersons", personService.allByTenant(contextData.getTenantKey()));
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
		model.addAttribute("person", new Person());
		model.addAttribute("contentFTL", "../people/personForm.ftl");
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
		Person person = personService.get(id);
		if (person != null) {
			personService.delete(person);
		}
		list(model);
	}

	@RequestMapping({ "/get/{id}" })
	public void get(@PathVariable("id") int id,
			@ModelAttribute("model") ModelMap model) {
		Person person = personService.get(id);
		model.addAttribute("person", person);
		model.addAttribute("contentFTL", "../people/personForm.ftl");
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
	public void form(@Valid Person person, BindingResult errors,
			@ModelAttribute("model") ModelMap model) {
		if (contextData != null) {
			person.setTenant(contextData.getTenant());
			if (person.getId() <= 0) {
				personService.insert(person);
			} else {
				personService.update(person);
			}
			model.addAttribute("person", person);
			model.addAttribute("contentFTL", "../people/personForm.ftl");
		} else {
			model.addAttribute("contentFTL", "../shared/no_content.ftl");
		}
	}

}
