package com.starsforparticipants.dao;

import static com.starsforparticipants.dao.DataBaseQueries.ADD_SKILLS;
import static com.starsforparticipants.dao.DataBaseQueries.ADD_USER;
import static com.starsforparticipants.dao.DataBaseQueries.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Repository;

import com.starsforparticipants.models.LoginModal;
import com.starsforparticipants.models.UserModal;
import com.starsforparticipants.utils.DBUtils;


@Repository
public class UserDaoImpl extends DBUtils implements UserDao{

	@Override
	public UserModal addUser(UserModal userDetails) {
		
		try(PreparedStatement pstmt = getConnection().prepareStatement(ADD_USER)){
			pstmt.setString(1,userDetails.getRole());
			pstmt.setString(2, userDetails.getFirstName());
			pstmt.setString(3, userDetails.getLastName());
			pstmt.setDate(4, new java.sql.Date(userDetails.getDob().getTime()));
			pstmt.setString(5, userDetails.getGender());
			pstmt.setString(6, userDetails.getPhone());
			pstmt.setString(7, userDetails.getLocation());
			pstmt.setString(8, userDetails.getUserid());
			pstmt.setString(9, userDetails.getPassword());
			pstmt.setString(10, userDetails.getAvailability());
			pstmt.execute();
			addSkills(userDetails);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userDetails;
	}

	
	//inserts skills after inserting the user record
	@Override
	public void addSkills(UserModal userDetails) {
		
				
		for(String skill : userDetails.getSkillsets()) {
		
			try(PreparedStatement pstmt = getConnection().prepareStatement(ADD_SKILLS)){
				
				pstmt.setInt(1, getMaxId());
				pstmt.setString(2, skill);
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


	private int getMaxId() {
		
		int id = 0;
		
		try(Statement pstmt = getConnection().createStatement()){
			ResultSet rs = pstmt.executeQuery(GET_MAX_ID);
			rs.next();
			id = rs.getInt("id");			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return id;
	}


	//find a user by userId
	@Override
	public UserModal findByUserName(String username) {
		
		UserModal user = null;
		
		try(PreparedStatement pstmt = getConnection().prepareStatement(FIND_BY_USERID)){
			pstmt.setString(1, username);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				user = new UserModal();
				user.setUserid(rs.getString("userid"));
			}

			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}


	@Override
	public UserModal getLoginUserData(LoginModal loginData) {
		
		UserModal activeUser = null;
		
		try(PreparedStatement pstmt = getConnection().prepareStatement(GET_LOGIN_DATA)){
			pstmt.setString(1, loginData.getUserid());
			pstmt.setString(2, loginData.getPassword());
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				activeUser = new UserModal();
				activeUser.setUserid(rs.getString("userid"));
				activeUser.setRole(rs.getString("Trainer"));
				activeUser.setFirstName(rs.getString("firstname"));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return activeUser;
	}
	

}

	


