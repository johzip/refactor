package classes;

public class ReleasePrice extends Price {

	@Override
	public int getPriceCode() {
		return Movie.NEW_RELEASE;
	}

	@Override
	public double getCharge(int daysRented) {
		return daysRented * 3;	
	}

}
