package classes;

public class ChildPrice extends Price {

	@Override
	public int getPriceCode() {
		return Movie.CHILDRENS;
	}
	
	@Override
	public double getCharge(int daysRented) {
		double amountResult = 1.5;
		if (daysRented > 3) {
			amountResult += (daysRented - 3) * 1.5;
		}
		return amountResult;
	}
}
