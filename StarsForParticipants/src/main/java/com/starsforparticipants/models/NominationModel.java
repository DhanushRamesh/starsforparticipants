package com.starsforparticipants.models;

public class NominationModel {

	public int getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}
	public int getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	public String getTraineename() {
		return traineename;
	}
	public void setTraineename(String traineename) {
		this.traineename = traineename;
	}
	public String getTrainername() {
		return trainername;
	}
	public void setTrainername(String trainername) {
		this.trainername = trainername;
	}
	private int traineeId;
	private int trainerId;
	private String traineename;
	private String trainername;
	
	
	
}
