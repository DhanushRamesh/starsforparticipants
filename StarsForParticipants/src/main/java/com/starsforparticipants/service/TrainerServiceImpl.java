package com.starsforparticipants.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starsforparticipants.dao.TrainerDao;
import com.starsforparticipants.models.CourseRequestModel;


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

}
