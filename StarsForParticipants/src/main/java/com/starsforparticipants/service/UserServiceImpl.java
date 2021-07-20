package com.starsforparticipants.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starsforparticipants.dao.UserDao;
import com.starsforparticipants.models.UserModal;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public UserModal addUser(UserModal userDetails) {
		if ("Yes".equalsIgnoreCase(userDetails.getIsTrainee()))
			userDetails.setRole("Trainee");
		else
			userDetails.setRole("Trainer");
	
		if(isDuplicate(userDetails)) {
			return null;
		}
		//get the user id from the input parameter
		//create a method in dao to check for existing records with the user name(parameter username)
		//if it returns records, it is a duplicate. no need to do anything
		//else invoke the below method
		return userDao.addUser(userDetails);
	}

	private boolean isDuplicate(UserModal userDetails) {
		
		UserModal dbUserModal = userDao.findByUserName(userDetails.getUserid());
		return dbUserModal != null;
	}

}
