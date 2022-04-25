package student;

public class AirportTest {
	public static void main(String[] args) {
		//testEquals();
		testToString();
	}
	
	public static void testEquals() {
		Airport a1 = new Airport("ANB");
		Airport a2 = new Airport("ANB");
		Airport a3 = new Airport("HSV");
		System.out.println("Expected: true");
		System.out.println("Actual: " + a1.equals(a2));
		System.out.println("Expected: false");
		System.out.println("Actual: " + a1.equals(a3));
		
	}
	
	public static void testToString() {
		Airport a1 = new Airport("ANB",33.58, 85.85, "Anniston", "AL");
		System.out.println("Expected: ANB-Anniston, AL: 33.6, 85.9");
		System.out.println("Actual: " + a1);
	}
}
