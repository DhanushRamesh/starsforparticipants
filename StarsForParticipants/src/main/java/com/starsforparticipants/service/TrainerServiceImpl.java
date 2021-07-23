package com.starsforparticipants.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starsforparticipants.dao.TrainerDao;
import com.starsforparticipants.models.CourseRequestModel;
import com.starsforparticipants.models.UserModal;


@Service
public class TrainerServiceImpl  implements TrainerService {

	@Autowired
	TrainerDao trainerDao;
	
	@Override
	public CourseRequestModel getTraineeRequests(int trainerId) {
		
	
		return trainerDao.getTraineeRequests(trainerId);
	}

	@Override
	public void nominate(int id) {
		
		trainerDao.nominate(id);
		
	}

	@Override
	public void confirmRequest(int trainerId, int traineeId) {
		
		trainerDao.confirmRequest(trainerId, traineeId);
		
	}

	@Override
	public List<UserModal> getAssignedTrainees(UserModal activeUser) {
		
		return trainerDao.getAssignedTrainees(activeUser);
	}

}
