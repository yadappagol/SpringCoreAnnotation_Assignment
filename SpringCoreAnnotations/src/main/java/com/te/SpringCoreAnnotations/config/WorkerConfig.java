package com.te.SpringCoreAnnotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.SpringCoreAnnotations.bean.Company;
import com.te.SpringCoreAnnotations.bean.Worker;


// @Qualifies is dominates over @Primary in @Bean creation

@Configuration
public class WorkerConfig {

	@Bean(name="get")
	@Primary
	public Company getCompany() {
		Company company = new Company();
		company.setId(12);
		company.setName("Technoelevate...");
		return company;
	}
	
	@Bean(name="get1")
	public Company getCompany1() {
		Company company = new Company();
		company.setId(15);
		company.setName("Technoelevate.Developer...");
		return company;
	}

	@Bean(name="work")
	public Worker getWorkers() {
		return new Worker();
	}
}
