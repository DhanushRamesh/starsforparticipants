package com.starsforparticipants.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.starsforparticipants.models.CourseRequestModel;
import com.starsforparticipants.models.UserModal;
import com.starsforparticipants.service.TrainerService;

@Controller
public class TrainerController {
	
	@Autowired
	TrainerService trainerService;
	
	@RequestMapping("/showTraineeRequests")
	public String showTraineeRequests(HttpServletRequest request, ModelMap model) {
		UserModal activeUser = (UserModal) request.getSession().getAttribute("activeUser");
		int trainerId = activeUser.getId();
		CourseRequestModel course = trainerService.getTraineeRequests(trainerId);
		model.addAttribute("courseRequest",course);
		return "traineeRequests";
	}
	
	@RequestMapping("/nominate")
	public String nominate(ModelMap model, HttpServletRequest request) {
		
		UserModal userModal = (UserModal) request.getSession().getAttribute("activeUser");
		trainerService.nominate(userModal.getId());
		return "traineeRequests";
	}
	
	@RequestMapping("/confirmRequest")
	public String confirmRequest(ModelMap model, HttpServletRequest request) {
		
		int traineeId = Integer.parseInt(request.getParameter("traineeId"));
		int trainerId = Integer.parseInt(request.getParameter("trainerId"));
		trainerService.confirmRequest(trainerId,traineeId);
		return "adminHome";
	}
	
	
	@RequestMapping("/notifyTrainer")
	public String notifyTrainer(ModelMap model, HttpServletRequest request) {
		
		UserModal activeUser = (UserModal) request.getSession().getAttribute("activeUser");
		List<UserModal> trainees = trainerService.getAssignedTrainees(activeUser);
		model.addAttribute("trainees", trainees);
		return "notification";
		
	}
	
	

}
