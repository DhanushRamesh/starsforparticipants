package com.starsforparticipants.service;

import com.starsforparticipants.models.CourseRequestModel;

public interface TrainerService {

	public abstract CourseRequestModel getTraineeRequests(int trainerId);

	public abstract void nominate(int id);

}
