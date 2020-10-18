package com.javaconfig.coursesdiscount;

import java.util.ArrayList;
import java.util.List;

import com.courses.Course;

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

public void discount() {
	courseList.sort((p, q) -> (int) (p.getFee() - q.getFee()));
	Course minPrice = courseList.get(0);
	Course maxPrice = courseList.get(courseList.size() - 1);
	double dmin =0.05 * minPrice.getFee();
	double dmax =  0.1 * maxPrice.getFee();
	System.out.println(minPrice.getName() + " discounted price is " + dmin);
	System.out.println(maxPrice.getName() + " discounted price is " + dmax);
}
}
