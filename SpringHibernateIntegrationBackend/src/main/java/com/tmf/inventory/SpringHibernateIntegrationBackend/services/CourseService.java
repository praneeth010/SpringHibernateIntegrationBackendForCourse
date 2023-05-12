package com.tmf.inventory.SpringHibernateIntegrationBackend.services;

import java.util.List;

import com.tmf.inventory.SpringHibernateIntegrationBackend.models.Course;

public interface CourseService {
	void addNewCourse(Course course);
	void updateCourse(Course course);
	void deleteCourse(Course course);
	List<Course> displayAllCourse();
	List<Course> displayCourseByCourseId(int courseId);
	List<Course> displayCourseByCoursename(String coursename);

}
