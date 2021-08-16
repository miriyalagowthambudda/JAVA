import java.util.ArrayList;
import java.util.Scanner;

public class GayleList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count50 = 0, count100 = 0;
		System.out.println("enter the input");
		Scanner sc =  new Scanner(System.in);
		int n =sc.nextInt();
		sc.nextLine();;
		ArrayList<Integer> al = new ArrayList<Integer>(n);
		for(int i=0;i<n;i++) {
			al.add(sc.nextInt());
		}
		
		for(int i=0;i<n;i++) {
			if(al.get(i) >= 50 && al.get(i) < 100) {
				count50++;
			}
			else if(al.get(i) >= 100) {
				count100++;
				}
			}
		System.out.println(count50+"\n" + count100);

	}

}
