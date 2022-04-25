package student;
import java.io.*;
import java.util.*;

public class AirportLoader {
	public AirportLoader() {}
	
	public static Map<String,Airport> getAirportMap(File airportFile){
		Map<String, Airport> airports = new HashMap<String,Airport>();
		try {
			Scanner scan = new Scanner(airportFile);
			while(scan.hasNext()) {
				String code = scan.next();
				double lat = scan.nextDouble();
				double longe = scan.nextDouble();
				String city = scan.next();
				String state = scan.next();
				Airport a = new Airport(code, lat, longe, city, state);
				airports.put(code,a);
			}
			scan.close();
			return airports;
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			return airports;
		}
		
	}
}
