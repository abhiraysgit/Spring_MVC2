package springmvc2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

/**
 * @author Abhishek
 *
 */
@Controller
public class SearchController {
	@RequestMapping("/user/{userId}/{userName}")
	public String getUserDetail(@PathVariable("userId") int id, @PathVariable("userName") String uN) {
		System.out.println(uN);
		System.out.println(id);
		//Integer.parseInt(uN);
		return "home";
	}

	@RequestMapping("/home")
	public String home() {
		System.out.println("Going To Home Page......");
		//String str = null;
		//System.out.println(str.length());
		return "home";
	}

	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {
		String url = "https://www.google.com/search?q=" + query;
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);

		return redirectView;
	}

	@ExceptionHandler(value = NullPointerException.class)
	public String exceptionHandlerNull(Model m) {
		m.addAttribute("msg", "Null Pointer Exception Has Occured.....!!!!!");

		return "null_page";
	}

	@ExceptionHandler(value = NumberFormatException.class)
	public String exceptionHandlerNumberFormet(Model m) {
		m.addAttribute("msg", "Number Formet Exception Has Occured.....!!!!!");

		return "null_page";
	}
}
