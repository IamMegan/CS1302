package student;

import java.io.*;
import java.util.*;

public class AirportManagerTest {
	 
	public static void main(String[] args) {
		//testGetAirport();
		//testGetAirportsByCity();
		testGetAirports();
	}
	
	public static void testGetAirport() {
		System.out.println("Test getAirport------");
		AirportManager manager = new AirportManager(AirportLoader.getAirportMap(new File("src/student/airports.txt")));
		Airport a = manager.getAirport("HSV");
		System.out.println("Expected: HSV-Huntsville, AL: 34.7, 86.8");
		System.out.println("Actual: " + a + "\n");
	}
	
	public static void testGetAirportClosestTo() {
		System.out.println("Test getAirportClosestTo------");
		//TODO
		System.out.println("Expected: ");
		System.out.println("Actual: ");
	}
	
	public static void testGetAirports() {
		System.out.println("Test getAirports------");
		AirportManager manager = new AirportManager(AirportLoader.getAirportMap(new File("src/student/airports.txt")));
		List<Airport> allPorts = manager.getAirports();
		System.out.println("Expected: All of the airports");
		System.out.println("Actual: ");
		for(Airport a : allPorts) {
			System.out.println(a);
		}
	}
	
	public static void testGetAirportsByCity() {
		System.out.println("Test getAirportsByCity------");
		AirportManager manager = new AirportManager(AirportLoader.getAirportMap(new File("src/student/airports.txt")));
		List<Airport> cityPorts = manager.getAirportsByCity("SanDiego");
		System.out.println("Expected:\nSDM-SanDiego, CA: 32.6, 117.0\nSEE-SanDiego, CA: 32.8, 117.0\nMYF-SanDiego, CA: 32.8, 117.1\nSAN-SanDiego, CA: 32.7, 117.2");
		System.out.println("Actual: " );
		for(Airport a : cityPorts) {
			System.out.println(a);
		}
		System.out.println("");
	}
	
	public static void testGetAirportsByCityState() {
		System.out.println("Test getAirportsByCityState------");
		//TODO
		System.out.println("Expected: ");
		System.out.println("Actual: ");
	}
	
	public static void testGetAirportsClosestTo() {
		System.out.println("Test getAirportsClosestTo------");
		//TODO
		System.out.println("Expected: ");
		System.out.println("Actual: ");
	}
	
	public static void testGetAirportsSortedBy() {
		System.out.println("Test getAirportsSortedBy------");
		//TODO
		System.out.println("Expected: ");
		System.out.println("Actual: ");
	}
	
	public static void testGetAirportsWithin1() {
		System.out.println("Test getAirportsWithin1------");
		//TODO
		System.out.println("Expected: ");
		System.out.println("Actual: ");
	}
	
	public static void testGetAirportsWithin2() {
		System.out.println("Test getAirportsWithin2------");
		//TODO
		System.out.println("Expected: ");
		System.out.println("Actual: ");
	}
	
	public static void testGetAirportsWithin3() {
		System.out.println("Test getAirportsWithin3------");
		//TODO
		System.out.println("Expected: ");
		System.out.println("Actual: ");
	}
	
	public static void testGetDistnceBetween1() {
		System.out.println("Test getDistanceBetween1------");
		//TODO
		System.out.println("Expected: ");
		System.out.println("Actual: ");
	}
	
	public static void testGetDistnceBetween2() {
		System.out.println("Test getDistanceBetween2------");
		//TODO
		System.out.println("Expected: ");
		System.out.println("Actual: ");
	}
	
	public static void testGetNWSNamedAirports() {
		System.out.println("Test getNWSNamedAirports------");
		//TODO
		System.out.println("Expected: ");
		System.out.println("Actual: ");
	}
}
	
