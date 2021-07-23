package com.starsforparticipants.service;

import java.util.List;

import com.starsforparticipants.models.CourseRequestModel;
import com.starsforparticipants.models.UserModal;

public interface TrainerService {

	public abstract CourseRequestModel getTraineeRequests(int trainerId);

	public abstract void nominate(int id);

	public abstract void confirmRequest(int trainerId, int traineeId);

	public abstract List<UserModal> getAssignedTrainees(UserModal activeUser);

}
