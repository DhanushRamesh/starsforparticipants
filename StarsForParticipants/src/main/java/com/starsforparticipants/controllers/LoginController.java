package com.starsforparticipants.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	

	//load the register form
	@RequestMapping("/login")
	public String register(ModelMap model) {
	      return "login";
}

}
