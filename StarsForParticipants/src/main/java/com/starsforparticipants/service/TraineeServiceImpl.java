package com.starsforparticipants.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starsforparticipants.dao.TraineeDao;
import com.starsforparticipants.models.CourseRequestModel;


@Service
public class TraineeServiceImpl implements TraineeService {

	@Autowired
	private TraineeDao traineeDao;
	@Override
	public void addCourseRequest(CourseRequestModel courseRequest) {
		// TODO Auto-generated method stub
		traineeDao.addCourseRequest(courseRequest);
	}

}
