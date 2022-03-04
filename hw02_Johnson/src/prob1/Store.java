package prob1;
import emps.Employee;

public class Store {
	private int numEmps;
	private Employee[] emps = new Employee[20];
		
	public Store() {
		numEmps= 0;
	}
	
		
	public void addEmployee(Employee e) {
		if(numEmps < emps.length) {
			emps[numEmps++] = e;
		}
	}
		
	public Employee getEmployee(int i) {
		
		if(i < 0) {
			return null;
		}
		if(i < numEmps) {
			return emps[i];
		}
		else {
			return null;
		}
	}
		
	public Employee getEmployeeWithName(String findName) {
		if(numEmps != 0) {
			for(int i = 0; i < numEmps; i++) {
				if(findName.equals(emps[i].getName())) {
					return emps[i];
				}
				else {
					return null;
					}
				}
			}
			return null;
	}
	
	public int getNumEmployees() {
		return numEmps;
	}
	
	public double getTotalHours() {
		double hrs = 0;
		for(int i = 0; i < numEmps; i++) {
			hrs += emps[i].getTotalHours();
		}
		return hrs;
	}
	
	public double getTotalPay() {
		double pay = 0;
		for (int i = 0; i < numEmps; i++) {
			pay += emps[i].getPay();
		}
		return pay;
	}
	
	public Employee removeEmployee(int i) {
		if(i < 0) {
			return null;
		}
		Employee e = emps[i];
		for(int j = i; j < numEmps; j++) {
			emps[j+1] = emps[j];
		}
		
		--numEmps;
		return e;
			
		
	}
	
	@Override
	public String toString() {
		String msgHead =  String.format("Payroll Report\n\n Num Employees:%d, total hrs:%0.2f, total pay=$%0.2f\n", getNumEmployees(), getTotalHours(), getTotalPay());;
		String msgNameHrs;
		String msgDet;
		String msgNameHrsDet;
		StringBuilder fullStr = new StringBuilder(msgHead);
		for(int i = 0; i <numEmps; i++) {
			msgNameHrs = String.format("Pay Stub\n--------\n Name:%s, Pay Rate $%0.2f\n Hours:Mon:%0.2f Tue:%d Wed:%0.2f Thu:%0.2f Fri:%0.2f Sat:%0.2f Sun:%0.2f\n", 
					emps[i].getName(), emps[i].getPayRate(), 
					emps[i].getHours(0), emps[i].getHours(1), emps[i].getHours(2), emps[i].getHours(3), emps[i].getHours(4), emps[i].getHours(5), emps[i].getHours(6));
			msgDet = String.format("Days worked:%d, Total Hours:%0.2f\n Weekday hours:%0.2f, Weekend Hours:%0.2f\n Total Pay: #%0.2f\n", 
					emps[i].getNumDaysWorked(), emps[i].getTotalHours(), emps[i].getWeekdayHours(), emps[i].getWeekendHours(), emps[i].getPay());
			msgNameHrsDet = msgNameHrs + msgDet;
			fullStr.append(msgNameHrsDet);
			
			
			
		}
		
	return fullStr.toString();		
		
	}
	
}
	



