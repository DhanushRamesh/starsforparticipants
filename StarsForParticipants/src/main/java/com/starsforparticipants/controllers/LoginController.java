package com.starsforparticipants.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.starsforparticipants.models.LoginModal;
import com.starsforparticipants.models.UserModal;
import com.starsforparticipants.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	UserService userService;

	//load the register form
	@RequestMapping("/showlogin")
	public String showLogin(ModelMap model) {
		 model.addAttribute("loginModal", new LoginModal());
	      return "login";
}
	@RequestMapping("/traineeHome")
	public String traineeHome(ModelMap model) {
		 model.addAttribute("loginModal", new LoginModal());
	      return "traineeHome";
}

	@RequestMapping("/trainerHome")
	public String trainerHome(ModelMap model) {
		 model.addAttribute("loginModal", new LoginModal());
	      return "trainerHome";
}
	@RequestMapping("/adminHome")
	public String adminHome(ModelMap model) {
		 model.addAttribute("loginModal", new LoginModal());
	      return "adminHome";
}
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request,  ModelMap model, @ModelAttribute("loginModal") LoginModal loginData) {
		String forward = null;
		UserModal modal = null;
		modal = userService.getLoginUserData(loginData);
		
		if (modal == null) {
			
			forward = "login";
			model.addAttribute("loginFailed", "Userid not available");
		} else {
			if ("Trainer".equalsIgnoreCase(modal.getRole()))
				forward = "trainerHome";
			else if ("Trainee".equalsIgnoreCase(modal.getRole()))
				forward = "traineeHome";
			else if ("Admin".equalsIgnoreCase(modal.getRole()))
				forward = "adminHome";

			request.getSession().setAttribute("activeUser", modal);
		}
		

		return forward;
	}

}
