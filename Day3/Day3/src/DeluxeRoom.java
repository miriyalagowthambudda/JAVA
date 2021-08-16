
public class DeluxeRoom extends HotelRoom {
	
	protected int ratePerSqFeet;

	public DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hadTV, boolean hasWifi, int ratePerSqFeet) {
		super(hotelName, numberOfSqFeet, hadTV, hasWifi);
		this.ratePerSqFeet = 10;
	}

	public int getRatePerSqFeet() {
		if(isHasWifi()) {
			return (ratePerSqFeet+2);
		}
		else {
		return ratePerSqFeet;
		}
	}

	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet=ratePerSqFeet;
	}

	public int calculateTariff(int numberOfSqFeet,int ratePerSqFeet) {
	int tariff=	super.calculateTariff(numberOfSqFeet,ratePerSqFeet);
	System.out.println("room tariff per day :" +tariff);
	return tariff;
		
		
	}
	

}
