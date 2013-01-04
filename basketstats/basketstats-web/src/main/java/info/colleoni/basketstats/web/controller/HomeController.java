/**
 * 
 */
package info.colleoni.basketstats.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author acolleoni
 * 
 */
@Controller
public class HomeController {
	
	@Autowired
	private MessageSource messageSource;

	@RequestMapping({ "/", "/home" })
	public String home() {
		return "home";
	}

}
