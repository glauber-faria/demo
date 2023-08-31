package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculadoraServiceTest {
	@Autowired
	private CalculadoraService service;

	private int somar(int a, int b) {
		return service.somar(a, b);
	}

	@Test
	void somar1() {
		assertEquals(somar(1,4), 5);
	}
	
	@Test
	void somar2() {
		assertNotEquals(somar(1,7), 0);
	}

}
