package com.te.SpringCoreAnnotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.SpringCoreAnnotations.bean.Animal_Assign;
import com.te.SpringCoreAnnotations.bean.Cat_Assign;
import com.te.SpringCoreAnnotations.bean.Dog_Assign;

@Configuration
public class AnimalConfig_Assign {

	@Bean(name = "dog")
	public Animal_Assign getdog() {
		return new Dog_Assign();
	}

	@Bean(name = "cat")
	public Animal_Assign getCat() {
		return new Cat_Assign();
	}
}
