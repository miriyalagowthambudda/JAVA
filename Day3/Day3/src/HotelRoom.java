
public class HotelRoom {
	private String hotelName;
	private int numberOfSqFeet;
	private boolean hadTV;
	private boolean hasWifi;
	public HotelRoom(String hotelName, int numberOfSqFeet, boolean hadTV, boolean hasWifi) {
		super();
		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hadTV = hadTV;
		this.hasWifi = hasWifi;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getNumberOfSqFeet() {
		return numberOfSqFeet;
	}
	public void setNumberOfSqFeet(int numberOfSqFeet) {
		this.numberOfSqFeet = numberOfSqFeet;
	}
	public boolean isHadTV() {
		return hadTV;
	}
	public void setHadTV(boolean hadTV) {
		this.hadTV = hadTV;
	}
	public boolean isHasWifi() {
		return hasWifi;
	}
	public void setHasWifi(boolean hasWifi) {
		this.hasWifi = hasWifi;
	}
	
	public int calculateTariff(int numberOfSqFeet,int ratePerSqFeet) {
		int tariff=numberOfSqFeet*ratePerSqFeet;
		return tariff;
		
	}
	
	public int getRatePerSqFeet() {
		return 0;
	}

}
