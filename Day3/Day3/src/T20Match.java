
public class T20Match extends Match{
	private float maxOvers;

	public T20Match(int currentScore, float currentOver, int target,float maxOvers) {
		super(currentScore, currentOver, target);
		this.maxOvers=(float)20.0;
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public float calculateRunRate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int calculateBalls() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void display(double reqRunrate, int balls) {
		// TODO Auto-generated method stub
		
	}
	

}
