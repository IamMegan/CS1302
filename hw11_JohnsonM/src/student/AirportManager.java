package student;
import java.util.*;

public class AirportManager {
	private Map<String,Airport> airports = new HashMap<String,Airport>();
	
	public AirportManager(Map<String,Airport> airports) {
		this.airports = airports;
	}
	
	public Airport getAirport(String code) {
		if(airports.containsKey(code)) {
			return airports.get(code);
		}
		return null;
	}
	
	public Airport getAirportClosestTo(String code) {
		return null;
	}
	
	public List<Airport> getAirports(){
		List<Airport> airportsList = new ArrayList<Airport>();
		for(Airport airport : this.airports.values()) {
			airportsList.add(airport);
		}
		return airportsList;
	}
}
