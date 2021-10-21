package com.te.springcoreannatations.withbothxmlandannotations;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("addrsd")
public class Address implements Serializable {
	@Value("Bnglr")
	private String city;
	@Value("Karnataka")
	private String state;

}
