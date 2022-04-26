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
		//TODO
	}
	
	public List<Airport> getAirportsClosestTo(String code, int num){
		return null;
		//TODO
	}
	
	public List<Airport> getAirports(){
		 List<Airport> airportsList = new ArrayList<Airport>(airports.values());
		 return airportsList;
	}
	
	public List<Airport> getAirportsByCity(String city){
		List<Airport> cityList = new ArrayList<Airport>();
		for(Airport a : airports.values()) {
			if(a.getCity().equals(city)) {
				cityList.add(a);
			}
		}
		return cityList;
	}
	
	public List<Airport> getAirportsByCityState(String city, String state){
		List<Airport> cityStateList = new ArrayList<Airport>();
		for(Airport a : airports.values()) {
			if(a.getCity().equals(city) && a.getState().equals(state)) {
				cityStateList.add(a);
			}
		}
		return cityStateList;
	}
	
	public List<Airport> getAirportsWithin(double withinDist, double lat, double lon){
		return null;
		//TODO
	}
	
	public List<Airport> getAirportsWithin(double withinDist, String code){
		return null;
		//TODO
	}
	
	public List<Airport> getAirportsWithin(double withinDist, String code1, String code2){
		return null;
		//TODO
	}
	
	public double getDistanceBetween(Airport airport1, Airport airport2) {
		return 0;
		//TODO
	}
	
	public double getDistanceBetween(String code1, String code2) {
		return 0;
		//TODO
	}
	
	public List<Airport> getNWSNamedAirports(){
		return null;
		//TODO
	}
	
}
