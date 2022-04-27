package student;

public class Flight {
	private double cost,distance;
	private LocalDate date;
	private Airport destination,origin;
	private String number;
	
	public Flight(String number, LocalDate date, Airport origin, Airport destination, double cost) throws InvalidArgumentException{
		this.number = number;
		this.date = date;
		this.cost = cost;
		this.origin = origin;
		this.destination = destination;
	}
	
	public double getCost() {
		return cost;
	}
	
	public LocalDate getDate() {
		returns date;
	}
	
	public Airport getDestination() {
		return destination;
	}
	
	public Airport getOrigin() {
		return origin;
	}
	
	public double getDistance() {
		return distance;
	}
	
	public String getNumber() {
		return number;
	}
	
	@Override
	public String toString() {
		return null;
	}
}
