package com.starsforparticipants.dao;

import static com.starsforparticipants.dao.DataBaseQueries.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.starsforparticipants.models.CourseRequestModel;
import com.starsforparticipants.utils.DBUtils;


@Repository
public class TrainerDaoImpl extends DBUtils implements TrainerDao {

	@Override
	public CourseRequestModel getTraineeRequests(int trainerId) {
		
		CourseRequestModel modal = new CourseRequestModel();
		
		try(PreparedStatement pstmt = getConnection().prepareStatement(GET_TRAINEE_REQUESTS)){
			pstmt.setInt(1, trainerId);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				modal.setId(rs.getInt("id"));
				modal.setLocation(rs.getString("location"));
				modal.setTiming(rs.getString("timing"));
				modal.setSubject(rs.getString("subject"));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return modal;
	}

	@Override
	public void nominate(int id) {
		try(PreparedStatement pstmt = getConnection().prepareStatement(UPDATE_ADMIN_REQUEST)){
			
			pstmt.setInt(1, id);
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
