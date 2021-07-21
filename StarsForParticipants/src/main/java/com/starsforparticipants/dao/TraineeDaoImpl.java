package com.starsforparticipants.dao;

import static com.starsforparticipants.dao.DataBaseQueries.ADD_COURSE_REQUEST;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.starsforparticipants.models.CourseRequestModel;
import com.starsforparticipants.utils.DBUtils;


@Repository
public class TraineeDaoImpl extends DBUtils implements TraineeDao{

	@Override
	public void addCourseRequest(CourseRequestModel courseRequest) {
		// TODO Auto-generated method stub
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

}
