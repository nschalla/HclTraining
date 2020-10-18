package com.collection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("employeebean.xml");
		Employee employee = context.getBean(Employee.class,"employeebean");
		employee.display();
		((ClassPathXmlApplicationContext)context).close();

	}

}
