package tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import classes.*;


public class RentalTest {
	
	private Rental rental;
	private Movie movie;
	
	@Before
	public void setUp() {
		movie = new Movie("Toller Film", 0);
		rental = new Rental(movie, 76);
	}

	@Test
	public void getDaysRented() {
		assertEquals(76, rental.getDaysRented());
	}
	
	@Test
	public void getMovie() {
		assertEquals(movie, rental.getMovie());
	}
}