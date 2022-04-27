package student;
import java.util.*;

public class FlightManager {
	private AirportManager airportManager;
	private Map<String,Flight> flights = new HashMap<String,Flight>
	
	public FlightManager(AirportManager airportManager) {
		this.airportManager = airportManager;
	}
	
	public boolean addFlight(Flight flight) {
		//TODO
		return false;
	}
	
	public boolean addFlight(String number, String date, String originCode, String destinationCode, double cost) {
		//TODO
		return false;
	}
	
	public Flight getFlight(String number) {
		return null;
	}
	
	public List<Flight>	getFlightsByOrigin(String originCode){
		return null;
	}
	
	List<Flight> getFlightsByOrigin(String originCode, String date){
		return null;
	}
	
	List<Flight> getFlightsByOriginAndDestination(String originCode, String destinationCode, String date){
		return null;
	}
	
	public int getNumFlights(){
		return 0;
	}
	
	public Flight removeFlight(String number) {
		return null;
	}
	
}
