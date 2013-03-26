/**
 * 
 */
package info.colleoni.basketstats.web.controller;

import info.colleoni.basketstats.web.session.ContextData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author acolleoni
 * 
 */
@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	private ContextData contextData;

	@RequestMapping({ "/", "/home", "{tenantKey}/home" })
	public void home(@ModelAttribute("model") ModelMap model) {
		model.addAttribute("contentFTL", "home.ftl");
	}

}
