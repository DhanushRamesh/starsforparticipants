package com.starsforparticipants.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.starsforparticipants.models.CourseRequestModel;
import com.starsforparticipants.models.TrainerModel;
import com.starsforparticipants.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@RequestMapping("/adminhome")
	public String printHello(ModelMap model) {
	      model.addAttribute("message", "Hello Spring MVC Framework!");
	      return "adminlogin";
}
	
	@RequestMapping("/listRequests")
	public String showRequests(ModelMap model) {
		List<CourseRequestModel> courseRequests = new ArrayList<>();
		courseRequests = adminService.getAllCourseRequests();
		model.addAttribute("courseRequests",courseRequests);
		return "allRequests";
	}
	
	
	@RequestMapping("/trainerDetails")
	public String showTrainerDetails(ModelMap model) {
		List<TrainerModel> trainerDetails = new ArrayList<>();
		trainerDetails = adminService.getTrainerDetails();
		model.addAttribute("trainerDetails",trainerDetails);
		return "trainerDetails";
	}
	
	@RequestMapping("/viewRequest/{traineeId}")
	public String viewRequest(ModelMap map, @PathVariable String traineeId) {
		CourseRequestModel course = adminService.getCourseRequestById(Integer.parseInt(traineeId));
		List<TrainerModel> trainerList = adminService.getTrainerSuggestions(course);
		map.addAttribute("course",course);
		map.addAttribute("trainerList",trainerList);
		map.addAttribute("traineeId",traineeId);
		return "viewRequest";
	}
	
	@RequestMapping("/createCourseRequest")
	public String createCourseRequest(HttpServletRequest request, ModelMap map) {
		int traineeId = Integer.parseInt(request.getParameter("traineeId"));
		String userid = request.getParameter("selectedTrainer");
		adminService.createCourseRequest(traineeId,userid);
		return "viewRequest";
	}
}