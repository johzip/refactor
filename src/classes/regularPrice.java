package classes;

public class regularPrice extends Price {

	@Override
	public int getPriceCode() {
		return Movie.REGULAR;
	}

	@Override
	public double getCharge(int daysRented) {
        int amountResult = 2;
        if (daysRented > 2)
            amountResult += (daysRented - 2) * 1.5;    	
	    return amountResult;
	
	}

}
