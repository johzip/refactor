package refactor.test;
import refactor.*;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class Movie_Test {

	private Movie movie;
	private String title = "The Movie";
    private int priceCode = 20;

	@Before
	public void setUp() {
		movie = new Movie( title, priceCode);
	}

	@Test
	public void getPriceCode() {
		assertEquals( priceCode, movie.getPriceCode());
	}

	@Test
	public void getTitle() {
		assertEquals( title, movie.getTitle());
	}
}
