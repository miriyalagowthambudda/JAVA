import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String first = sc.nextLine();
		String second = sc.nextLine();
		String a = first.substring(0,1);
		String b = first.substring(1,first.length());
		a=a.toUpperCase();
		first = a.concat(b);
		second = second.toUpperCase();
		String result = first+" "+second;
		
		System.out.println(result);
		
		
		
		
	}

}
