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
	
	@Bean
	public DataSource dataSource() {
		EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
		EmbeddedDatabase db = builder
			.setType(EmbeddedDatabaseType.H2)
			.build();
		return db;
	}

	
	@PostConstruct
	public void startDBManager() {

		//DatabaseManagerSwing.main(new String[] { "--url", "jdbc:derby:/Users/lukaszkowalczyk/derby:data;create=true", "--user", "", "--password", "" });


	}
	
	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(CarolinaDbApplication.class);
	    builder.headless(false).run(args);
	}
}
