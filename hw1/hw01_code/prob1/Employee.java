package prob1;

public class Employee {
	private double[] hours = new double[7];
	private String name;
	private double payRate;
	
	Employee(String name, double payRate){
		this.name = name;
		this.payRate = payRate;
	}
	
	
	public void seHours(int day, double hours) {
		
	}
	
	public String getName() {
		return name;
	}
	
}
