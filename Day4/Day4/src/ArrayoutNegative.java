import java.util.Scanner;

public class ArrayoutNegative {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("enter the number of overs :");
			int n=s.nextInt();
			s.nextLine();
			int arr[]=new int[n];
			System.out.println("enter the number of runs for each over:");
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
			}
			s.nextLine();
			int overnumber;
			System.out.println("enter the over number :");
			overnumber=s.nextInt();
			s.nextLine();
			
			System.out.println("runs scored in this  over :"+arr[overnumber-1]);
			
		} catch(NegativeArraySizeException e) {
			System.out.println(e.getClass());
		
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getClass());
			
		}
		

	}

}
