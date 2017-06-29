package com.pimeyes.carolinaDB;

import javax.annotation.PostConstruct;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.pimeyes")
public class CarolinaDbApplication {
	

	
	@PostConstruct
	public void postConstruct() {



	}
	
	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(CarolinaDbApplication.class);
	    builder.headless(false).run(args);
	}
}
