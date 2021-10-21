package com.te.SpringCoreAnnotations.bean;

import lombok.Data;

@Data
public class Company {
 
	private int id;
	private String name;
	
	public void getdetail() {
		
		System.out.println("Company :Details..");
	}
	
	
	
}
