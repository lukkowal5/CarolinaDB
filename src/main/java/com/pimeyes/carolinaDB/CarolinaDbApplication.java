package com.pimeyes.carolinaDB;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;


@SpringBootApplication
public class CarolinaDbApplication {
	

	
	@PostConstruct
	public void postConstruct() {



	}
	
	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(CarolinaDbApplication.class);
	    builder.headless(false).run(args);
	}
}
