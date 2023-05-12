package com.tmf.inventory.SpringHibernateIntegrationBackend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	
	private int courseId;
	private String coursename;
	private Double coursefee;
	private int courseDuration;
	private String courseStatus;
	
	public Course() {}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public Double getCoursefee() {
		return coursefee;
	}

	public void setCoursefee(Double coursefee) {
		this.coursefee = coursefee;
	}

	public int getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}

	public String getCourseStatus() {
		return courseStatus;
	}

	public void setCourseStatus(String courseStatus) {
		this.courseStatus = courseStatus;
	}
	
	
	public Course(int courseId, String coursename, Double coursefee, int courseDuration, String courseStatus) {
		this.courseId = courseId;
		this.coursename = coursename;
		this.coursefee = coursefee;
		this.courseDuration = courseDuration;
		this.courseStatus = courseStatus;
	}
	
}
