import java.util.Scanner;

public class HotelRoomTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String hotelName;
		int numberOfSqFeet;
		boolean hasTV;
		boolean hasWifi;
		int ratePerSqFeet;
		System.out.println("hotel tariff calculator");
		System.out.println("1.DeluxeRoom");
		System.out.println("2.DeluxeACRoom");
		System.out.println("3.SuiteRoom");
		System.out.println("select Room type");
		int n=s.nextInt();
		s.nextLine();
		
		switch(n) {
		
		case 1:
				System.out.println("hotel name:");
				hotelName=s.nextLine();
				System.out.println("room square feet area:");
				numberOfSqFeet=s.nextInt();
				s.nextLine();
				System.out.println("room has tv yes/no :");
				hasTV=s.nextBoolean();
				System.out.println("room has wifi or not :");
				hasWifi=s.nextBoolean();
				ratePerSqFeet=10;
				
				DeluxeRoom d = new DeluxeRoom(hotelName,numberOfSqFeet,hasTV,hasWifi,ratePerSqFeet);
				d.calculateTariff(numberOfSqFeet, ratePerSqFeet);
				break;
				
		
		case 2:
				System.out.println("hotel name:");
				hotelName=s.nextLine();
				System.out.println("room square feet area:");
				numberOfSqFeet=s.nextInt();
				s.nextLine();
				System.out.println("room has tv yes/no :");
				hasTV=s.nextBoolean();
				System.out.println("room has wifi or not :");
				hasWifi=s.nextBoolean();
				ratePerSqFeet=12;
				
				DeluxeAcRoom dac=new DeluxeAcRoom(hotelName,numberOfSqFeet,hasTV,hasWifi,ratePerSqFeet);
				dac.calculateTariff(numberOfSqFeet, ratePerSqFeet);
				break;
				
		
		case 3:
				System.out.println("hotel name:");
				hotelName=s.nextLine();
				System.out.println("room square feet area:");
				numberOfSqFeet=s.nextInt();
				s.nextLine();
				System.out.println("room has tv yes/no :");
				hasTV=s.nextBoolean();
				System.out.println("room has wifi or not :");
				hasWifi=s.nextBoolean();
				ratePerSqFeet=15;
				
				SuiteRoom sr= new SuiteRoom(hotelName,numberOfSqFeet,hasTV,hasWifi,ratePerSqFeet);
				sr.calculateTariff(numberOfSqFeet, ratePerSqFeet);
				break;
				
		
		}
		
	}

}
