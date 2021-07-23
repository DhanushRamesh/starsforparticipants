package com.starsforparticipants.dao;

import java.util.List;

import com.starsforparticipants.models.CourseRequestModel;
import com.starsforparticipants.models.UserModal;

public interface TraineeDao {

	public abstract void addCourseRequest(CourseRequestModel courseRequest);

	public abstract boolean hasCourseRequested(CourseRequestModel courseRequest);

	public abstract List<UserModal> getAssignedTrainees(UserModal activeUser);
}
