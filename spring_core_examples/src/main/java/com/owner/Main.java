package com.owner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	ApplicationContext context =new ClassPathXmlApplicationContext("ownerxml.xml");
	Owner owner=context.getBean(Owner.class,"ownerbean");
	owner.display();
	((ClassPathXmlApplicationContext)context).close();
	}

}
