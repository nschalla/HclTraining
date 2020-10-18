package com.javaconfig.courseRevenueGenerator;

import java.util.ArrayList;



public class CourseList {
private ArrayList<Course> courseList;

public ArrayList<Course> getCourseList() {
	return courseList;
}
public void setCourseList(ArrayList<Course> courseList) {
	this.courseList = courseList;
}
public void insert (Course course) {
	this.courseList.add(course);
}

public double revenue() {
	double revenue = 0;
	double tot =0;
	for(Course c : courseList) {
		tot= 0.2 * c.getFee()*200;
		revenue=revenue+tot;
	}
	return revenue;
	
}
}
