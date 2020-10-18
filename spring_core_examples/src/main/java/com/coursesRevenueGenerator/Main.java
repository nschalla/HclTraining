package com.coursesRevenueGenerator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("courserevenuexml.xml");
		CourseList colist=context.getBean(CourseList.class,"courseList");
		System.out.println("revenue :"+colist.revenue());
		((ClassPathXmlApplicationContext)context).close();

	}

}
