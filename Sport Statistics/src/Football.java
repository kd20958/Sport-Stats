/**
 * 
 * @author Kevin
 *
 */
public class Football extends Sports {
	private int wins;
	
	public Football() {
		super();
		wins = 0;
	}
	
	public Football(String intialName, int initialWins) {
		super(intialName);
		wins = initialWins;
	}
	
	public void reset(String newName, int newWins) {
		setName(newName);
		wins = newWins;
	}
	
	public int getWins() {
		return wins;
	}
	
	public void setWins(int newWins) {
		wins = newWins;
	}
	
	public void writeOutput() {
		System.out.println("Team Name: " + getName());
		System.out.println("Amount of Wins: " + wins);
	}
	
	public boolean equals(Football otherFootball) {
		return this.hasSameName(otherFootball) && (this.wins == otherFootball.wins);
	}
}
