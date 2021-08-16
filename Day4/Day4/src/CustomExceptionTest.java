import java.util.Scanner;

public class CustomExceptionTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
		System.out.println("enter the player name: ");
		String name=s.nextLine();
		System.out.println("enter the player age  :");
		int age=s.nextInt();
		if(age<19) throw new InvalidAgeRangeException();
		print(name,age);
		}
		catch(InvalidAgeRangeException e) {
			System.out.println("custom exception: "+e);
			
		}

	}
	
	public static void print(String name,int age) {
		System.out.println("player name :"+name+"\n" +"player age :"+age);
	}

}
