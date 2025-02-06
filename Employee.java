package Tasks2;

public class Employee extends Person {

	private long EmployeeID = 1001;
	private long Salary = 18000 ;
	
	public Employee(String name, int age, long employeeID, long salary) {
		super(name, age);
		EmployeeID = employeeID;
		Salary = salary;
	}
	
	public void getEmployeeData() {
		System.out.println("Employee ID is " + EmployeeID + " and Salary is "+ Salary);
	}


}
