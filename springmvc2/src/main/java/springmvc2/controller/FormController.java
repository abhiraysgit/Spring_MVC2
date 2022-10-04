package springmvc2.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class FormController {
	@RequestMapping("/complex")
	public String showForm() {

		return "complex_form";
	}

	@RequestMapping(path = "/handleform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute("student") Student student, BindingResult result) {
		if (result.hasErrors()) {
			return "complex_form";

		}
		System.out.println(student);
		System.out.println(student.getAddress());
		return "success";
	}

	/*
	 * @RequestMapping(path = "/handleform", method = RequestMethod.POST) public
	 * String handleForm(@RequestParam("name") String name, @RequestParam("id")
	 * String id,
	 * 
	 * @RequestParam("courses") List<String> courses, @RequestParam("gender") String
	 * gender,
	 * 
	 * @RequestParam("type") String type) { System.out.println(name);
	 * System.out.println(id); System.out.println(courses);
	 * System.out.println(gender); System.out.println(type);
	 * 
	 * return "success"; }
	 */

}
