package com.starsforparticipants.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starsforparticipants.dao.TraineeDao;
import com.starsforparticipants.models.CourseRequestModel;
import com.starsforparticipants.models.UserModal;


@Service
public class TraineeServiceImpl implements TraineeService {

	@Autowired
	private TraineeDao traineeDao;
	@Override
	public void addCourseRequest(CourseRequestModel courseRequest) {
		// TODO Auto-generated method stub
		traineeDao.addCourseRequest(courseRequest);
	}
	@Override
	public boolean hasCourseRequested(CourseRequestModel courseModel) {
		// TODO Auto-generated method stub
		return traineeDao.hasCourseRequested(courseModel);
	}
	@Override
	public List<UserModal> getAssignedTrainees(UserModal activeUser) {
		// TODO Auto-generated method stub
		return traineeDao.getAssignedTrainees(activeUser);
	}

}
