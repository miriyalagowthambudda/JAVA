public class Innings {
	private String teamname;
	private String inningsname;
	private int runs;
	
	public Innings(String teamname,String inningsname,int runs) {
		this.teamname=teamname;
		this.inningsname=inningsname;
		this.runs=runs;
	}

	/**
	 * @return the teamname
	 */
	public String getTeamname() {
		return teamname;
	}

	/**
	 * @param teamname the teamname to set
	 */
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	/**
	 * @return the inningsname
	 */
	public String getInningsname() {
		return inningsname;
	}

	/**
	 * @param inningsname the inningsname to set
	 */
	public void setInningsname(String inningsname) {
		this.inningsname = inningsname;
	}

	/**
	 * @return the runs
	 */
	public int getRuns() {
		return runs;
	}

	/**
	 * @param runs the runs to set
	 */
	public void setRuns(int runs) {
		this.runs = runs;
	}
	
	public static void displayInningsDetails(String name,String session,int run) {
		if(session.equals("First")) {
			System.out.println("name:"+name);
			System.out.println("scored :"+run);
			System.out.println(" Need " + (run+1) + " to win ");
		}
		else {
			System.out.println("name:"+name);
			System.out.println("scored :"+run);
			System.out.println("match ended");
			
			
		}
		
	}

}
