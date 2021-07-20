package com.starsforparticipants.dao;

import com.starsforparticipants.models.UserModal;

public interface UserDao {
	public abstract UserModal addUser(UserModal userDetails);
	
	public abstract void addSkills(UserModal userDetails);

}
