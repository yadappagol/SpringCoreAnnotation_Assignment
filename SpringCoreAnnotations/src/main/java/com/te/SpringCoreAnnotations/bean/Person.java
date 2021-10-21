package com.te.SpringCoreAnnotations.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Person {
	@Value("10")
	private int id;
	@Value("Hello")
	private String name;
	
	
	@Autowired
	private Address address;

	public void hi() {
		address.getAdd();
		System.out.println("The object creattion without xml..");
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	
}
