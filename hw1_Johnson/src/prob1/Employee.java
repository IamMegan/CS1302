package prob1;

public class Employee {
	private double[] hours = new double[7];
	private String name;
	private double payRate;
	
	Employee(String name, double payRate){
		this.name = name;
		this.payRate = payRate;
	}
	
	public void newWeek() {
		for(int i = 0; i < hours.length; i++)
			hours[i] = 0;
	}
	
	public void setHours(int day, double hours) {
		this.hours[day] = hours;
	}
	public double getHours(int day) {
		return hours[day];
	}
	
	public double getWeekdayHours() {
		double hourSum = 0;
		for(int i = 0; i < 5; i++) {
			hourSum += hours[i];
		}
		return hourSum; 
	}
	
	public double getTotalHours() {
		return getWeekendHours() + getWeekdayHours();
	}
	
	public double getWeekendHours() {
		return hours[5] + hours[6];
	}
	
	public int getNumDaysWorked() {
		int workCount = 0;
		for(double i : hours) {
			if(i != 0) {
				workCount++;
			}
		}
		return workCount;
	}
	
	public double getPayRate() {
		return payRate;
	}
	
	public double getPay() {
		double weekPay = 0;
		double weekendPay = 0;
		double overPay = 0;
		double totPay = 0;
		if(getWeekdayHours() <= 40) {
			weekPay = getWeekdayHours() * payRate;
		}
		else {
			weekPay = 40 * payRate;
			overPay = (getWeekdayHours() - 40) * 1.5 * payRate;
		}
		weekendPay = getWeekendHours() * 2;
		
		totPay = weekPay + overPay + weekendPay;
		
		if(getNumDaysWorked() == 7) {
			totPay += 50;
		}
		return totPay;
	}
	
	public void mergeEmployee(Employee e) {
		for(int i = 0; i <hours.length; i++) {
			hours[i] += e.getHours(i);
		}
	}
	
	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
	
	}
	
	@Override
	public String toString() {
	String msg =	"Pay Stub\n" +
					"--------\n" +
					"Name:" + name + ", Pay Rate " + payRate + "\n" +
					"Mon:" + hours[0] + " Tue:" + hours[1] + " Wed:" + hours[2] + " Thu:" + hours[3] + " Fri:" + hours[4] + " Sat:" + hours[5] + " Sun:" + hours[6] + "\n" +
					"Days worked:" + getNumDaysWorked() + ", Total Hours:" + getTotalHours() + "\n" +
					"Weekday Hours:" + getWeekdayHours() +  ", Weekend hours: " + getWeekendHours() + "\n" +
					"Total Pay: " + getPay();
	return msg;
	}
}
