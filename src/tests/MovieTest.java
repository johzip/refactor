package tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import classes.*;


public class MovieTest {

	private String filmName = "Der FilmFilm";
	private Movie movie;
	
	@Before
	public void setUp() {
		movie = new Movie(filmName, 1);
	}
	
	@Test
	public void getPriceCode() {
		assertEquals(13, movie.getPriceCode());
	}
	
	@Test
	public void getTitle() {
		assertEquals(filmName, movie.getTitle());
	}
}

