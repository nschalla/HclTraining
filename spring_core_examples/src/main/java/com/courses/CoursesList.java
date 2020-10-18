package com.courses;

import java.util.ArrayList;

import com.javaconfig.courses.Course;

public class CoursesList {
 private ArrayList<Course> courseList;
 public CoursesList() {
	super();
	// TODO Auto-generated constructor stub
}
public ArrayList<Course> getCourseList() {
	return courseList;
}
public void setCourseList(ArrayList<Course> courseList) {
	this.courseList = courseList;
}
public void  insert(Course courses) {
	 this.courseList.add(courses);
 }
public ArrayList<String>noOfCourses(Double budget){
	ArrayList<String>noOfCourse= new ArrayList<String>();
	for(Course c:this.courseList) {
	if(c.getFee()==budget) {
		String budgetCourse=c.getName()+"-1";
		noOfCourse.add(budgetCourse);
	}
	else if(c.getFee()<budget) {
		double fee=c.getFee();
		double budgt=budget;
		int number=(int)(budgt/fee);
		String message =c.getName()+"-"+number;
		noOfCourse.add(message);
	}
	
	
	}
	 return noOfCourse;
}
}
