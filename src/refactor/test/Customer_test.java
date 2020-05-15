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
	public void getNAme() {
		assertTrue(testCustomer.getName().equals(testName));		
	} 
	
	@Test
	public void statement() {
		String statement = "Rental Record for " + testName + "testName" + "\n";
		statement += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";
		statement += "Amount owed is " + "0.0" + "\n";
        statement += "You earned " + "0" + " frequent renter points";

		assertEquals(statement, testCustomer.statement());
	}
	
}
