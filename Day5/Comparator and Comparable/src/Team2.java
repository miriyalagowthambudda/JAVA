import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Team2  {

	
	private String name;
	ArrayList<Player2> playerList = new ArrayList<Player2>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Player2> getPlayerList() {
		Collections.sort(playerList, new Comparator<Player2>() {

			
			@Override
			public int compare(Player2 o1, Player2 o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
				
			}

			
		});
		return playerList;
	}
	public void setPlayerList(ArrayList<Player2> playerList) {
		this.playerList = playerList;
	}
	public Team2(String name) {
		super();
		this.name = name;
		
	}
	@Override
	public String toString() {
		return "Team [name=" + name + ", playerList=" + playerList + "]";
	}
	
	public void addPlayer(String playername) {
		playerList.add(new Player2(playername));
		
	}
	public Team2(String name, ArrayList<Player2> playerList) {
		super();
		this.name = name;
		this.playerList = playerList;
	}
	
}