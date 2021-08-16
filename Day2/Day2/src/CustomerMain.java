import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String input = br.readLine();
		//String arr[] = br.readLine().trim().split(",");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the details");
		String input = s.nextLine();
		String arr[]=input.split(",");
		String name=arr[0];
		String address = arr[1];
		String mobile = arr[2];
		
		Customer e = new Customer(name,address,mobile);
		System.out.println("name :" +e.getName());
		System.out.println("address :"+e.getAddress());
		System.out.println("mobile :"+e.getMobile());
		
	}

}
