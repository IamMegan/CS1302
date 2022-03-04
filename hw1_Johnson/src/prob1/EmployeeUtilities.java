package prob1;

public class EmployeeUtilities {

	public EmployeeUtilities() {}
	
	public Employee[] getEmployeeWithMostHours(Employee[] emps) {
		
		Employee[] mostHours = new Employee[emps.length];
		for(int i = 0; i < emps.length; i++) {
			Employee e = emps[i];
			if(e.getTotalHours() > mostHours[i]) {
				
				mostHours = e.getTotalHours();
			}
			
			
		}
		
		
	}
	
	public double[] getHoursArray(Employee[] emps) {
		double totMaxHours[] = new double[emps.length];
		for(int i = 0; i < emps.length; i++) {
			Employee e = emps[i];
			totMaxHours[i] = e.getTotalHours();
		}
		return totMaxHours;
	}
	
	public double getTotalPay(Employee[] emps) {
		double absPay = 0;
		for(int i = 0; i < emps.length; i++) {
			Employee e = emps[i];
			absPay += e.getPay();
		}
		
		return absPay;
	}
	
	
}
