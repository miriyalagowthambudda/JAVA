import java.util.Comparator;

public class Player2 {
	private String name;
	

	@Override
	public String toString() {
		return "Player2 [name=" + name + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Player2(String name) {
		super();
		this.name = name;
	}


	public int compareTo(Player2 o1) {
		
		return this.name.compareTo(o1.getName());
	}


	}


