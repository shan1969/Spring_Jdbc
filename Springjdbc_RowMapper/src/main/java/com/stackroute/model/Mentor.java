package com.stackroute.model;

public class Mentor {
	
	private int mentorid;
	private String mentorname;
	private String course;
	
	//default constructor
	public Mentor() {
		super();
		// TODO Auto-generated constructor stub
	}

	//parameterised constructor
	public Mentor(int mentorid, String mentorname, String course) {
		super();
		this.mentorid = mentorid;
		this.mentorname = mentorname;
		this.course = course;
	}

	
	//getters and setters
	public int getMentorid() {
		return mentorid;
	}

	public void setMentorid(int mentorid) {
		this.mentorid = mentorid;
	}

	public String getMentorname() {
		return mentorname;
	}

	public void setMentorname(String mentorname) {
		this.mentorname = mentorname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Mentor [mentorid=" + mentorid + ", mentorname=" + mentorname + ", course=" + course + "]";
	}
	
	
	
	
}
