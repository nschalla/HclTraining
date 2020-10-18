package com.javaconfig.courses;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.courses.CoursesList;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(Courseconfig.class);
		CoursesList colist = context.getBean(CoursesList.class,"listCourse");
		System.out.println("enter your budget");
		Scanner scan=new Scanner(System.in);
		double budget=scan.nextDouble();
		ArrayList<String>courseDetail=colist.noOfCourses(budget);
		for(String course:courseDetail)
			System.out.println(course);
		((AnnotationConfigApplicationContext)context).close();
	}
	

}
