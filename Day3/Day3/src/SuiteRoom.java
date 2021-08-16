
public class SuiteRoom extends HotelRoom {
		private int ratePerSqFeet;

		public SuiteRoom(String hotelName, int numberOfSqFeet, boolean hadTV, boolean hasWifi, int ratePerSqFeet) {
			super(hotelName, numberOfSqFeet, hadTV, hasWifi);
			this.ratePerSqFeet = 15;
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
			
			this.ratePerSqFeet = ratePerSqFeet;
		
		}
		
		
		
		
}
