package com.test.aritmeticas;

import static org.junit.Assert.*;

import org.junit.Before;

import org.junit.Test;

public class CalcuTest {
	
	//Calculadora calculadora = new Calculadora();
	Calculadora calculadora;
	
	@Before
	public void setup() {
		calculadora = new Calculadora();
	}

	@Test
	public void testUno() {
		assertTrue(calculadora.suma(2, 2) == 4);
	}
	
	@Test
	public void testDos() {
		assertEquals(calculadora.resta(1, 2), -1);
	}
	
	@Test
	public void testTres() {
		assertTrue(calculadora.division(5, 1) == 5);
	}

}
