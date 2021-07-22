package com.starsforparticipants.service;

import java.util.List;

import com.starsforparticipants.models.CourseRequestModel;
import com.starsforparticipants.models.TrainerModel;

public interface AdminService {

	public abstract List<CourseRequestModel> getAllCourseRequests();

	public abstract List<TrainerModel> getTrainerDetails();

	public abstract CourseRequestModel getCourseRequestById(int trainerId);

	public abstract List<TrainerModel> getTrainerSuggestions(CourseRequestModel course);

	public abstract void createCourseRequest(int traineeId, String userid);

}
