package refactor.tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import refactor.classes.*;


public class MovieTest {

	private Movie movie;
	
	@Before
	public void setUp() {
		movie = new Movie("Toller Film", 0);
	}
	
	@Test
	public void getPriceCode() {
		assertEquals(0, movie.getPriceCode());
	}
	
	@Test
	public void getTitle() {
		assertEquals("Toller Film", movie.getTitle());
	}
}

