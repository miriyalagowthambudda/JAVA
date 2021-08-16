import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithmeticandNumFormat {

	public static void main(String[] args)  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
		int totalruns;
		System.out.println("enter the total runs scored:");
		totalruns=Integer.parseInt(br.readLine());
		int totalovers;
		System.out.println("enter total overs faced:");
		totalovers=Integer.parseInt(br.readLine());
		
		float runrate=(float)(totalruns/totalovers);
		System.out.println("current run rate is: "+runrate);
		
		} catch(IOException | NumberFormatException |ArithmeticException e) {
			System.out.println(e.getClass());
			
		}
		
		
		/*catch (NumberFormatException ex ) {
			System.out.println("Number format exception :" +ex.getClass());
		} catch (ArithmeticException ex) {
			System.out.println("Arithmetic exception :"+ex.getClass());
		} catch(IOException ex) {
			System.out.println("IOException :"+ex.getClass());
		}*/
		
		
	}

}
