package com.javaconfig.courseRevenueGenerator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;

import com.javaconfig.courses.Course;

public class coursesconfig {
	@Bean(name = "course1")
	public Course getCourse1() {
		Course course1 =new Course();
		course1.setName("java");
		course1.setMentor("shiva");
		course1.setFee(1000);
		return course1;
	}
	@Bean(name = "course2")
	public Course getCourse2() {
		Course course2 =new Course();
		course2.setName("python");
		course2.setMentor("srinu");
		course2.setFee(5000);
		return course2;
	}
	@Bean(name = "course3")
	public Course getCourse3() {
		Course course3 =new Course();
		course3.setName("selenium");
		course3.setMentor("arun");
		course3.setFee(500);
		return course3;
	} 
	@Bean (name="listCourse")
	public List<Course> getCourseList(){
		List<Course> colist =new ArrayList<Course>();
		colist.add(getCourse1());
		colist.add(getCourse2());
		colist.add(getCourse3());
		return colist;
	}
}
