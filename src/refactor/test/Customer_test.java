package refactor.test;

import refactor.*;
import static org.junit.Assert.*;

import org.junit.*;

public class Customer_test {
	Customer testCustomer;
	String testName;
	
	@Before
	public void creat() {
		testName = "Johannes Zipfel";
		testCustomer = new Customer(testName);
	}
	
	@Test
	public void test() {
		assertTrue(testCustomer.getName().equals(testName));		
	}

}
