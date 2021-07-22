package com.starsforparticipants.dao;

public class DataBaseQueries {
	
	public static final String ADD_USER="insert into starsforparticipants.registeration(Trainer,firstname,lastname, dob, gender, phno, location, userid,password,availability) values(?,?,?,?,?,?,?,?,?,?)";
	
	public static final String ADD_SKILLS = "insert into starsforparticipants.skillset(trainerid,skillset)values(?,?) ";
	
	public static final String GET_MAX_ID = "select max(id) as id from starsforparticipants.registeration ";
	
	public static final String FIND_BY_USERID = "select userid from starsforparticipants.registeration where userid = ? ";

	public static final String GET_LOGIN_DATA = "select userid,Trainer,firstname,id from starsforparticipants.registeration where userid = ? and password = ? ";
	
	public static final String ADD_COURSE_REQUEST = "insert into starsforparticipants.raise_request(id,subject,location,timing,weekendclass,modeoflearning)values(?,?,?,?,?,?)";
	
	public static final String FIND_COURSE_BY_ID = "select id from starsforparticipants.raise_request where id = ? ";
	
	public static final String GET_ALL_COURSE_REQUESTS = "select id,subject,location,timing,weekendclass,modeoflearning from starsforparticipants.raise_request ";
	
	public static final String GET_TRAINER_DATA = "select * from registeration r join skillset s on r.id = s.trainerid where r.id";
	
	public static final String GET_SKILLS_BY_ID = "";

}