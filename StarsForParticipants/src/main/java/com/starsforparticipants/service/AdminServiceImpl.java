package com.starsforparticipants.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starsforparticipants.dao.AdminDao;
import com.starsforparticipants.models.CourseRequestModel;
import com.starsforparticipants.models.TrainerModel;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	AdminDao adminDao;
	@Override
	public List<CourseRequestModel> getAllCourseRequests() {
		
		return adminDao.getAllCourseRequests();
	}
	@Override
	public List<TrainerModel> getTrainerDetails() {
		// TODO Auto-generated method stub
		return adminDao.getTrainerDetails();
	}
	@Override
	public CourseRequestModel getCourseRequestById(int trainerId) {
		// TODO Auto-generated method stub
		return adminDao.getCourseRequestById(trainerId);
	}
	@Override
	public List<TrainerModel> getTrainerSuggestions(CourseRequestModel course) {
		
		return adminDao.getTrainerSuggestions(course);
	}

}
