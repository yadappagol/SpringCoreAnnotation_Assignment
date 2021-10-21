package com.te.SpringCoreAnnotations.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.SpringCoreAnnotations.bean.Worker;
import com.te.SpringCoreAnnotations.config.WorkerConfig;

public class WorkerMain {

	
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(WorkerConfig.class);
		Worker worker=(Worker) context.getBean("work");
		System.out.println(worker);
	}
	

	
	
}
