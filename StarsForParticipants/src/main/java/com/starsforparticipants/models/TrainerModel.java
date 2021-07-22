package com.starsforparticipants.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class TrainerModel {
	private int id;
	private String firstname;
	private String lastname;
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date dob;
	private String gender;
	private String phone;
	private String location;
	private String [] skillsets;
	private String availability;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	
	
	

}
