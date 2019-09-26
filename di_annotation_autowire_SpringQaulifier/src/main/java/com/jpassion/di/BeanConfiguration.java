package com.jpassion.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

	@Bean(name = "myaddress")
	public AddressInterface getMyAddress() {
		AddressInterface address = new MyAddress();
		return address;
	}
	
	@Bean(name = "youraddress")
	public AddressInterface getYourAddress() {
		AddressInterface address = new YourAddress();
		return address;
	}

	@Bean
	public Person getPerson() {
		Person person = new Person();
		return person;
	}

}
