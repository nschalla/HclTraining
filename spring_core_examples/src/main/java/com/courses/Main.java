package com.courses;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Applicationcontextcourses.xml");
		CoursesList colist=context.getBean(CoursesList.class, "courseList");
		System.out.println("enter your budget");
		Scanner scan=new Scanner(System.in);
		double budget=scan.nextDouble();
		ArrayList<String>courseDetail=colist.noOfCourses(budget);
		for(String course:courseDetail)
			System.out.println(course);
		
		((ClassPathXmlApplicationContext)context).close();

	}

}
