package com.starsforparticipants.controllers;

import java.sql.SQLException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.starsforparticipants.models.LoginModal;
import com.starsforparticipants.models.RegistrationModel;
import com.starsforparticipants.models.UserModal;
import com.starsforparticipants.service.UserService;

@Controller
public class BaseController {
	
	@Autowired
	private UserService userService;
	
	@InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(true);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
    }
	
	//to load the home page
	@RequestMapping("/home")
	public String loadHome(ModelMap model) {
		return "welcome";
}
	
	
	//load the register form
	@RequestMapping("/register")
	public String register(ModelMap model) throws ClassNotFoundException, SQLException {
		RegistrationModel modal =  new RegistrationModel();
		//add a method in the service layer to get the list of locations.
		List<String> locations = new ArrayList<>();
		locations.add("Chennai");
		locations.add("Delhi");
		locations.add("Bombay");
		model.addAttribute("locations", locations);
	    model.addAttribute("command", new RegistrationModel());
		return "adminlogin";
}
	
	
	//adds the user to the database
	@RequestMapping("/addUser")
	public String addUser(ModelMap model, @ModelAttribute("SpringWeb") RegistrationModel userDetails) {
		UserModal user = new UserModal();
		BeanUtils.copyProperties(userDetails, user);
		UserModal registeredUser = userService.addUser(user);
		if (registeredUser != null) {
			model.addAttribute("registrationStatus", true);
		} else {
			model.addAttribute("registrationStatus",false);
		}
		model.addAttribute("command", registeredUser);
		return "registerationSuccess";
	}
	
	
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request) {
		
		request.getSession().invalidate();
		return "welcome";
	}
	
	@RequestMapping("/aboutUs")
	public String loadAbout(ModelMap model) {
		return "About Us";
}
	
	/*
	 * @RequestMapping(value="/adminlogin",method=RequestMethod.GET) public String
	 * adminlogin(ModelMap model){ RegistrationModel modal = new
	 * RegistrationModel(); model.addAttribute("command", new RegistrationModel());
	 * return "AdminCheck";
	 * 
	 * }
	 * 
	 * @RequestMapping(method=RequestMethod.POST) public String checkLogin(ModelMap
	 * model,@ModelAttribute("adminModal") AdminModal adminModal) { if(adminModal
	 * !=null && adminModal.getUserid() !=null & adminModal.getPassword()!=null) {
	 * if(adminModal.getUserid().equals("admin1")&&
	 * adminModal.getPassword().equals("password1")) { model.addAttribute("msg",
	 * adminModal.getUserid()); return "adminHome"; } else {
	 * model.addAttribute("error","Invalid Details"); return "AdminCheck"; } } else
	 * { model.addAttribute("error","Please enter the details"); return
	 * "AdminCheck"; }
	 * 
	 * 
	 * }
	 */

}


