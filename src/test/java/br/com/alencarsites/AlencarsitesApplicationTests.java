package br.com.alencarsites;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AlencarsitesApplicationTests {

	@Autowired
	AlencarsitesApplication alencarsitesApplication;

	@Test
	void contextLoads() {
		Assertions.assertNotNull(alencarsitesApplication);
	}

}
