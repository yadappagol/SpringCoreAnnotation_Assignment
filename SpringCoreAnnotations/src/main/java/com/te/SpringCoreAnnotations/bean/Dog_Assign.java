package com.te.SpringCoreAnnotations.bean;

import lombok.Data;

public class Dog_Assign implements Animal_Assign {

	@Override
	public void bark() {
		System.out.println("Dog is bark...");
	}

	@Override
	public void eat() {
		System.out.println("Dog is eating...");
	}

	@Override
	public void sleep() {
		System.out.println("Dog is sleeping...");
	}

}
