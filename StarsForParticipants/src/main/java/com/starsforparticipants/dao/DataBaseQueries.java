package com.starsforparticipants.dao;

public class DataBaseQueries {
	
	public static final String ADD_USER="insert into starsforparticipants.registeration(Trainer,firstname,lastname, dob, gender, phno, location, userid,password,availability) values(?,?,?,?,?,?,?,?,?,?)";
	
	public static final String ADD_SKILLS = "insert into starsforparticipants.skillset(trainerid,skillset)values(?,?) ";
	
	public static final String GET_MAX_ID = "select max(id) as id from starsforparticipants.registeration ";
	
	public static final String FIND_BY_USERID = "select userid from starsforparticipants.registeration where userid = ? ";

}
