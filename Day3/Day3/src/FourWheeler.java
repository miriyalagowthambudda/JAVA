
public class FourWheeler extends Vehicle {
	private String audioSystem;
	private int numberOfDoors;

	public FourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc,String audioSystem,int numberOfDoors) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.audioSystem=audioSystem;
		this.numberOfDoors=numberOfDoors;
	}
	


	public String getAudioSystem() {
		return audioSystem;
	}



	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}



	public int getNumberOfDoors() {
		return numberOfDoors;
	}



	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public void displayBasicInfo(String vehicleNumber,int fuelCapacity,String fuelType,int cc) {
		super.displayBasicInfo(vehicleNumber,fuelCapacity,fuelType,cc);
		
	}

	public void displayMake(String make) {
		super.displayMake(make);
	}

	public void diplayDetailInfo(String audioSystem,int numberOfDoors) {
		super.displayDetailInfo();
		System.out.println("audio system:"+audioSystem);
		System.out.println("no of doors:"+numberOfDoors);
		
	}
	

}
