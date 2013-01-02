/**
 * 
 */
package info.colleoni.basketstats.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author acolleoni
 * 
 */
@Controller
public class HomeController {

	@RequestMapping({ "/", "/home" })
	public String home() {
		return "home";
	}

}
