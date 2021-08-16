import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter name:");
		String name=s.nextLine();
		System.out.println("entr address :");
		String address = s.nextLine();
		System.out.println("enter mobile number :");
		String mobile=s.nextLine();
		System.out.println("Employee Details");
		Employee e = new Employee(name,address,mobile);
		System.out.println("name:" +e.getName());
		System.out.println("address:" +e.getAddress());
		System.out.println("mobile:" +e.getMobile());
		
		System.out.println("verify and update the details");
		System.out.println("Menu");
		System.out.println("1. update Employee name");
		System.out.println("2. update Employee address");
		System.out.println("3. update Employee mobile");
		System.out.println("4. all information correct/exit");
		
		int n=s.nextInt();
		s.nextLine();
		switch(n) {
		case 1: 
				System.out.println("current name is:"+e.getName());
				System.out.println("enter the name");
				String name1=s.nextLine();
				e.setName(name1);
				break;
		
		case 2:

				System.out.println("current address is:"+e.getAddress());
				System.out.println("enter the address");
				String address1=s.nextLine();
				e.setAddress(address1);
				break;
				
		case 3:
				System.out.println("current mobile number is:"+e.getMobile());
				System.out.println("enter the mobile number");
				String mobile1=s.nextLine();
				e.setMobile(mobile1);
				break;
				
		case 4:

				System.out.println("the details are");
				System.out.println("name:" +e.getName());
				System.out.println("address:" +e.getAddress());
				System.out.println("mobile:" +e.getMobile());
				break;
				
				
			
		}
		
	}

}
