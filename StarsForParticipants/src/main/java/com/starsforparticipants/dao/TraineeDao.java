package com.starsforparticipants.dao;

import com.starsforparticipants.models.CourseRequestModel;

public interface TraineeDao {

	public abstract void addCourseRequest(CourseRequestModel courseRequest);

	public abstract boolean hasCourseRequested(CourseRequestModel courseRequest);
}