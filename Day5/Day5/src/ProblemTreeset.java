import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class ProblemTreeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		HashSet<String> hs = new HashSet<String>();
		for(int i=0;i<n;i++) {
			hs.add(sc.nextLine());
		}
		
		
		TreeSet<String> ts = new TreeSet<String>(hs);
		for(String i : ts)
		System.out.println(i);

	}

}
