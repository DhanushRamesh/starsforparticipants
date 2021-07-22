package com.starsforparticipants.dao;

import static com.starsforparticipants.dao.DataBaseQueries.GET_ALL_COURSE_REQUESTS;
import static com.starsforparticipants.dao.DataBaseQueries.GET_COURSE_DATA;
import static com.starsforparticipants.dao.DataBaseQueries.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.starsforparticipants.models.CourseRequestModel;
import com.starsforparticipants.models.TrainerModel;
import com.starsforparticipants.utils.DBUtils;

@Repository
public class AdminDaoimpl extends DBUtils implements AdminDao {

	@Override
	public List<CourseRequestModel> getAllCourseRequests() {
		
		List<CourseRequestModel> courseRequests = new ArrayList<>();
		
		try(Statement pstmt = getConnection().createStatement()){
			
			ResultSet rs =   pstmt.executeQuery(GET_ALL_COURSE_REQUESTS);
			while(rs.next()) {
				CourseRequestModel course = new CourseRequestModel();
				course.setId(rs.getInt("id"));
				course.setSubject(rs.getString("subject"));
				course.setLocation(rs.getString("location"));
				course.setTiming(rs.getString("timing"));
				course.setWeekend(rs.getString("weekendclass"));
				course.setModeOfLearning(rs.getString("modeoflearning"));
				courseRequests.add(course);
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return courseRequests;
		
	}

	@Override
	public List<TrainerModel> getTrainerDetails() {
		
		List<TrainerModel> trainerList = new ArrayList<>();
		
		
		try(PreparedStatement pstmt = getConnection().prepareStatement(GET_TRAINER_DATA))
			{
			
			ResultSet rs =  pstmt.executeQuery();
			while(rs.next()) {
				TrainerModel trainer = new TrainerModel();
				trainer.setFirstname(rs.getString("firstname"));
				trainer.setLastname(rs.getString("lastname"));
				trainer.setDob(rs.getDate("dob"));
				trainer.setGender(rs.getString("gender"));
				trainer.setLocation(rs.getString("location"));
				trainer.setPhone(rs.getString("phno"));
				trainer.setAvailability(rs.getString("availability"));
				trainer.setId(rs.getInt("id"));
				trainer.setSkillset(rs.getString("skillset"));
				trainerList.add(trainer);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return trainerList;
	}

	@Override
	public CourseRequestModel getCourseRequestById(int trainerId) {
		
		CourseRequestModel model = new CourseRequestModel();
		try(PreparedStatement pstmt = getConnection().prepareStatement(GET_COURSE_DATA)){
			
			pstmt.setInt(1, trainerId);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				model.setId(rs.getInt("id"));
				model.setSubject(rs.getString("subject"));
				model.setLocation(rs.getString("location"));
				model.setTiming(rs.getString("timing"));
				model.setWeekend(rs.getString("weekendclass"));
				model.setModeOfLearning(rs.getString("modeoflearning"));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return model;
	}

	@Override
	public List<TrainerModel> getTrainerSuggestions(CourseRequestModel course) {
		
		List<TrainerModel> trainerSuggestions = new ArrayList<>();
		
		try(PreparedStatement pstmt = getConnection().prepareStatement(GET_TRAINER_SUGGESTIONS)){
			pstmt.setString(1, course.getLocation());
			pstmt.setString(2, course.getTiming());
			pstmt.setString(3, course.getSubject());
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				TrainerModel trainer = new TrainerModel();
				trainer.setFirstname(rs.getString("firstname"));
				trainer.setUserId(rs.getString("userid"));
				trainerSuggestions.add(trainer);
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return trainerSuggestions;
	}

	@Override
	public void createCourseRequest(int traineeId, String userid) {
			
		try(PreparedStatement pstmt = getConnection().prepareStatement(CREATE_REQUEST)){
			
			pstmt.setInt(1, traineeId);
			pstmt.setString(2, userid);
			pstmt.execute();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
