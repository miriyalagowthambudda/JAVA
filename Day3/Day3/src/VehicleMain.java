import java.util.Scanner;

public class VehicleMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String fuelType;
		String make;
		String vehicleNumber;
		int fuelCapacity;
		int cc;
		System.out.println("1.FourWheeler");
		System.out.println("2.TwoWheeler");
		System.out.println("enter the vehicle type:");
		int n = s.nextInt();
		s.nextLine();
		//do {
		
			
		switch(n) {
		
		case 1:
				System.out.println("vehicle make:");
				make=s.nextLine();
				System.out.println("vehilce number:");
				vehicleNumber=s.nextLine();
				System.out.println("fuel type:");
				System.out.println("1.Petrol");
				System.out.println("2.Diesel");
				int a=s.nextInt();
				s.nextLine();
	
				if(a==1) {
					fuelType="Petrol";
					
				}
				else {
					fuelType="Diesel";
				}
				System.out.println("Fuel Capacity: ");
				fuelCapacity = s.nextInt();
				System.out.println("Engine CC:");
			    cc= s.nextInt();
				s.nextLine();
				System.out.println("Audio System:");
				String audioSystem=s.nextLine();
				System.out.println(" no of doors:");
				int numberOfDoors=s.nextInt();
				s.nextLine();
				
				FourWheeler fw = new FourWheeler(make,vehicleNumber,fuelType,fuelCapacity,cc,audioSystem,numberOfDoors);
				fw.displayMake(make);
				fw.displayBasicInfo(vehicleNumber,fuelCapacity,fuelType,cc);
				fw.diplayDetailInfo(audioSystem,numberOfDoors);
				break;
				
			
		case 2:
				System.out.println("vehicle make:");
				make=s.nextLine();
				System.out.println("vehilce number:");
				vehicleNumber=s.nextLine();
				System.out.println("fuel type:");
				System.out.println("1.Petrol");
				System.out.println("2.Diesel");
				a=s.nextInt();
				s.nextLine();
	
				if(a==1) {
					fuelType="Petrol";
					
				}
				else {
					fuelType="Diesel";
				}
				System.out.println("Fuel Capacity: ");
				fuelCapacity = s.nextInt();
				System.out.println("Engine CC:");
				cc= s.nextInt();
				s.nextLine();
				System.out.println("kick start available:");
				boolean kickStartAvailable =s.nextBoolean();
				
				TwoWheeler tw = new TwoWheeler(make,vehicleNumber,fuelType,fuelCapacity,cc,kickStartAvailable);
				tw.displayMake(make);
				tw.displayBasicInfo(vehicleNumber, fuelCapacity, fuelType, cc);
				tw.displayDetailInfo(kickStartAvailable);
				
				
				
				
				
		
		}
		

	}
	
	

}
