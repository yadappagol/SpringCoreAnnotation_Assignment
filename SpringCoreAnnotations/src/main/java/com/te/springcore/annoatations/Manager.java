package com.te.springcore.annoatations;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Manager implements Serializable{
	private int id;
	private String name;
}
