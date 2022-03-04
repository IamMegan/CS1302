package prob1;

public class BasketballPlayer {
	
	private String name;
	private int freeThrowsAttempted;
	private int freeThrowsMade;
	private int threePointersAttempted;
	private int threePointersMade;
	private int twoPointersAttempted;
	private int twoPointersMade;
	
 	public BasketballPlayer(String name) {
 		this.name = name;
 	}
 	
 	public int getFreeThrowsAttempted() {
 		return freeThrowsAttempted;
 	}
 	
 	public int getFreeThrowsMade() {
 		return freeThrowsMade;
 	}
 	
 	public String getName() {
 		return name;
 	}
 	
 	public int getThreePointersAttempted() {
 		return threePointersAttempted;
 	}
 	
 	public int getThreePointersMade() {
 		return threePointersMade;
 	}
 	
 	public int getTwoPointersAttempted() {
 		return twoPointersAttempted;
 	}
 	
 	public int getTwoPointersMade() {
 		return twoPointersMade;
 	}
 	
 	public void shootFreeThrow (boolean isMade) {
 		freeThrowsAttempted++;
 		if(isMade) 
 			freeThrowsMade++;
 	}
 	
 	public void shootThreePointer(boolean isMade) {
 		threePointersAttempted++;
 		if(isMade)
 			threePointersMade++;
 	}
 	
 	public void shootTwoPointer(boolean isMade) {
 		twoPointersAttempted++;
 		if(isMade)
 			twoPointersMade++;
 	}
 	
 	public double getFreeThrowPercent() {
 		if(freeThrowsAttempted > 0) {
 			return 100 * freeThrowsMade/freeThrowsAttempted;
 		}
 		else
 			return 0;
 	}
 	
 	public double getThreePointerPercent() {
 		if(threePointersAttempted > 0)
 			return 100 * threePointersMade/threePointersAttempted;
 		else
 			return 0;
 	}
 	
 	public double getTwoPointerPercent() {
 		if(twoPointersAttempted > 0)
 			return 100 * twoPointersMade/twoPointersAttempted;
 		else 
 			return 0;
 	}
 	
 	public int getTotalPoints() {
 		return freeThrowsMade + 2*twoPointersMade + 3*threePointersMade; 
 	}
 	
 	@Override
 	public String toString() {
 		return "name: " + name + ", Free throws attempted: " + 
 		freeThrowsAttempted + ", Free throws made: " +
 		freeThrowsMade + ", Three pointers attempted: " +
 		threePointersAttempted + ", Three pointers made: " +
 		threePointersMade + ", Two Pointers Attempted: " +
 		twoPointersAttempted + ", Two Pointers Made: " +
 		twoPointersMade + ".";
 	}
}






