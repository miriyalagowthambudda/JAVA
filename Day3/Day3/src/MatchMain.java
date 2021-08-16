import java.util.Scanner;

public class MatchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int currentScore;
		float currentOver;
		int target;
		float maxOvers;
		System.out.println("enter the match format:");
		System.out.println("1. ODI");
		System.out.println("2. T20");
		System.out.println("3. Test");
		int n=s.nextInt();
		s.nextLine();
		
		switch(n) {
		
		case 1:
				System.out.println("enter the current score");
				currentScore=s.nextInt();
				s.nextLine();
				
				System.out.println("enter the current over");
				currentOver = s.nextFloat();
				s.nextLine();
				
				System.out.println("enter the target score");
				target=s.nextInt();
				s.nextLine();
				maxOvers=(float)50.0;
				
				Match m1=new ODIMatch(currentScore,currentOver,target,maxOvers);
				System.out.println("Requirements:");
				m1.calculateRunRate(currentScore, target, currentOver, maxOvers);
				break;
				
		case 2:
				System.out.println("enter the current score");
				currentScore=s.nextInt();
				s.nextLine();
				
				System.out.println("enter the current over");
				currentOver = s.nextFloat();
				s.nextLine();
				
				System.out.println("enter the target score");
				target=s.nextInt();
				s.nextLine();
				maxOvers=(float)90.0;
				
				Match m2 = new TestMatch(currentScore,currentOver,target,maxOvers);
				System.out.println("Requirements :");
				m2.calculateRunRate(currentScore, target, currentOver, maxOvers);
				break;
				
		case 3:
				System.out.println("enter the current score");
				currentScore=s.nextInt();
				s.nextLine();
				
				System.out.println("enter the current over");
				currentOver = s.nextFloat();
				s.nextLine();
				
				System.out.println("enter the target score");
				target=s.nextInt();
				s.nextLine();
				
				
				
				
				
				
		
		}
	}

}
