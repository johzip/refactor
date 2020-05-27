package classes;

public abstract class Price {

	public abstract int getPriceCode();

	public double getCharge(Movie movie, int daysRented) {
	    double amountResult = 0;
	    switch (movie.getPriceCode()) {
	        case Movie.REGULAR:
	            amountResult += 2;
	            if (daysRented > 2)
	                amountResult += (daysRented - 2) * 1.5;
	            break;
	        case Movie.NEW_RELEASE:
	            amountResult += daysRented * 3;
	            break;
	        case Movie.CHILDRENS:
	            amountResult += 1.5;
	            if (daysRented > 3)
	                amountResult += (daysRented - 3) * 1.5;
	            break;
	    }
	    return amountResult;
	}

}
