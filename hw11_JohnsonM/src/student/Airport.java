package student;

public class Airport {
	private String city;
	private String code;
	private double latitude,longitude;
	private String state;
	
	protected Airport(String code) {
		this.code = code;	
	}
	
	protected Airport(String code, double latitude, double longitude, String city, String state) {
		this.code = code;
		this.latitude = latitude;
		this.longitude = longitude;
		this.city = city;
		this.state = state;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Airport) {
			Airport airport = (Airport)o;
			if(this.code.equals(airport.code)) {
				return true;
			}
			return false;
		}
		return false;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getCode() {
		return code;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}
	
	public String getState() {
		return state;
	}
	
	@Override
	public String toString() {
		return String.format("%s-%s, %s: %.1f, %.1f",code,city,state,latitude,longitude);
	}
	
}
