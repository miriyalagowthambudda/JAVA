
public abstract class Match {
	private int currentScore;
	protected float currentOver;
	private int target;
	public Match(int currentScore, float currentOver, int target) {
		super();
		this.currentScore = currentScore;
		this.currentOver = currentOver;
		this.target = target;
	}
	public int getCurrentScore() {
		return currentScore;
	}
	public void setCurrentScore(int currentScore) {
		this.currentScore = currentScore;
	}
	public float getCurrentOver() {
		return currentOver;
	}
	public void setCurrentOver(float currentOver) {
		this.currentOver = currentOver;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	
	public abstract float calculateRunRate(int currentScore,int target,float currentOver,float maxOver);
	public abstract int calculateBalls(float currentOver,float maxOver);
	public abstract void display(double reqRunrate,int balls);

}
