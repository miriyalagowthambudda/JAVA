import java.util.Scanner;

public class Activity1 {

	public static void main(String[] args) {
		System.out.println("enter a number:");
		System.out.println("emter no of modules:");
		Scanner s = new Scanner(System.in);
		int salary = s.nextInt();
		int shifts = s.nextInt();
		int save=calculateSal(salary,shifts);
		System.out.println(save);
		if(save>8000) {
			System.out.println("Salary too large");
		}
		if(shifts<0) {
			System.out.println("Shifts too small");
		}
		if(salary<0) {
			System.out.println("Salary too small ");
		}
		

	}
	
	public static int calculateSal(int a,int b) {
		int saving,temp1,temp2=0;
		temp1=(int) ((a)*(0.5));
		temp2=(int) ((a)*(0.02));
		saving = temp1+(temp2*b);
		return saving;
	}

}
