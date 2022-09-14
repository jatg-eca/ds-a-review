package com.test.aritmeticas;

import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class TestCalculadora extends TestCase {
	
	public Calculadora calculadora = new Calculadora();
	
	@Test
	void testSuma() {
		assertEquals(3, calculadora.suma(1, 2));
	}
}
