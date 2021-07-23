package com.starsforparticipants.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.starsforparticipants.models.CourseRequestModel;
import com.starsforparticipants.models.UserModal;
import com.starsforparticipants.service.TraineeService;

@Controller
public class TraineeController {
	
	@Autowired
	private TraineeService traineeService;
	
	@RequestMapping("/raiseRequest")
	public String loadRequestPage(ModelMap model) {
		CourseRequestModel courseRequest = new CourseRequestModel();
		//move the logic to service layer.
		List<String> courses = new ArrayList<>();
		courses.add("Java");
		courses.add("C");
		courses.add("C++");
		courses.add("Python");
		courses.add("HTML");
		courseRequest.setSubjectList(courses);
		List<String> locations = new ArrayList<>();
		locations.add("Chennai");
		locations.add("Delhi");
		locations.add("Bombay");
		courseRequest.setLocationList(locations);
		model.addAttribute("locationList",locations );
		model.addAttribute("subjectList",courses );
		model.addAttribute("requestModal",courseRequest );
		return "raiseRequest";
	}
	
	@RequestMapping("/createRequest")
	public String createRequest(HttpServletRequest request,   ModelMap  model, @ModelAttribute("requestModel") CourseRequestModel courseModel) {
		String forward = "raiseRequest";
		UserModal activeUser = (UserModal) request.getSession().getAttribute("activeUser");
		courseModel.setId(activeUser.getId());
		if (traineeService.hasCourseRequested(courseModel)) {
			forward = "requestErrorPage";
		} else {
			traineeService.addCourseRequest(courseModel);
			model.addAttribute("requestModal", courseModel);
		}
		return forward;
	}
	
	@RequestMapping("/notifyTrainee")
	public String notifyTrainer(ModelMap model, HttpServletRequest request) {
		
		UserModal activeUser = (UserModal) request.getSession().getAttribute("activeUser");
		List<UserModal> trainees = traineeService.getAssignedTrainees(activeUser);
		model.addAttribute("trainees", trainees);
		return "traineenotification";
		
	}

}
