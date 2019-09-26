package com.jpassion.di;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(BeanConfiguration.class)
public class MainApplication {
	
	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(MainApplication.class,
				args);

		Person person = context.getBean(Person.class);
		System.out.println(getPersonInfo(person));
	}
	
	public static String getPersonInfo(Person person) {
		return "Name:" + person.getName() + "\n" + "Age:" + person.getAge() + "\n"
				+ "Height: " + person.getHeight() + "\n" + "Is Programmer?: "
				+ person.isProgrammer() + "\n" + "Address: "
				+ person.getAddress().getWholeAddress();
	}
	
	// <For your own exercise>
	// - Try "youraddress" as a value for the custom qualifier
	
	// <For your own exercise>
	// - Change the name of custom qualifier "MyCustomQualifier"
	//   to more meaningful name "Address"
	
	// <For your own exercise>
	// - Create "FamilyInfo" interface and create two implementations called 
	//   "MyFamilyInfoImpl" and "YourFamilyInfoImpl"
	// - Autowire FamilyInfo using customer qualifier called
	//   "FamilyInfo"

}
