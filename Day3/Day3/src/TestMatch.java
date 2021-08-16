
public class TestMatch extends Match {
	private float maxOvers;

	public TestMatch(int currentScore, float currentOver, int target,float maxOvers) {
		super(currentScore, currentOver, target);
		this.maxOvers=(float)90.0;
		// TODO Auto-generated constructor stub
	}

	public float calculateRunRate(int currentScore, float currentOver, int target,float maxOver) {
		int runs;
		runs=(target-currentScore);
		float reqRunRate;
		int balls=(int)((maxOver-currentOver)/6);
		reqRunRate=(float)(runs/balls);
		System.out.println("need " +runs+ "in"+balls+"balls");
		System.out.println("requiredrunrate: "+reqRunRate);
		return reqRunRate;
	}

	public int calculateBalls() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void display(double reqRunrate, int balls) {
		// TODO Auto-generated method stub
		
	}
	

}
