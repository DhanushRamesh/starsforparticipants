package com.starsforparticipants.service;

import com.starsforparticipants.models.CourseRequestModel;

public interface TraineeService {
	
	public abstract void addCourseRequest(CourseRequestModel courseRequest);

	public abstract boolean hasCourseRequested(CourseRequestModel courseModel);

}
