package com.starsforparticipants.dao;

import java.util.List;

import com.starsforparticipants.models.CourseRequestModel;
import com.starsforparticipants.models.UserModal;

public interface TrainerDao {
	
	public CourseRequestModel getTraineeRequests(int trainerId);

	public void nominate(int id);

	public void confirmRequest(int trainerId, int traineeId);

	public List<UserModal> getAssignedTrainees(UserModal activeUser);

}
