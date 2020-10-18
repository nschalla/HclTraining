package com.javaconfig.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CollectionCofig.class);
		Employee emp =context.getBean(Employee.class, "empbean");
		emp.display();
	}

}
