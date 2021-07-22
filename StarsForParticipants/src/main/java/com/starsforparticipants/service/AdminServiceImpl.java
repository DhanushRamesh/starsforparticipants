package com.starsforparticipants.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starsforparticipants.dao.AdminDao;
import com.starsforparticipants.models.CourseRequestModel;
import com.starsforparticipants.models.UserModal;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	AdminDao adminDao;
	@Override
	public List<CourseRequestModel> getAllCourseRequests() {
		
		return adminDao.getAllCourseRequests();
	}
	@Override
	public List<UserModal> getTrainerDetails() {
		// TODO Auto-generated method stub
		return adminDao.getTrainerDetails();
	}

}
