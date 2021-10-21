package com.te.springcore.annoatations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoreComponentAnnotations_Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Component.xml");
		Manager manager = (Manager) context.getBean("manager");
		System.out.println(manager);
	}

}
