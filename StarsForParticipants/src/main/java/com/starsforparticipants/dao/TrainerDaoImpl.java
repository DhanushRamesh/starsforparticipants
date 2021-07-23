package com.starsforparticipants.dao;

import static com.starsforparticipants.dao.DataBaseQueries.COMFIRM_REQUESTS;
import static com.starsforparticipants.dao.DataBaseQueries.GET_ASSIGNED_TRAINEES;
import static com.starsforparticipants.dao.DataBaseQueries.GET_TRAINEE_REQUESTS;
import static com.starsforparticipants.dao.DataBaseQueries.UPDATE_ADMIN_REQUEST;

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

	@Override
	public void confirmRequest(int trainerId, int traineeId) {
		
		try(PreparedStatement stmt = getConnection().prepareStatement(COMFIRM_REQUESTS)){
			stmt.setInt(1, trainerId);
			stmt.setInt(2, traineeId);
			stmt.execute();
		} catch (ClassNotFoundException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<UserModal> getAssignedTrainees(UserModal activeUser) {
		
		List<UserModal> traineeList = new ArrayList<>();
		
		try(PreparedStatement stmt = getConnection().prepareStatement(GET_ASSIGNED_TRAINEES)){
			
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
