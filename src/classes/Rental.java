package classes;
public class Rental {
    private Movie movie;
    private int daysRented;
    public Rental(Movie newmovie, int newdaysRented) {
        movie = newmovie;
        daysRented = newdaysRented;
    }
    public int getDaysRented() {
        return daysRented;
    }
    public Movie getMovie() {
        return movie;
    }
	public double getCharge() {
	    double amountResult = 0;
	    switch (getMovie().getPriceCode()) {
	        case Movie.REGULAR:
	            amountResult += 2;
	            if (getDaysRented() > 2)
	                amountResult += (getDaysRented() - 2) * 1.5;
	            break;
	        case Movie.NEW_RELEASE:
	            amountResult += getDaysRented() * 3;
	            break;
	        case Movie.CHILDRENS:
	            amountResult += 1.5;
	            if (getDaysRented() > 3)
	                amountResult += (getDaysRented() - 3) * 1.5;
	            break;
	    }
	    return amountResult;
	}
	
	public int getFrequentRenterPoints() {
		// add frequent renter points
		// add bonus for a two day new release rental
		if ((getMovie().getPriceCode() == Movie.NEW_RELEASE) && getDaysRented() > 1) 
		    return 2;
		return 1;
	} 
	
}