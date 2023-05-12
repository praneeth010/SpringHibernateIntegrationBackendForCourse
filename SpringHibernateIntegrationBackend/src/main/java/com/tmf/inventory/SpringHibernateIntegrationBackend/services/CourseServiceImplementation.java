package com.tmf.inventory.SpringHibernateIntegrationBackend.services;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmf.inventory.SpringHibernateIntegrationBackend.dao.CourseDAO;
import com.tmf.inventory.SpringHibernateIntegrationBackend.models.Course;

@Service
public class CourseServiceImplementation implements CourseService{
	
	@Autowired
	CourseDAO dao;

	@Override
	public void addNewCourse(Course course) {
		dao.addNewCourse(course);
		
	}

	@Override
	public void updateCourse(Course course) {
		dao.updateCourse(course);
		
	}

	@Override
	public void deleteCourse(Course course) {
		dao.deleteCourse(course);
		
	}

	@Override
	public List<Course> displayAllCourse() {
		
		return dao.displayAllCourse();
	}

	@Override
	public List<Course> displayCourseByCourseId(int courseId) {
		
		return dao.displayCourseByCourseId(courseId);
	}

	@Override
	public List<Course> displayCourseByCoursename(String coursename) {
		
		return dao.displayCourseByCoursename(coursename);
	}

}
