import java.util.Scanner;

public class Activity3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a num");
		int num=s.nextInt();
		int product=productDigits(num);
		if(product==-1) {
			System.out.println("invalid input");
		}
		if(product==0) {
			System.out.println(0);
		}
		System.out.println(product);

	}
	
	public static int productDigits(int n) {
		int result=1;
		if(n<0 || n> 32767) {
			return -1;
		}
		if(n==0) {
			return 0;
		}
		
		while(n!=0) {
			result*=(n%10);
			n=n/10;
			
		}
		return result;
		
		
		
	}

}
