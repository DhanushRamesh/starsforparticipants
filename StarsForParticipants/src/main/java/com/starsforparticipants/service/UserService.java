package com.starsforparticipants.service;

import com.starsforparticipants.models.LoginModal;
import com.starsforparticipants.models.UserModal;

public interface UserService {

	public abstract UserModal addUser(UserModal userDetails);

	public abstract UserModal getLoginUserData(LoginModal loginData);
	
}
