package com.project.reports;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test") // Force use of "test" profile
class ReportGeneratorApplicationTests {

	@Test
	void contextLoads() {
		// Basic test to check the context
	}
}