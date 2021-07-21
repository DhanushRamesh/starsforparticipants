package com.starsforparticipants.models;

import java.util.List;

public class CourseRequestModel {

	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String subject;
	private List<String> subjectList;
	private String location;
	private List<String> locationList;
	private String timing;
	private String weekend;
	private String modeOfLearning;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTiming() {
		return timing;
	}
	public List<String> getSubjectList() {
		return subjectList;
	}
	public void setSubjectList(List<String> subjectList) {
		this.subjectList = subjectList;
	}
	public List<String> getLocationList() {
		return locationList;
	}
	public void setLocationList(List<String> locationList) {
		this.locationList = locationList;
	}
	public void setTiming(String timing) {
		this.timing = timing;
	}
	public String getWeekend() {
		return weekend;
	}
	public void setWeekend(String weekend) {
		this.weekend = weekend;
	}
	public String getModeOfLearning() {
		return modeOfLearning;
	}
	public void setModeOfLearning(String modeOfLearning) {
		this.modeOfLearning = modeOfLearning;
	}
	
	
}
