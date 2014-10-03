/**
 * 
 * @author Kevin
 *
 */
public class Sports {
	private String name;
	
	public Sports() {
		name = "no name yet";	
	}
	
	public Sports(String initialName) {
		name = initialName;
	}
	
	public void setName(String newName){
		name = newName;
	}
	
	public String getName() {
		return name;
	}
	
	public void writeOutput() {
		System.out.println("Name of team: " + name);
	}
	
	public boolean hasSameName(Sports otherSports) {
		return this.name.equalsIgnoreCase(otherSports.name);
	}
	
}