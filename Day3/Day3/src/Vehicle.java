
public class Vehicle {
	private String make;
	private String vehicleNumber;
	private String fuelType;
	private int fuelCapacity;
	private int cc;
	
	public Vehicle(String make, String vehicleNumber, String fuelType,int fuelCapacity,int cc) {
		this.make=make;
		this.vehicleNumber=vehicleNumber;
		this.fuelType=fuelType;
		this.fuelCapacity=fuelCapacity;
		this.cc=cc;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}
	
	public void displayMake(String make) {
		System.out.println("display the make of vehicle: " +make);
	}
	
	public void displayBasicInfo(String vehilceNumber,int fuelCapacity,String fuelType,int cc ) {
		System.out.println("basic information of the vehicle");
		System.out.println("vehicle number:"+vehicleNumber);
		System.out.println("fuel capacity:"+fuelCapacity);
		System.out.println("fuel type:"+fuelType);
		System.out.println("cc:"+cc);
		
	}
	
	public void displayDetailInfo() {
		
		
	}
}
