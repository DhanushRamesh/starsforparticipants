package com.starsforparticipants.models;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class RegistrationModel {
	
	private String role;
	private String isTrainee;
	public String getIsTrainee() {
		return isTrainee;
	}
	public void setIsTrainee(String isTrainee) {
		this.isTrainee = isTrainee;
	}
	private String firstName;
	private String lastName;
	private String gender;
	private String phone;
	private String location;
	private Date dob;
	private String userid;
	private String password;
	private String []  skillsets;
	private String availability;
	
	private List<String> locations = new ArrayList<>();
	

	
	public List<String> getLocations() {
		return locations;
	}
	public void setLocations(List<String> locations) {
		this.locations = locations;
		
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String[] getSkillsets() {
		return skillsets;
	}
	public void setSkillsets(String[] skillsets) {
		this.skillsets = skillsets;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}

	
}
