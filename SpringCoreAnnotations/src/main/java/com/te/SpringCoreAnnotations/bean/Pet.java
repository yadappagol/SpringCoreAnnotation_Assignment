package com.te.SpringCoreAnnotations.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;

@Data 
public class Pet {
	private String name;
	
	@Autowired
	@Qualifier("cat")
	private Animal_Assign animal_Assign;
	
	public void getPet() {
		
		animal_Assign.bark();
		animal_Assign.eat();
	}
	
	

}
