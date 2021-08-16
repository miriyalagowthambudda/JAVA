import java.util.Scanner;

public class InningsMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the teamname");
		String name = s.nextLine();
		System.out.println("enter session");
		String session = s.nextLine();
		System.out.println("enter runs");
		int run = s.nextInt();
		
		Innings e = new Innings(name,session,run);
		e.displayInningsDetails(name,session,run);
	}

}
