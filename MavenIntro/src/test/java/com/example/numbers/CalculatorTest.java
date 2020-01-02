package com.example.numbers;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

public class CalculatorTest {
final static Logger logger = Logger.getLogger(Calculator.class);
	static Calculator cal;
	//this 
	static ConstantValues cv = Mockito.mock(ConstantValues.class);
	
	@BeforeClass
	public static void beforeAll() {
		cal = new Calculator(cv);
		System.out.println("===============before all===============");
	}

	@AfterClass
	public static void afterAll() {
		System.out.println("===============after all===============");
	}

	@Before
	public void beforeTest() {
		System.out.println("===============before test===============");
	}

	@After
	public void afterTest() {
		System.out.println("===============before test===============");
	}

	@Test
	public void testAddition() {
//		cal.sum(40, 50);
		assertEquals(90, cal.sum(40,50));
	}
	@Test
	public void  testDivide() {
		logger.info("in the division test");
		System.out.println("in the division test");
		assertEquals(10, cal.divide(100, 10));
	}
@Test
public void testConversion() {
	Mockito.when(cv.getMile()).thenReturn(5280);
	assertEquals(5280.0, cal.convertMileToFeet(1),0.0);
}
}
