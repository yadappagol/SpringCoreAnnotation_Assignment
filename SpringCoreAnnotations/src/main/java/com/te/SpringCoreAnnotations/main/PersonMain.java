package com.te.SpringCoreAnnotations.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.SpringCoreAnnotations.bean.Person;
import com.te.SpringCoreAnnotations.config.PersonConfig;

public class PersonMain {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);
		Person person = context.getBean("person", Person.class);
		System.out.println(person.getAddress());
		person.hi();
		

	}

}
