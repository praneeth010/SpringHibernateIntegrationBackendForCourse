package com.tmf.inventory.SpringHibernateIntegrationBackend.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tmf.inventory.SpringHibernateIntegrationBackend.models.Course;

@Repository
@Transactional
public class CourseDAOImplementation  implements CourseDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void addNewCourse(Course course) {
		getSession().save(course);
		System.out.println("A course has been inserted");
		
	}

	public void updateCourse(Course course) {
		getSession().update(course);
		System.out.println("Course updated Successfully...");
		
	}

	@Override
	public void deleteCourse(Course course) {
		getSession().update(course);
		System.out.println("Course updated Successfully...");
		
	}

	@Override
	public List<Course> displayAllCourse() {
		return getSession().createQuery("from Course").list();
	}

	@Override
	public List<Course> displayCourseByCourseId(int courseId) {

		return (List<Course>) getSession().find(Course.class, courseId);
	}

	@Override
	public List<Course> displayCourseByCoursename(String coursename) {
		return (List<Course>) getSession().find(Course.class,coursename);
	}

}
