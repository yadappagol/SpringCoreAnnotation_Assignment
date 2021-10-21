package com.te.springcoreannatations.withbothxmlandannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("emp")
public class Employee {

	@Value("10")
	private int id;
	@Value("Dundappa")
	private String name;
	@Autowired
	@Qualifier("addr")
	private Address address;

	public void work() {
		System.out.println("Employee is working..");
	}

	public Employee(Address address) {
		System.out.println("This is calling constructor..");
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {

		return address;
	}

	public void setAddress(Address address) {
		System.out.println("This is calling by setters");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
