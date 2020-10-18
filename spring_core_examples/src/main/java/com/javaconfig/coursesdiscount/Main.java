package com.javaconfig.coursesdiscount;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coursesdiscounts.Courses;
import com.coursesdiscounts.CoursesList;
import com.javaconfig.courses.Courseconfig;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(Courseconfig.class);
		CoursesList colist = context.getBean(CoursesList.class,"listCourse");
		colist.discount();
		((AnnotationConfigApplicationContext)context).close();
	}

}
