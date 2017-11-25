package day4demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Day4WarmupTest {
	
	Day4Warmup a;

	@Before
	public void setUp() throws Exception {
		a = new Day4Warmup();
	}

	@After
	public void tearDown() throws Exception {
		a = null;
	}

	@Test
	public void testEvenNum() {
		boolean expected = true;
		boolean actual = a.even(4);
		assertEquals(expected, actual);
		
		// test an odd number
		expected = false;
		actual = a.even(3);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testZero() {
		boolean expected = true;
		boolean actual = a.even(0);
		assertEquals(expected, actual);
	}
}