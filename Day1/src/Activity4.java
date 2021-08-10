import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Activity4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int arr[][]=new int[n][2];
		for(int i=0;i<n/2;i++) {
			int a=s.nextInt();
			int b=s.nextInt();
			arr[a][0]=b;
		}
		for(int i=0;i<n/2;i++) {
			int a=s.nextInt();
			int b=s.nextInt();
			arr[a][1]=b;
		}
		
		for(int k=0;k<n;k++) {
			if(arr[k][0]!=0 ||arr[k][1]!=0) {
				int maxi=Math.max(arr[k][0], arr[k][1]);
				System.out.println(k);
				System.out.println(maxi);
			}
		}
		
		
		//highestFeedBack(arr1,arr2,n);
		

	}
	
	
			
			
		
		
		
		
		
	

}
