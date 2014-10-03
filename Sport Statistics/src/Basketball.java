/**
 * 
 * @author Kevin
 *
 */
public class Basketball extends Sports {
	private int wins;
	
	public Basketball() {
		super();
		wins = 0;
	}
	
	public Basketball(String intialName, int initialWins) {
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
	
	public boolean equals(Basketball otherBasketball) {
		return this.hasSameName(otherBasketball) && (this.wins == otherBasketball.wins);
	}
}
