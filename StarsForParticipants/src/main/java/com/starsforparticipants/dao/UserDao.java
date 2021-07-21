package com.starsforparticipants.dao;

import com.starsforparticipants.models.LoginModal;
import com.starsforparticipants.models.UserModal;

public interface UserDao {
	
	public abstract UserModal addUser(UserModal userDetails);
	
	public abstract void addSkills(UserModal userDetails);

	public abstract UserModal findByUserName(String phone);

	public abstract UserModal getLoginUserData(LoginModal loginData);
	
	

}
