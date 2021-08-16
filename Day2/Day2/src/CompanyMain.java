import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CompanyMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the company name");
		String name=s.nextLine();
		System.out.println("enter the employees");
		String input=s.nextLine();
		String team[]=input.split(",");
		System.out.println("enter teamlead");
		String teamlead = s.nextLine();
		int temp=0;
		Company e= new Company(name,input,teamlead);
		List<String> valid=Arrays.asList(team);
		if(valid.contains(teamlead)) {
			temp=1;
		}
		else {
			temp=0;
		}
		if(temp==0) {
			System.out.println("name :"+e.getName());
			System.out.println("emplotees :"+e.getEmployees());
			System.out.println("invalid input");
		}
		else {
			System.out.println("name :"+e.getName());
			System.out.println("emplotees :"+e.getEmployees());
			System.out.println("teamlead :"+e.getTeamlead());
		}
		
		
		
		
	}

}
