import java.util.HashSet;
import java.util.Scanner;

public class ProblemHahset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the input");
		int n=s.nextInt();
		s.nextLine();
		HashSet<String> hs=new HashSet<String>(n);
		for(int i=0;i<n;i++)
		{
			
			hs.add(s.nextLine());
			
		}
		System.out.println(hs);
		System.out.println(hs.size());

	}

}
