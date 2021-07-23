package com.starsforparticipants.service;

import java.util.List;

import com.starsforparticipants.models.CourseRequestModel;
import com.starsforparticipants.models.UserModal;

public interface TraineeService {
	
	public abstract void addCourseRequest(CourseRequestModel courseRequest);

	public abstract boolean hasCourseRequested(CourseRequestModel courseModel);

	public abstract List<UserModal> getAssignedTrainees(UserModal activeUser);

}
