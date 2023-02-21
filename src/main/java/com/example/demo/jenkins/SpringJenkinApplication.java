package com.example.demo.jenkins;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinApplication {

	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringJenkinApplication.class);

	@PostConstruct
	public void init() {
		LOGGER.info("Application started...");
	}
	
	public static void main(String[] args) {
		LOGGER.info("Application excuted...");
		SpringApplication.run(SpringJenkinApplication.class, args);
	}

}
