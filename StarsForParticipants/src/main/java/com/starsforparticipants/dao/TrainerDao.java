package com.starsforparticipants.dao;

import com.starsforparticipants.models.CourseRequestModel;

public interface TrainerDao {
	
	public CourseRequestModel getTraineeRequests(int trainerId);

	public void nominate(int id);

}
