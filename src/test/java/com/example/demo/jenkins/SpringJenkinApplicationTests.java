package com.example.demo.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinApplicationTests {

	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringJenkinApplicationTests.class);

	
	@Test
	void contextLoads() {
		LOGGER.info("Application excuted test...");
		assertEquals(true, true);
	}
	
	@Test
	void testSecondUTLog() {
		LOGGER.info("The second UT....!");
	}

}
