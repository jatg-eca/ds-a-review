package com.test.aritmeticas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestJupiter {
	
	Calculadora calculadora;
	
	@BeforeEach
	void setUp() {
		calculadora = new Calculadora();
	}

	@Test
	@DisplayName("Test UNo")
	void testUno() {
		assertTrue(calculadora.suma(1, 1) == 2);
	}

}
