package com.te.SpringCoreAnnotations.bean;

import lombok.Data;

public class Cat_Assign implements Animal_Assign {

	@Override
	public void bark() {
		System.out.println("Cat is making sound...");

	}

	@Override
	public void eat() {
		System.out.println("Cat is eating...");

	}

	@Override
	public void sleep() {
		System.out.println("Cat is sleeping...");

	}

}
