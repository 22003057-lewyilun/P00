import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * yilun 20/4/3023 10.00
 */

public class CalculatorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testadd() {
//		fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 9999;
		assertEquals(expected,actual);
	}
	@Test
	public void testsubract() {
//		fail("Not yet implemented");
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 5555;
		assertEquals(expected,actual);
	}
	@Test
	public void testmultiple() {
//		fail("Not yet implemented");
		int a = 5;
		int b = 8;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		int expected =40;
		assertEquals(expected,actual);
	}
	@Test
	public void testdevide() {
//		fail("Not yet implemented");
		int a = 40;
		int b = 8;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected =5;
		assertEquals(expected,actual);
	}
}
