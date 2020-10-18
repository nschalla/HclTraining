package com.javaconfig.collection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollectionCofig {
	@Bean(name="empbean")
	public Employee getemployee() {
		Employee emp = new Employee();
		emp.setEmployeeName("shiva");
		emp.setEmployeeEmail("shiva@gmail.com");
		emp.setEmployeeSalary(50000);
		emp.setAddress(getAddress());
		return emp;
	}
	@Bean(name = "addressBean")
	public Address getAddress() {
		Address address =new Address();
		address.setLine1("2/115 anna nagar");
		address.setLine2("kaveripattinam");
		address.setCity("krishnagiri");
		address.setPincode("635112");
		return address;
	}

}
