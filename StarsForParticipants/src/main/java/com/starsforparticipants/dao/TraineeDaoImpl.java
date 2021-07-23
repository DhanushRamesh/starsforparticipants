package com.starsforparticipants.dao;

import static com.starsforparticipants.dao.DataBaseQueries.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.starsforparticipants.models.CourseRequestModel;
import com.starsforparticipants.models.UserModal;
import com.starsforparticipants.utils.DBUtils;


@Repository
public class TraineeDaoImpl extends DBUtils implements TraineeDao{

	@Override
	public void addCourseRequest(CourseRequestModel courseRequest) {
		
		try(PreparedStatement pstmt = getConnection().prepareStatement(ADD_COURSE_REQUEST)){
			pstmt.setInt(1, courseRequest.getId());
			pstmt.setString(2, courseRequest.getSubject());
			pstmt.setString(3, courseRequest.getLocation());
			pstmt.setString(4, courseRequest.getTiming());
			pstmt.setString(5, courseRequest.getWeekend());
			pstmt.setString(6, courseRequest.getModeOfLearning());
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	@Override
	public boolean hasCourseRequested(CourseRequestModel courseRequest) {
			boolean hasCourseRequested = false;
			try(PreparedStatement pstmt = getConnection().prepareStatement(FIND_COURSE_BY_ID)){
				pstmt.setInt(1, courseRequest.getId());
				ResultSet rs = pstmt.executeQuery();
				if(rs.next()) {
					hasCourseRequested = true;
				}
			} catch (ClassNotFoundException e) {
			
				e.printStackTrace();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			return hasCourseRequested;
	}

	@Override
	public List<UserModal> getAssignedTrainees(UserModal activeUser) {
		
		List<UserModal> traineeList = new ArrayList<>();
		
		try(PreparedStatement stmt = getConnection().prepareStatement(GET_ASSIGNED_TRAINERS)){
			
			stmt.setInt(1, activeUser.getId());
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				UserModal trainee = new UserModal();
				trainee.setId(rs.getInt("id"));
				trainee.setFirstName(rs.getString("firstname"));
				traineeList.add(trainee);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return traineeList;
	}


}
