package com.te.SpringCoreAnnotations.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.te.SpringCoreAnnotations.bean.Pet;

@Configuration
@Import({ PetConfig_Assign.class, AnimalConfig_Assign.class })
public class AllConfig_Assign {

}
