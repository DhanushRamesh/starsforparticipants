package com.starsforparticipants.dao;

import java.util.List;

import com.starsforparticipants.models.CourseRequestModel;
import com.starsforparticipants.models.NominationModel;
import com.starsforparticipants.models.TrainerModel;

public interface AdminDao {
	
	public abstract List<CourseRequestModel> getAllCourseRequests();

	public abstract List<TrainerModel> getTrainerDetails();

	public abstract CourseRequestModel getCourseRequestById(int trainerId);

	public abstract List<TrainerModel> getTrainerSuggestions(CourseRequestModel course);

	public abstract void createCourseRequest(int requestId, String userid);

	public abstract List<NominationModel> getNominatedUsers();

	

}
