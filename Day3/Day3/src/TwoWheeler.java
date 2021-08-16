
public class TwoWheeler extends Vehicle {
	private boolean kickStartAvailable;

	public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc,boolean kickStartAvilable) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.kickStartAvailable=kickStartAvailable;
	}
	
	
	
	public boolean isKickStartAvailable() {
		return kickStartAvailable;
	}



	public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}

	public void displayMake(String make) {
		super.displayMake(make);
		
	}
	
	public void displayBasicInfo(String vehicleNumber,int fuelCapacity,String fuelType,int cc) {
		super.displayBasicInfo(vehicleNumber, fuelCapacity, fuelType, cc);
		
	}


	public void displayDetailInfo(boolean kickStartAvailable) {
		super.displayDetailInfo();
		System.out.println("kickStartAvailable:" +kickStartAvailable);
		
	}
	
	

}
