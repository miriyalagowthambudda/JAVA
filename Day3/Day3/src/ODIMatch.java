
public class ODIMatch  extends Match{
	private float maxOvers;

	public ODIMatch(int currentScore, float currentOver, int target,float maxOvers) {
		super(currentScore, currentOver, target);
		this.maxOvers=maxOvers;
		
	}

	@Override
	public float calculateRunRate(int currentScore,int target,float currentOver,float maxOver) {
		int runs;
		runs=(target-currentScore);
		float reqRunRate;
		int balls=(int)((maxOver-currentOver)/6);
		reqRunRate=(float)(runs/balls);
		System.out.println("need " +runs+ "in"+balls+"balls");
		System.out.println("requiredrunrate: "+reqRunRate);
		return reqRunRate;	
		
	}

	@Override
	public int calculateBalls(float curentOver,float maxOver) {
		int balls;
		balls =(int) ((maxOver-currentOver)/6);
		return balls;
	}

	@Override
	public void display(double runs, int balls) {
		double requiredRunRate=runs/balls;
		System.out.println("");
		
		
		// TODO Auto-generated method stub
		
	}
	
	
}
