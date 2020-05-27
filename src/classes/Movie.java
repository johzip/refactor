package classes;
public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    private Price price;
    public Movie(String newtitle, int newpriceCode) {
        title = newtitle;
        setPriceCode(newpriceCode);
    }
    private void setPriceCode(int newpriceCode) {
    	switch(newpriceCode) {
    		case REGULAR:
    			price = new regularPrice();    			
    			return;
    		case NEW_RELEASE:
    			price = new ReleasePrice();
    			return;
    		case CHILDRENS:
    			price = new ChildPrice();
    			return;
    		default:
    			throw new IllegalArgumentException("Incorrect Price Code");
    	}
    			
	}
	public int getPriceCode() {
        return price.getPriceCode();
    }
    public String getTitle (){
        return title;
    }
	/**
	 * @deprecated Use {@link classes.Price#getCharge(classes.Movie,int)} instead
	 */
	public double getCharge(int daysRented) {
		return price.getCharge(this, daysRented);
	}
}