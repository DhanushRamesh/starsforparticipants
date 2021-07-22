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
	
	public static final String GET_COURSE_DATA = "select id,subject,location,timing,weekendclass,modeoflearning from starsforparticipants.raise_request where id = ? ";

	public static final String GET_TRAINER_SUGGESTIONS = "select r.firstname as firstname, r.userid as userid from registeration r join skillset s on r.id = s.trainerid where r.location = ? and r.availability = ? and s.skillset = ?";
	
	public static final String CREATE_REQUEST = "insert into admin_request(requestId, trainerId) values((select recordId from raise_request where id = ? ),(select id from registeration where userid = ?))";
	
	public static final String GET_TRAINEE_REQUESTS = "select id,subject,location,timing from raise_request where recordId in (select requestId from admin_request where trainerId = ? )";
	
	public static final String UPDATE_ADMIN_REQUEST = "update admin_request set isnominated = 'Y' where trainerId = ? ";
	
	public static final String GET_NOMINATIONS = "select distinct ar.trainerId as trainerId,  r.firstname as trainername, rr.id as traineeId ,reg.firstname as traineename  from admin_request ar join registeration r on ar.trainerId = r.id join raise_request rr on rr.recordId = ar.requestId join registeration reg on reg.id = rr.id where ar.isnominated = 'Y'";
}