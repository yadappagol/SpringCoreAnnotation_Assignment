package com.te.SpringCoreAnnotations.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.SpringCoreAnnotations.bean.Pet;
import com.te.SpringCoreAnnotations.config.AllConfig_Assign;

public class Assignment_Main {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AllConfig_Assign.class);
		Pet pet = context.getBean("mypet", Pet.class);
		System.out.println(pet.getName());
		pet.getPet();;
	}

}
