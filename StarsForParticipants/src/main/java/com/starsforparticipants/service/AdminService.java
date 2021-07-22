package com.starsforparticipants.service;

import java.util.List;

import com.starsforparticipants.models.CourseRequestModel;
import com.starsforparticipants.models.UserModal;

public interface AdminService {

	public abstract List<CourseRequestModel> getAllCourseRequests();

	public abstract List<UserModal> getTrainerDetails();

}
