package com.javaconfig.owner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Ownerconfig {
	@Bean(name = "ownerbean")
public Owner getowner() {
	Owner owner=new Owner();
	owner.setName("ns");
	owner.setPassword("ns@1234");
	owner.setMobilenumber("9797978686");
	return owner;
}
}
