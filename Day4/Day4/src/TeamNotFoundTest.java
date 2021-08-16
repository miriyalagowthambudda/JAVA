import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class TeamNotFoundTest {
	public static void main(String args[]) {
	Scanner s = new Scanner(System.in);
	try {
	String arr[]= {"Chennai Super Kings","Sun Risers Hyderabad","Delhi Capitals","Kings XI Punjab","Kolkata Knight Riders","Mumbai Indians","Rajasthan Royals","Royal Challengers Bangalore"};
	System.out.println("enter the expected winner of ipl 13 :");
	String expwin=s.nextLine();
	boolean temp=Arrays.asList(arr).contains(expwin);
	if(!temp) throw new TeamNameNotFoundException();
	System.out.println("enter the expected runner of ipl 13 :");
	String exprun=s.nextLine();
	boolean temp1=Arrays.asList(arr).contains(exprun);
	if(!temp1) throw new TeamNameNotFoundException();
	else {
		
		String winner=getRandomElement(arr);
		System.out.println("expected ipl season 13 winner :"+winner);
		String runner=getRandomElement(arr);
		System.out.println("expected ipl season 13 runner :"+runner);
		
	}
	} catch(TeamNameNotFoundException e) {
		System.out.println(e.getClass());
		
	}
	}
	
	public static String getRandomElement(String arr[]) {
		return arr[ThreadLocalRandom.current().nextInt(arr.length)];
		
	}
	
}
	

