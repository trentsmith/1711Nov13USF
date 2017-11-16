package com.revature.day3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CodingChallengesTest {
	
	CodingChallenges c;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
	}

	@Before
	public void setUp() throws Exception {
		c = new CodingChallenges();
		System.out.println("Setup");
	}

	@After
	public void tearDown() throws Exception {
		c = null;
		System.out.println("Teardown");
	}

	@Test
	public void testFactorial() {
		int expected = 120;
		int actual = c.factorial(5);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testFactorialZero() {
		assertNotEquals(0, c.factorial(5));
	}
	
	@Test
	public void testStringReverse() {
		String s = "antidisestablishmentarianism";
		assertEquals(new StringBuilder(s).reverse().toString(), c.reverseString(s) );
	}

}
