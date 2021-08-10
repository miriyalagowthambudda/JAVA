import java.util.Scanner;

public class Activity2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		int n = s.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=s.nextInt();
		}
		
		if(n<0) {
			System.out.println("Invalid input");
			System.exit(0);
		}
		for(int i=0;i<n;i++) {
			if(array[i]<0) {
				System.out.println("Invalid input");
				System.exit(0);
				
			}
		}
			
		int repeaters=countRepeaters(array,n);
		System.out.println(repeaters);

	}
	
	public static int countRepeaters(int a[],int b) {
		int count=0;
		for(int i=0;i<b;i++) {
			for(int j=i+1;j<b;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
		}
		return count;
		
	}

}
