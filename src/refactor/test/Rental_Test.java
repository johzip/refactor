package refactor.test;
import refactor.*;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class Rental_Test {

	private Rental rental;
	private Movie movie;
	private String title = "The Movie";
	private int daysRented = 36;

	@Before
	public void setUp() {
		movie = new Movie(title, 0);
		rental = new Rental(movie, daysRented);
	}	
	
	@Test
	public void getDaysRented() {
		assertEquals(daysRented, rental.getDaysRented());
	}

	@Test
	public void getMovie() {
		assertEquals(movie, rental.getMovie());
	}
}
