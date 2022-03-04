package prob1;

public class HighAltitudeClassicYellowCake extends ClassicYellowCake{
	
	public HighAltitudeClassicYellowCake(String cakeMix) {
		super(cakeMix);
	}
	
	public String getCakeMix() {
		 String str = super.getCakeMix(); 
		 str += " 2lbs of flour";
		 return str;
	}
	
	public String bake() {
		return "Bake at 375 degrees F 26 minutes";
	}

}
