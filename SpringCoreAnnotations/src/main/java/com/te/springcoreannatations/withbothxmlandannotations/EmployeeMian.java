package com.te.springcoreannatations.withbothxmlandannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMian {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("combination.xml");
		Employee employee=(Employee) context.getBean("emp");
		System.out.println(employee);
		employee.work();
		
	}

}
