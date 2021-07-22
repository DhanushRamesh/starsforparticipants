package com.starsforparticipants.dao;

import static com.starsforparticipants.dao.DataBaseQueries.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.starsforparticipants.models.CourseRequestModel;
import com.starsforparticipants.models.UserModal;
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
	public List<UserModal> getTrainerDetails() {
		
		List<UserModal> trainerList = new ArrayList<>();
		
		
		try(PreparedStatement pstmt = getConnection().prepareStatement(GET_TRAINER_DATA)){
			pstmt.setString(1, "Trainer");
			ResultSet rs =  pstmt.executeQuery();
			while(rs.next()) {
				UserModal trainer = new UserModal();
				
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

}
