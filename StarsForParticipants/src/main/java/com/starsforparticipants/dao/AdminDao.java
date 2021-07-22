package com.starsforparticipants.dao;

import java.util.List;

import com.starsforparticipants.models.CourseRequestModel;
import com.starsforparticipants.models.UserModal;

public interface AdminDao {
	
	public abstract List<CourseRequestModel> getAllCourseRequests();

	public abstract List<UserModal> getTrainerDetails();

}
