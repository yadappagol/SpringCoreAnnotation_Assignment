package com.te.SpringCoreAnnotations.config;

import org.springframework.context.annotation.Bean;

import com.te.SpringCoreAnnotations.bean.Pet;

public class PetConfig_Assign {
	
	@Bean(name="mypet")
	public Pet getPet() {
		Pet pet=new Pet();
		pet.setName("myworld");
		return pet;
	}

}
