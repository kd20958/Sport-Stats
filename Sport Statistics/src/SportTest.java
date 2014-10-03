/**
 * 
 * @author Kevin
 *
 */
public class SportTest {
	
	public static void main(String[] args) {
		Basketball clippers = new Basketball();
		Basketball lakers = new Basketball();
		Football eagles = new Football();
		Football redskins = new Football();
		
		System.out.println("-Basketball Teams;\n ");
		clippers.setName("Clippers");
		clippers.setWins(6391);
		clippers.writeOutput();
		
		lakers.setName("Lakers");
		lakers.setWins(2936);
		lakers.writeOutput();
		
		System.out.println("\n-Football Teams;\n ");
		eagles.setName("Eagles");
		eagles.setWins(550);
		eagles.writeOutput();
		
		redskins.setName("Redkins");
		redskins.setWins(588);
		redskins.writeOutput();
		
	}
}
