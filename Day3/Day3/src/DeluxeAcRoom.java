
public class DeluxeAcRoom extends DeluxeRoom {

	public DeluxeAcRoom(String hotelName, int numberOfSqFeet, boolean hadTV, boolean hasWifi, int ratePerSqFeet) {
		super(hotelName, numberOfSqFeet, hadTV, hasWifi, 12);
		
	}
	
	public int calculateTariff(int numberOfSqFeet,int ratePerSqFeet) {
		int tariff=super.calculateTariff(numberOfSqFeet, ratePerSqFeet);
		System.out.println("room tariff per day :"+tariff);
		return tariff;
	}

}
