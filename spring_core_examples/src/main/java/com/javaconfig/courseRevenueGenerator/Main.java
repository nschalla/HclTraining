package com.javaconfig.courseRevenueGenerator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.javaconfig.courses.Courseconfig;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(Courseconfig.class);
		CourseList colist = context.getBean(CourseList.class,"listCourse");
		colist.revenue();
		((AnnotationConfigApplicationContext)context).close();
	}

}
