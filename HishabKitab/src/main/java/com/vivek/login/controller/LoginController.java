package com.vivek.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	String message = "Welcome to Spring MVC!";
	 
	@RequestMapping("/login")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
 
		ModelAndView mv = new ModelAndView("LoginPage");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}
}