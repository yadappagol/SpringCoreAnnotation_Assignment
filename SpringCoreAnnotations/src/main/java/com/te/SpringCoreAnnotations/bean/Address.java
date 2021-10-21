package com.te.SpringCoreAnnotations.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Address {
	@Value("126")
	private int hno;

	public void getAdd() {
		System.out.println("you address : Beeranagaddi..");
	}

}
