package com.te.SpringCoreAnnotations.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Data
public class Worker {

	@Value("10")
	private int id;
	@Value("Dinga")
	private String name;
	
	@Autowired
	@Qualifier("get1")
	private Company company;
	
	public void getWorker() {
		company.getdetail();
		System.out.println("This is Worker Details :");
	}
	
	
	
}
